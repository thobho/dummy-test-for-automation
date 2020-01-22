package com.deviniti

import junit.framework.Assert.fail
import org.junit.Test
import java.lang.RuntimeException
import kotlin.test.assertTrue

class Test {


    @Test
    fun pass(){

    }

    @Test
    fun failThis(){
        fail()
    }

    @Test
    fun error(){
        throw RuntimeException("example message")
    }


}