package com.example.velocitytest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class VelocityReceiver : BroadcastReceiver() {


    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null && Intent.ACTION_BOOT_COMPLETED == intent.action) {
            Log.d(this::class.java.canonicalName, "shell output: ${VelocityShell.executeShell()}")
        }
    }
}