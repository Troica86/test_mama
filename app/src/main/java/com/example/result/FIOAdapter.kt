package com.example.result


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FIOAdapter(private val fioList: List<FIO>) : RecyclerView.Adapter<FIOViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FIOViewHolder {
        val fioItemView =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_info, parent, false)
        return FIOViewHolder(fioItemView)
    }

    override fun onBindViewHolder(holder: FIOViewHolder, position: Int) {
        val fio = fioList[position]
        holder.bind(fio)
    }

    override fun getItemCount(): Int {
        return fioList.size
    }
}
