package com.testmap.cmake

object Keys {

    init {
        System.loadLibrary("native-lib")
    }

    external fun apiKey(): String
}