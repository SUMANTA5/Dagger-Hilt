package com.sumanta.daggerhilt.damo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val wheel: Wheel
) {
    fun gatCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "Care is Going")
    }
}