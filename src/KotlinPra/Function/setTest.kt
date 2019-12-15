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

    //�ڵ��ú���ʱ�����ָ����һ���������ƣ�Ϊ���������֮������в����������������
    println(joinToString(set, seperator = " ", prefix = "{", postfix = "}"))
}

fun <T> joinToString(
        collection: Collection<T>,
        seperator: String = ",",    //ָ��Ĭ�ϲ�����ֵ
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