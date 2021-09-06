package com.flit2go.library

import android.content.Context
import android.widget.Toast

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

class myToast (){

    fun showToast(message: String, context: Context){
        Toast.makeText(context,message,Toast.LENGTH_SHORT)
    }
}