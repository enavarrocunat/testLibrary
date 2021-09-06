package com.flit2go.library


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun myHello(name: String): String {
        return "Hello, ${name}!"
    }
}
