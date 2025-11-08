package ru.otus.homework.homework

fun main() {
    check("str1 str2 str3" == concatStrings("str1", "str2", "str3"))
}

fun concatStrings(vararg strings: String, separator: Char = ' '): String {
    val sb = StringBuilder()
    for ((index, value) in strings.withIndex()) {
        sb.append(value)
        if (index<strings.size-1) {
            sb.append(separator)
        }
    }
    return sb.toString()
}