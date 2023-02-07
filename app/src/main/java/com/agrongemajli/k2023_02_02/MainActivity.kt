package com.agrongemajli.k2023_02_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val oncreate: String = "ONCREATE"
    private val onstart: String = "ONSTART"

    private val tag: String = "GemaSoftware"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(tag, "CALL to onCREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "CALL to onSTART")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "CALL to onPAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "CALL to onSTOP")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "CALL to onRESUME")
    }
}