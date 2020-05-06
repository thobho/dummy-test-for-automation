package com.deviniti

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)

class ParametrizedTest(val n: Int) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "test: {0}")
        fun testParameters(): List<Int> {
            return (1..1300).toList()
        }
    }

    @Test
    fun test(){
        print("test $n")
    }
}