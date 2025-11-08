package ru.otus.homework.homework

fun main() {
    check(3 == varArgSum(1, 2))
    check(6 == varArgSum(1, 2, 3))
    check(10 == varArgSum(1, 2, 3, 4))
    //Ошибка компиляции, если параметров меньше двух
    //check(10 == varArgSum(1))
}

fun varArgSum(a1: Int, a2: Int, vararg a3: Int): Int {
    val mandatoryPart = a1 + a2
    var optionalPart = 0
    for (optionalNumber in a3) {
        optionalPart += optionalNumber
    }
    return mandatoryPart + optionalPart
}