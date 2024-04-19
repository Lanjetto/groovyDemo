package com.nexign.testJava.day3

/**
 * Слово с минимальным числом символов Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */
class Task5 {
    def static findString(String str) {
        def strArr = str.split()
        def wordMap = [:]

        for (word in strArr) {
            def charMap = [:]
            for (character in word)
                if (charMap.containsKey(character)) {
                    charMap[character] +=1
                } else {
                    charMap.put(character, 1)
                }
            wordMap.put(word, charMap)
        }

        def values = wordMap.values()
        def max = 0
        def key =""
        for (index in values) {

            def val = index.max {it.value}.value
            if (val > max) {
                max = val
            }
        }

        println()
    }

    static void main(String[] args) {
        findString("fffff ab f 1234 jkjk 7777777 gfgfgfgfgfgfg")


        def inputString = "f ab fffff 1234 jkjk"
        def words = inputString.split("\\s+")

        def wordWithMinUniqueChars = words.min { word ->
            word.toSet().size()
        }

        println "Слово с минимальным числом уникальных символов: $wordWithMinUniqueChars"
    }






}
