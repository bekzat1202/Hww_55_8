package com.saliev1353.myapplication.ui

@Suppress("UNREACHABLE_CODE")
class MyMath {
    fun add(a: Int, b: Int): Int {
        return a+b
    }
    fun de(a: Int, b: Int): Int {
        return a-b
    }
    fun ge(a: Int, b: Int): Int {
        return a/b
    }
    fun vr(a: Int, b: Int): Int {
        return a*b
    }
    fun getText(some: String): String {
        var text = some
        val words = text.split(" ")
        val newText = words.last()  + words.subList(1, words.size - 1).joinToString(" ") + " " + words.first()
        return  newText.replace("\\d+".toRegex(), "")
    }
}