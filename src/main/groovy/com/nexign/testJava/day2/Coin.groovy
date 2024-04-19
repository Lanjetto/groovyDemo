package com.nexign.testJava.day2

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
class Coin {
    private Integer value = 1
    private String material = "bronze"

    Coin(Integer value, String material) {
        this.value = value
        this.material = material
    }

    def plus(Coin coin) {
        return new Coin(this.value + coin.value, "bronze")
    }

    def plus(Crystal crystal) {
        return new Coin(this.value * crystal.value, "bronze")
    }


    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                ", material='" + material + '\'' +
                '}';
    }


}