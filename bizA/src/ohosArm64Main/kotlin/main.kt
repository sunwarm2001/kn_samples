@file:OptIn(kotlin.experimental.ExperimentalNativeApi::class)

@CName("bizA_times_two")
fun timesTwo(x: Int): Int {
    return addNumbers(x, x)
}

// ========== Int 类型测试函数 ==========

@CName("bizA_multiply")
fun multiplyWrapper(a: Int, b: Int): Int {
    return multiplyNumbers(a, b)
}

@CName("bizA_subtract")
fun subtractWrapper(a: Int, b: Int): Int {
    return subtractNumbers(a, b)
}

@CName("bizA_absolute")
fun absoluteWrapper(x: Int): Int {
    return absoluteValue(x)
}

@CName("bizA_max_int")
fun maxIntWrapper(a: Int, b: Int): Int {
    return maxInt(a, b)
}

@CName("bizA_min_int")
fun minIntWrapper(a: Int, b: Int): Int {
    return minInt(a, b)
}

// ========== String 类型测试函数 ==========

@CName("bizA_concatenate_strings")
fun concatenateStringsWrapper(str1: String, str2: String): String {
    return concatenateStrings(str1, str2)
}

@CName("bizA_string_length")
fun stringLengthWrapper(str: String): Int {
    return stringLength(str)
}

@CName("bizA_reverse_string")
fun reverseStringWrapper(str: String): String {
    return reverseString(str)
}

@CName("bizA_uppercase_string")
fun uppercaseStringWrapper(str: String): String {
    return uppercaseString(str)
}

@CName("bizA_lowercase_string")
fun lowercaseStringWrapper(str: String): String {
    return lowercaseString(str)
}

@CName("bizA_substring")
fun substringFromIndexWrapper(str: String, start: Int, end: Int): String {
    return substringFromIndex(str, start, end)
}

// ========== Vector (List<Int>) 类型测试函数 ==========

@CName("bizA_sum_int_list")
fun sumIntListWrapper(numbers: List<Int>): Int {
    return sumIntList(numbers)
}

@CName("bizA_multiply_int_list")
fun multiplyIntListWrapper(numbers: List<Int>): Int {
    return multiplyIntList(numbers)
}

@CName("bizA_max_in_int_list")
fun maxInIntListWrapper(numbers: List<Int>): Int {
    return maxInIntList(numbers)
}

@CName("bizA_min_in_int_list")
fun minInIntListWrapper(numbers: List<Int>): Int {
    return minInIntList(numbers)
}

@CName("bizA_average_int_list")
fun averageIntListWrapper(numbers: List<Int>): Int {
    return averageIntList(numbers)
}

@CName("bizA_count_int_list")
fun countIntListWrapper(numbers: List<Int>): Int {
    return countIntList(numbers)
}

// ========== Vector (List<String>) 类型测试函数 ==========

@CName("bizA_concatenate_string_list")
fun concatenateStringListWrapper(strings: List<String>): String {
    return concatenateStringList(strings)
}

@CName("bizA_concatenate_string_list_with_separator")
fun concatenateStringListWithSeparatorWrapper(strings: List<String>, separator: String): String {
    return concatenateStringListWithSeparator(strings, separator)
}

@CName("bizA_count_string_list")
fun countStringListWrapper(strings: List<String>): Int {
    return countStringList(strings)
}

@CName("bizA_find_longest_string")
fun findLongestStringWrapper(strings: List<String>): String {
    return findLongestString(strings)
}

@CName("bizA_find_shortest_string")
fun findShortestStringWrapper(strings: List<String>): String {
    return findShortestString(strings)
}

// ========== 混合类型测试函数 ==========

@CName("bizA_process_int_list_and_string")
fun processIntListAndStringWrapper(numbers: List<Int>, str: String): String {
    return processIntListAndString(numbers, str)
}

@CName("bizA_process_string_list_and_int")
fun processStringListAndIntWrapper(strings: List<String>, multiplier: Int): List<String> {
    return processStringListAndInt(strings, multiplier)
}
