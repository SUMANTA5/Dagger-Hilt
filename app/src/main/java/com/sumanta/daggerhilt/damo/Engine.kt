package com.sumanta.daggerhilt.damo

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()
    fun getEngine(){
        Log.d("main","Engine Stated")
    }

}