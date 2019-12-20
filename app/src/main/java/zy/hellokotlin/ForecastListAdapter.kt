package zy.hellokotlin

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 *    @author : Zeyo
 *    e-mail : zengyongsun@163.com
 *    date   : 2019/12/20 10:34
 *    desc   :
 *    version: 1.0
 */
class ForecastListAdapter(val items: List<String>) :
    RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}
