fun main() {
	// type Nullable
	val a = null // ok
	println(a)

	val b: Int? = null // ok
	println(b)

	// val c: Int = null // compile error

	// various arrays
	println()
	println("various arrays:")
	val array = intArrayOf(1,2,3)
	println(array.contentToString())
	val nullArray:Array<String?> = arrayOfNulls(3)
	println(nullArray.contentToString())
	val arrayUsingArrayConstructor = Array(3, {i -> i * 5}) // iはindex
	println(arrayUsingArrayConstructor.contentToString())

	// collections
	println()
	println("colections:")
	val list = listOf(1,1,2,3,5,8)
	println(list)
	val set = setOf(1,1,2,3,5,8)
	println(set)
	val map = mapOf(1 to "one", 2 to "two", 3 to "three")
	println(map)
}
