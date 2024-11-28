package com.vokrob.weather_forecast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vokrob.weather_forecast.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}

























