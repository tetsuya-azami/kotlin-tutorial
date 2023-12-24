package special_class_and_object

class OuterClass(val name: String) {
    // OuterClassのメンバにアクセスしたい場合はprivateではなくinnerを使用する
    inner class InnerClass {
        fun show() {
            println("InnerClassのshowが呼ばれました。OuterClassのnameは${name}です。")
            println(this@OuterClass.name)
        }
    }
}

fun main() {
    val outerClass = OuterClass("hoge")
    outerClass.InnerClass().show()
}