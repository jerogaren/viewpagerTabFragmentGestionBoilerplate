package dev.ronronea.viewpagertabfragmentgestionboilerplate.ui.fragment1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment 1"
    }
    val text: LiveData<String> = _text
}