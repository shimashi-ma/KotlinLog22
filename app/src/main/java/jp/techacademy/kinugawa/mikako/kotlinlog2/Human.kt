package jp.techacademy.kinugawa.mikako.kotlinlog2

import android.util.Log

class Human: Animal, Thinkable {

    var hobby: String

    constructor(hobby: String,name: String,age: Int):super(name,age){
        this.hobby = hobby
    }

    //Animal抽象クラスのメソッドをオーバーライド
    override  fun say() {
        Log.d("kotlintest","私の名前は" +this.name +"です。年は" +this.age +"歳です。")
    }

    //Thinkableインターフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest","私は" + this.hobby + "について考える。")
    }

}