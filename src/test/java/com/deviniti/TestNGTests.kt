package com.deviniti

import org.testng.annotations.Test
import kotlin.test.fail

class TestNGTests{


    @Test
    fun testNgTestPassed(){
        print("thi is test")
    }

    @Test
    fun failNGTest(){
        print("thi is test")
        fail("Failed test")
    }

}