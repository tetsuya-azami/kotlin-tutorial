package object_oriented_syntax

// constructor修飾子は省略するのが一般的
//class Human(name: String, age: Int) {
//    // プロパティ
//    // javaのフィールドとは違いデフォルトでgetterとsetterを持つ
//    // setterを設けたくない場合はvalで定義する
//    var name = "名無し"
//
//    var age = 20
//        // setterの上書き
//        // 慣習的にvalueという名前を使用する
//        set(value) {
//            if (value < 0) {
//                throw IllegalArgumentException("年齢は0以上でなければなりません。")
//            } else {
//                field = value
//            }
//        }
//    var age = 20;
//
//    init {
//        this.name = name;
//        this.age = age;
//    }
//}

// getterだけを外部提供してsetterを作成しない
// privateにすると他クラスからgetterもアクセス不可になるので基本的にはこの定義の仕方がちょうど良さそう
class Human(val name: String, val age: Int) {
    fun intro() {
        println("私の名前は${name}, 年は${age}です。")
    }
}