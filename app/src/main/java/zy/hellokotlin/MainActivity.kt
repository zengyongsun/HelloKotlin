package zy.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun String.firstChar(): String {
        if (this.length == 0) {
            return ""
        }
        return this[0].toString()
    }
}
