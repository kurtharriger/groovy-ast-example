package com.kurtharriger.groovy.transform.tests

import com.kurtharriger.groovy.transform.WithLogging

class LoggingASTTransformationTest extends  GroovyTestCase {

    @WithLogging
    void testGreet() {
      println "Hello World"
    }


}