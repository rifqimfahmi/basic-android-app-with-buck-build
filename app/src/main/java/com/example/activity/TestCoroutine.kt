package com.example.activity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TestCoroutine {

    fun testCoroutine() {
        GlobalScope.launch(Dispatchers.Main) {
            kotlinx.coroutines.delay(1000)
            java.lang.System.out.println("Hi coroutine worked")
        }

        GlobalScope.launch(Dispatchers.IO) {
            kotlinx.coroutines.delay(1000)
            java.lang.System.out.println("Hi coroutine worked")
        }

        GlobalScope.launch(Dispatchers.Default) {
            kotlinx.coroutines.delay(1000)
            java.lang.System.out.println("Hi coroutine worked")
        }
    }
}