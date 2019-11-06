package jp.techacademy.kinugawa.mikako.kotlinlog2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("映画","たろう",30)
        human1.say()
        human1.think()


        val human2 = Human("読書","はなこ",28)
        human2.say()
        human2.think()

    }
}
