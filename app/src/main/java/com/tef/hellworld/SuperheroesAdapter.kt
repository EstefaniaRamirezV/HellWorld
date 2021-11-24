package com.tef.hellworld

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class SuperheroesAdapter(private val superheroesList: ArrayList<SuperheroItem>) : RecyclerView.Adapter<SuperheroesAdapter.SuperheroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_superheroe_item, parent, false)
        return SuperheroViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val superhero = superheroesList[position]
        holder.bind(superhero)
    }

    override fun getItemCount(): Int = superheroesList.size

    class SuperheroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        private var aliasTextView:  TextView = itemView.findViewById(R.id.alias_text_view)
        private var pictureImageView: ImageView = itemView.findViewById(R.id.picture_image_view)

        fun bind(superhero: SuperheroItem){
            Log.d("nombre", superhero.name)
            nameTextView.text = superhero.name
            aliasTextView.text = superhero.alias
            Picasso.get().load(superhero.urlPicture).into(pictureImageView)
        }
    }

}