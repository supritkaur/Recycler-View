package com.sk.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class recycler : RecyclerView.Adapter<recycler.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recycler.ViewHolder {
        var initview =
            LayoutInflater.from(parent.context).inflate(R.layout.rview
                , parent, false)
        return ViewHolder(initview)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tv1 = view.findViewById<TextView>(R.id.tv1)
        var tv2 = view.findViewById<TextView>(R.id.tv2)
    }

    override fun onBindViewHolder(holder: recycler.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }

}