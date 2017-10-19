package com.sunfusheng.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("--->", "a + b = ${sum(1, 1)}")

        val C1: String = ""
        var items = listOf("", "")

    }

    private fun sum(a: Int, b: Int): Int = a + b
}
