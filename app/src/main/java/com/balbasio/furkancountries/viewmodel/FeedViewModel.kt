package com.balbasio.furkancountries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.balbasio.furkancountries.model.Country

class FeedViewModel: ViewModel() {
    val countries=MutableLiveData<List<Country>>()
    val countryLoading=MutableLiveData<Boolean>()
    val countryError=MutableLiveData<Boolean>()
    fun refreshData(){

        val country=Country("Turkey","Asia","Ankara","TRY","Turkish","www.cc.com")
        val country2=Country("France","Europe","Paris","EUR","French","www.cf.com")
        val country3=Country("Germany","Europe","Berlin","EUR","German","www.cg.com")

        val countryList= arrayListOf<Country>(country,country2,country3)
        countries.value=countryList
        countryError.value=false
        countryLoading.value=false


    }
}