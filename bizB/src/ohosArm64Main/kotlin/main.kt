import kotlinx.atomicfu.*

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

// ========== AtomicFu 测试函数 (使用 kotlinx.atomicfu 库) ==========

// 原子整数计数器 (使用 atomic() 函数)
val atomicCounter = atomic(0)

fun incrementAtomicCounter(): Int {
    return atomicCounter.incrementAndGet()
}

fun decrementAtomicCounter(): Int {
    return atomicCounter.decrementAndGet()
}

fun getAtomicCounterValue(): Int {
    return atomicCounter.value
}

fun setAtomicCounterValue(value: Int) {
    atomicCounter.value = value
}

fun addToAtomicCounter(delta: Int): Int {
    return atomicCounter.addAndGet(delta)
}

fun compareAndSetAtomicCounter(expected: Int, newValue: Int): Boolean {
    return atomicCounter.compareAndSet(expected, newValue)
}

// 原子长整数操作
val atomicLongCounter = atomic(0L)

fun incrementAtomicLongCounter(): Long {
    return atomicLongCounter.incrementAndGet()
}

fun getAtomicLongCounterValue(): Long {
    return atomicLongCounter.value
}

fun setAtomicLongCounterValue(value: Long) {
    atomicLongCounter.value = value
}

fun addToAtomicLongCounter(delta: Long): Long {
    return atomicLongCounter.addAndGet(delta)
}

// 原子引用操作
val atomicStringRef = atomic<String?>(null)

fun setAtomicString(value: String?) {
    atomicStringRef.value = value
}

fun getAtomicString(): String? {
    return atomicStringRef.value
}

fun compareAndSetAtomicString(expected: String?, newValue: String?): Boolean {
    return atomicStringRef.compareAndSet(expected, newValue)
}

// 线程安全计数器类
class ThreadSafeCounter {
    private val count = atomic(0)
    
    fun increment(): Int = count.incrementAndGet()
    fun decrement(): Int = count.decrementAndGet()
    fun get(): Int = count.value
    fun set(value: Int) { count.value = value }
    fun reset() { count.value = 0 }
    fun addAndGet(delta: Int): Int = count.addAndGet(delta)
}

// 原子累加列表
fun atomicSumIntList(numbers: List<Int>): Int {
    val sum = atomic(0)
    numbers.forEach { number ->
        sum.addAndGet(number)
    }
    return sum.value
}

// 原子更新最大值
fun atomicFindMax(numbers: List<Int>): Int {
    if (numbers.isEmpty()) return Int.MIN_VALUE
    val max = atomic(numbers[0])
    numbers.forEach { number ->
        var current: Int
        do {
            current = max.value
            if (number <= current) break
        } while (!max.compareAndSet(current, number))
    }
    return max.value
}

// 原子更新最小值
fun atomicFindMin(numbers: List<Int>): Int {
    if (numbers.isEmpty()) return Int.MAX_VALUE
    val min = atomic(numbers[0])
    numbers.forEach { number ->
        var current: Int
        do {
            current = min.value
            if (number >= current) break
        } while (!min.compareAndSet(current, number))
    }
    return min.value
}
