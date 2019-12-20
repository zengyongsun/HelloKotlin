package zy.hellokotlin

import android.util.Log
import java.net.URL

/**
 *    @author : Zeyo
 *    e-mail : zengyongsun@163.com
 *    date   : 2019/12/20 16:23
 *    desc   :
 *    version: 1.0
 */

public class Request(val url: String) {

    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}