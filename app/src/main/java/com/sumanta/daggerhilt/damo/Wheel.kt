package com.sumanta.daggerhilt.damo

import android.util.Log
import javax.inject.Inject

class Wheel {

    @Inject
    constructor()
    fun getWheel(){
        Log.d("main","Wheel is Going")
    }

}