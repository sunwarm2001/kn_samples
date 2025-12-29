fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

// Int 类型测试函数
fun multiplyNumbers(a: Int, b: Int): Int {
    return a * b
}

fun subtractNumbers(a: Int, b: Int): Int {
    return a - b
}

fun absoluteValue(x: Int): Int {
    return kotlin.math.abs(x)
}

fun maxInt(a: Int, b: Int): Int {
    return kotlin.math.max(a, b)
}

fun minInt(a: Int, b: Int): Int {
    return kotlin.math.min(a, b)
}

// String 类型测试函数
fun concatenateStrings(str1: String, str2: String): String {
    return str1 + str2
}

fun stringLength(str: String): Int {
    return str.length
}

fun reverseString(str: String): String {
    return str.reversed()
}

fun uppercaseString(str: String): String {
    return str.uppercase()
}

fun lowercaseString(str: String): String {
    return str.lowercase()
}

fun substringFromIndex(str: String, start: Int, end: Int): String {
    if (start < 0 || end > str.length || start >= end) {
        return ""
    }
    return str.substring(start, end)
}

// Vector (List) 类型测试函数 - Int List
fun sumIntList(numbers: List<Int>): Int {
    return numbers.sum()
}

fun multiplyIntList(numbers: List<Int>): Int {
    return numbers.fold(1) { acc, n -> acc * n }
}

fun maxInIntList(numbers: List<Int>): Int {
    return numbers.maxOrNull() ?: 0
}

fun minInIntList(numbers: List<Int>): Int {
    return numbers.minOrNull() ?: 0
}

fun averageIntList(numbers: List<Int>): Int {
    if (numbers.isEmpty()) return 0
    return numbers.average().toInt()
}

fun countIntList(numbers: List<Int>): Int {
    return numbers.size
}

// Vector (List) 类型测试函数 - String List
fun concatenateStringList(strings: List<String>): String {
    return strings.joinToString("")
}

fun concatenateStringListWithSeparator(strings: List<String>, separator: String): String {
    return strings.joinToString(separator)
}

fun countStringList(strings: List<String>): Int {
    return strings.size
}

fun findLongestString(strings: List<String>): String {
    return strings.maxByOrNull { it.length } ?: ""
}

fun findShortestString(strings: List<String>): String {
    return strings.minByOrNull { it.length } ?: ""
}

// 混合类型测试函数
fun processIntListAndString(numbers: List<Int>, str: String): String {
    val sum = numbers.sum()
    return "$str: $sum"
}

fun processStringListAndInt(strings: List<String>, multiplier: Int): List<String> {
    return strings.map { it.repeat(multiplier) }
}
