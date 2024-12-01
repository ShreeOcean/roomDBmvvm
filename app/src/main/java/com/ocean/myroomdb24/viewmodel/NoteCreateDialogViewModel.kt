package com.ocean.myroomdb24.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteCreateDialogViewModel : ViewModel(){

    val text = MutableLiveData<String>()
    init {
        text.value = ""
    }
}