package special_class_and_object

class MyClass {
    // Kotlinではstaticなメンバはcompanion objectとして定義する
    companion object {
        fun create(): MyClass = MyClass()
    }
}

fun main() {
    val myInstance = MyClass.create()
    println(myInstance)

    fun <T> genericFunction(array: Array<T>): T {
        return array.first()
    }

    val array = arrayOf(1, 2, 3)
    val result = genericFunction<Int>(array)
    println()
    println("配列の最初の要素は${result}")
}