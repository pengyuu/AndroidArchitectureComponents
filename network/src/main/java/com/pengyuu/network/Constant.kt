package com.pengyuu.network

object Constant {
    lateinit var BASE_URL: String

    init {
        when (BuildConfig.BUILD_TYPE) {
            "release" -> {
                BASE_URL = "http://release.com"
            }
            "debug" -> {
                BASE_URL = "http://debug.com"
            }
            "release_preview" -> {
                BASE_URL = "http://release_preview"
            }
        }
    }
}
