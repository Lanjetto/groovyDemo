package com.nexign.testJava.day2

import groovy.transform.Canonical


@Canonical
class Person {
     int age

     def propertyMissing(String arg, Object arg1) {
          Person.metaClass.arg1 = arg
     }

     static void main(String[] args) {
          def person = new Person()
          person.metaClass.name = {x -> x + 1 }
          println person.name(5)
          Person.metaClass.lastName = "Ivanov"
          def person1 = new Person()
         person1.lastName = "Petrov"

          person1.foo = "foo"

          println(person1.arg1)


     }
}





