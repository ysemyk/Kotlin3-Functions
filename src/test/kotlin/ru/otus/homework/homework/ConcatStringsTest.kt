package ru.otus.homework.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ConcatStringsTest {

    @Test
    fun concatenationTest() {
        assertEquals("str1 str2 str3", concatStrings("str1", "str2", "str3"))
        assertEquals("str1,str2,str3", concatStrings("str1", "str2", "str3", separator = ','))
    }

}