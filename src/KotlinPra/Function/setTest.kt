package KotlinPra.Function

import java.lang.StringBuilder

fun main() {
    val set = hashSetOf(1, 2, 3)
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    val list = arrayListOf(6, 7, 8)
    map.put(6, "666")
    map[0] = "Two"
    for ((key, value) in map) {
        println("$key : $value")
    }
    println(list.max())
    println(list.last())

    //在调用函数时，如果指明了一个参数名称，为避免混淆，之后的所有参数都必须标明名称
    println(joinToString(set, seperator = " ", prefix = "{", postfix = "}"))
}

fun <T> joinToString(
        collection: Collection<T>,
        seperator: String = ",",    //指定默认参数的值
        prefix: String = "[",
        postfix: String = "]"
) : String {
    val res = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) res.append(seperator)
        res.append(element)
    }
    res.append(postfix)
    return res.toString()
}