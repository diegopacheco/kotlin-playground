package com.example.kmp_fun

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform