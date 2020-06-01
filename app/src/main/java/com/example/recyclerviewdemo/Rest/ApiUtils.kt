package com.example.recyclerviewdemo.Rest

class ApiUtils {

   companion object {
       private val LOCAL_URL_TEST = "http://192.168.225.210:8080/Matrimony/"

       //private val BASE_URL_TEST = "http://13.233.100.134:8080/Matrimony-0.0.1-SNAPSHOT/"

       private val BASE_URL_TEST = "https://api.openweathermap.org/data/2.5/"

       private val BASE_URL_LIVE = "https://jabvmet.com/jabvmet-api/"


       fun getAPIService(): ApiInterface {

            return ApiClient.getClient(BASE_URL_TEST)!!.create(ApiInterface::class.java)

            // return ApiClient.getClient(BASE_URL_TEST)!!.create(ApiInterface::class.java!!)
        }
    }
}