package com.example.result


import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FIOViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(fio: FIO) {
        val fioTextView: TextView=itemView.findViewById(R.id.name_text_view)
        fioTextView.text=fio.name

        val ioTextView:TextView=itemView.findViewById(R.id.io_text_view)
        ioTextView.text=fio.io


    }
}