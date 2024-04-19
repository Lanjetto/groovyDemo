package com.nexign.testJava.day2

import java.util.stream.IntStream

class CoinApp {
    static void main(String[] args) {
//        def goldCoin = new Coin(5, "blonze")
//
//        def bronzeCoin = new Coin(3, "blonze")
//        def bronzeCoin1 = new Coin(3, "blonze")
//        println(bronzeCoin == bronzeCoin1)
//
//        def bank = [alex:goldCoin, stas: bronzeCoin1]

        def random = new Random().ints(0, 100)
        random.each {println(it)}



//        def crystal = new Crystal(value: 10)
//        def coin = goldCoin + bronzeCoin
//        println(coin.value)
//
//        def crystalCoin = crystal + bronzeCoin
//        println(crystalCoin.value)

    }
}
