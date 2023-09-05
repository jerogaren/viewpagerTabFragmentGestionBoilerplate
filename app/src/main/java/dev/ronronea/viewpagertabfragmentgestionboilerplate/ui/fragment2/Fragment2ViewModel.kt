package dev.ronronea.viewpagertabfragmentgestionboilerplate.ui.fragment2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fragment 2"
    }
    val text: LiveData<String> = _text
}