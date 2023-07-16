package com.example.a160420124_marcelladivaviorent_healthcareumc.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.a160420124_marcelladivaviorent_healthcareumc.model.Event

class EventListViewModel(application: Application): AndroidViewModel(application) {
    val eventsLD = MutableLiveData<ArrayList<Event>>()
    val eventLoadErrorLD = MutableLiveData<Boolean>()
    val loadingLD = MutableLiveData<Boolean>()
}