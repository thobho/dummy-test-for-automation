package com.deviniti

import junit.framework.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import kotlin.test.DefaultAsserter.fail


@RunWith(Suite::class)
@SuiteClasses(SuitPartOne::class, SuitPartTwo::class)
class JunitTestSuite


class SuitPartOne{
    @Test
    fun pass(){

    }
}

class SuitPartTwo{
    @Test
    fun failtThis(){
    }
}