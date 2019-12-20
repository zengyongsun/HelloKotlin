package zy.hellokotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList = findViewById<RecyclerView>(R.id.recyclerView)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

        val foreList: RecyclerView = findViewById(R.id.recyclerView)


        doAsync {
            Request("url").run()

            uiThread { longToast("Request performed") }
        }

    }

    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }

    private val items = listOf(
        "Mon 6/23 - Sunny - 31/17",

        "Tue 6/24 - Foggy - 21/8",

        "Wed 6/25 - Cloudy - 22/17",

        "Thurs 6/26 - Rainy - 18/11",

        "Fri 6/27 - Foggy - 21/10",

        "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",

        "Sun 6/29 - Sunny - 20/7"
    )

}
