package com.example.app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.data.Book
import android.widget.TextView

class BookAdapter(
    private val items: List<Book>,
    private val onClick: (Int) -> Unit
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    inner class BookViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle = view.findViewById<TextView>(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return BookViewHolder(v)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.tvTitle.text = items[position].title
        holder.view.setOnClickListener { onClick(position) }
    }

    override fun getItemCount(): Int = items.size
}
