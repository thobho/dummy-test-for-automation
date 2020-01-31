package com.deviniti

import junit.framework.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import java.lang.IllegalStateException
import kotlin.test.DefaultAsserter.fail
import kotlin.test.fail


@RunWith(Suite::class)
@SuiteClasses(SuitPartOne::class, SuitPartTwo::class)
class JunitTestSuite

class SuitPartOne{
    @Test
    fun pass(){
        throw NullPointerException();
    }
}

class SuitPartTwo{
    @Test
    fun failtThis(){
    }
}