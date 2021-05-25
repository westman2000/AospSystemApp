package com.example.velocitytest

import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader

object VelocityShell {

    fun executeShell() : String {
        val command: String = "uname -r"
        var str : String = ""
        try {
            val process: Process = Runtime.getRuntime().exec(command)
            // Read the lines using BufferedReader
            BufferedReader(InputStreamReader(process.inputStream)).forEachLine {
                // Do something on each line read
                Log.d(this::class.java.canonicalName, "$it")

                str = it
            }
        } catch (e: InterruptedException) {
            Log.w(this::class.java.canonicalName, "Cannot execute command [$command].", e)
        } catch (e: Exception) {
            Log.e(this::class.java.canonicalName, "Cannot execute command [$command].", e)
        }
        return str
    }

}