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

// ========== AtomicFu 测试函数 ==========

@CName("bizA_atomic_increment")
fun atomicIncrementWrapper(): Int {
    return incrementAtomicCounter()
}

@CName("bizA_atomic_decrement")
fun atomicDecrementWrapper(): Int {
    return decrementAtomicCounter()
}

@CName("bizA_atomic_get")
fun atomicGetWrapper(): Int {
    return getAtomicCounterValue()
}

@CName("bizA_atomic_set")
fun atomicSetWrapper(value: Int) {
    setAtomicCounterValue(value)
}

@CName("bizA_atomic_add")
fun atomicAddWrapper(delta: Int): Int {
    return addToAtomicCounter(delta)
}

@CName("bizA_atomic_compare_and_set")
fun atomicCompareAndSetWrapper(expected: Int, newValue: Int): Boolean {
    return compareAndSetAtomicCounter(expected, newValue)
}

// AtomicLong 测试
@CName("bizA_atomic_long_increment")
fun atomicLongIncrementWrapper(): Long {
    return incrementAtomicLongCounter()
}

@CName("bizA_atomic_long_get")
fun atomicLongGetWrapper(): Long {
    return getAtomicLongCounterValue()
}

@CName("bizA_atomic_long_set")
fun atomicLongSetWrapper(value: Long) {
    setAtomicLongCounterValue(value)
}

@CName("bizA_atomic_long_add")
fun atomicLongAddWrapper(delta: Long): Long {
    return addToAtomicLongCounter(delta)
}

// AtomicReference<String?> 测试
@CName("bizA_atomic_string_set")
fun atomicStringSetWrapper(value: String?) {
    setAtomicString(value)
}

@CName("bizA_atomic_string_get")
fun atomicStringGetWrapper(): String? {
    return getAtomicString()
}

@CName("bizA_atomic_string_compare_and_set")
fun atomicStringCompareAndSetWrapper(expected: String?, newValue: String?): Boolean {
    return compareAndSetAtomicString(expected, newValue)
}

// 原子操作列表函数
@CName("bizA_atomic_sum_int_list")
fun atomicSumIntListWrapper(numbers: List<Int>): Int {
    return atomicSumIntList(numbers)
}

@CName("bizA_atomic_find_max")
fun atomicFindMaxWrapper(numbers: List<Int>): Int {
    return atomicFindMax(numbers)
}

@CName("bizA_atomic_find_min")
fun atomicFindMinWrapper(numbers: List<Int>): Int {
    return atomicFindMin(numbers)
}
