package com.nexign.testJava.day2

class Disco {
    List<Person> dancers = []

    def adddancer(def person)  {
        if (person.age > 18) {
            dancers << person
        }
    }

    static void main(String[] args) {
        def disco = new Disco()
        def persons = [
                new Person(30),
                new Person(18),
                new Person(17),
                new Person(22),
                new Person(16),
        ]

        def min = persons.stream()
                .map {new Person(age: it.age*2)}
                .filter { it.age > 18 }
                .min { a, b -> a.age <=> b.age }

        println min


   }
}
