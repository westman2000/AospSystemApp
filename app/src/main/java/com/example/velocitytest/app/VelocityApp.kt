package com.example.velocitytest.app

import android.app.Application
import android.util.Log
import com.example.velocitytest.VelocityShell

class VelocityApp: Application() {


    override fun onCreate() {
        super.onCreate()

        Log.d(this::class.java.canonicalName, "shell output: ${VelocityShell.executeShell()}")
    }
}