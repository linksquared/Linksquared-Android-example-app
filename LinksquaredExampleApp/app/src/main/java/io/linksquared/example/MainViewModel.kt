package io.linksquared.example

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var incomingLinkState by mutableStateOf("")
        private set

    fun updateState(newValue: String) {
        incomingLinkState = newValue
    }
}