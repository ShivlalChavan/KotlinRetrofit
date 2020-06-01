package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewdemo.Rest.ApiInterface
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log
import android.widget.TextView
import com.example.recyclerviewdemo.Rest.ApiUtils
import com.example.recyclerviewdemo.model.Weather
import com.example.recyclerviewdemo.model.WeatherData
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private var mAPIService: ApiInterface? = null
    private lateinit var weatherData: WeatherData

    private  var txtTemperatue:TextView? = null
    private  var txtDescription:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        mAPIService = ApiUtils.getAPIService()
        txtTemperatue = findViewById(R.id.txtTemperature)
        txtDescription = findViewById(R.id.txtDescription)
    }

    override fun onResume() {
        super.onResume()

        callAPIForGetWeatherData()
    }

    private fun callAPIForGetWeatherData() {

        mAPIService!!.getWeatherData().enqueue(object :Callback<WeatherData>{

           override fun onResponse(call: Call<WeatherData>, response: Response<WeatherData>) {

               if(response.isSuccessful){
                   if(response.code()== 200){
                       if(response.body()!=null){
                           weatherData = response.body()!!

                           var gson=Gson()
                           Log.e("responseData:","response - " +gson.toJson(weatherData))

                           setUpData()
                       }


                   }
               }

            }

            override fun onFailure(call: Call<WeatherData>, t: Throwable) {

            }
        })

    }

    private fun setUpData() {
        if(weatherData!=null){

            var main = weatherData.getMain()
            var tempearature = main?.getTemp()

            var weather :List<Weather>? = weatherData.getWeather()

            var description = weather?.get(0)?.getDescription()

            txtTemperatue?.setText(tempearature)

            txtDescription?.setText(description)

        }

    }

}



