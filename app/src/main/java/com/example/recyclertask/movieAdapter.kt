package com.example.recyclertask

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var movies: MutableList<movie>) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val movieView =
            LayoutInflater.from(parent.context).inflate(R.layout.custom_layout, parent, false)
        return MyViewHolder(movieView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movies[position]
        holder.bindCharacter(movie)

    }

    override fun getItemCount(): Int {
        return movies.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val nameView: TextView

        private val image: ImageView
        private lateinit var movie: movie

        init {
            nameView = itemView.findViewById(R.id.name)

            image = itemView.findViewById(R.id.image)
            itemView.setOnClickListener {
                val intent: Intent = Intent(itemView.context, info::class.java)
                intent.putExtra("movieInfo", movie)
                startActivity(itemView.context, intent, null)
            }
        }

        fun bindCharacter(movie: movie) {
            this.movie = movie
            nameView.text = movie.name
            image.setImageResource(movie.image)
        }
    }
}

