package com.nexign.testJava.day1

import groovy.transform.ToString

@ToString
class Person {
    static int age = 4

    static def asType(Class clazz) {
        if (clazz == Integer) {
            return age
        }
    }
}
