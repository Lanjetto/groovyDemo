package com.nexign.testJava.two

import com.nexign.testJava.one.TestImortClass

class HelloGroovyClass {
    def printHello() {
        println("Hello world")
    }

    static void main(String[] args) {
        int digit = 5
        def digit1 = 10

        digit1 = "String"
        def imortClass = new TestImortClass()

        def method = imortClass.secondMethod()
        println(method)

        def method1 = imortClass.firstMethod(10)
        println(method1)
        assert 2 + 2 == 4 * 4

//
//        def a = new HelloGroovyClass()
//        a.printHello()
//
//        println(imortClass.digit)



//        println("----------------------")
//        println("Enter a name: ")
//        println("Hello " + new Scanner(System.in).nextLine())
//        println("----------------------")
//        println("Enter a name: ")
//        println("Hello " + new BufferedReader(new InputStreamReader(System.in)).readLine())
//          println("----------------------")
//          println("Enter a name: ")
//          System.in.newReader().readLine().eachLine {println("Hello $it")}
    }
}
