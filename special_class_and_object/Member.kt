package special_class_and_object

// equals, toString, componentN, copyなどがあらかじめ定義されている
// dataクラスのあらかじめ定義されているメソッドはプライマリコンストラクタで設定されたプロパティだけを対象としている
data class Member(val name: String) {
    var age: Int = 0
}

data class DetailedMember(val name: String, val job: String, val age: Int)

fun main() {
    val member1 = Member("新井")
    member1.age = 50
    val member2 = Member("新井")
    member2.age = 33

    // equalsメソッドはプライマリコンストラクタのフィールド同士が一致しているかで同値性の判断をする
    // == でequalsメソッドを呼び出す
    println()
    println("equals")
    println(member1 == member2) // true

    // toStringメソッドもプライマリコンストラクタで設定されたフィールド値だけを出力する
    println()
    println("toString")
    println(member2) // Member(name=新井)

    println()
    println("分割代入")
    // data classは分割代入ができる
    val triple = Triple("海崎", "フリーター", 27)
    val (name, job, age) = triple
    println(name)
    println(job)
    println(age)
    println()
    println("components")
    println("componentName: ${triple.component1()}")
    println("componentJob: ${triple.component2()}")
    println("componentAge: ${triple.component3()}")

    println()
    println("copy")
    val original = DetailedMember("メンバー", "フリーター", 24)
    // 特定の値だけ上書きしてインスタンスをコピーする
    val copied = original.copy(age = 100)
    println("original: ${original}, copied: ${copied}")
}