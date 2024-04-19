package com.nexign.testJava.day2

/**
 * Определите метод maxElement, который принимает массив целых чисел и возвращает максимальный элемент массива. Определите метод minElement, который принимает массив целых чисел и возвращает минимальный элемент массива. Определите метод average, который принимает массив целых чисел и возвращает среднее арифметическое элементов массива. Создайте массив numbers из 10 случайных целых чисел в диапазоне от 1 до 100. Выведите массив numbers на экран с помощью метода println(). Вычислите и выведите на экран максимальный, минимальный и средний элементы массива numbers с помощью определенных ранее методов maxElement, minElement и average. Используя оператор if, проверьте, является ли среднее арифметическое элементов массива больше 50. Если да, выведите сообщение "Среднее арифметическое больше 50". Если нет, выведите сообщение "Среднее арифметическое меньше или равно 50". Используя оператор for, выведите на экран все элементы массива numbers, которые больше среднего арифметического элементов массива.
 */

def maxElement(Integer[] digits) {
    return digits.max()
}


def minElement(Integer[] digits) {
    return digits.min()
}

def averageElement(Integer[] digits) {
    digits.average()
}

(1..100).collect()
