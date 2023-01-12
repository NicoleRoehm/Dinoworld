package com.example.dino_eggs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.dino_eggs.R
import com.example.dino_eggs.data.Model.Dinos

class DinoAdapter(
    private val context: Context,
    private val dataset: List<Dinos>
) : RecyclerView.Adapter<DinoAdapter.ViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // TODO Schreibe hier deinen Code
        val dinoImage = view.findViewById<ImageView>(R.id.dino_image)
        val dinoName = view.findViewById<TextView>(R.id.dino_nametext)
        val dinoweight = view.findViewById<TextView>(R.id.dino_weighttext)
        val dinoheight = view.findViewById<TextView>(R.id.dino_heighttext)
        val dinoprice = view.findViewById<TextView>(R.id.price_text)

        val dinoSale = view.findViewById<TextView>(R.id.sale_text)

        val buyButton = view.findViewById<Button>(R.id.buy_button)



    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // das itemLayout wird gebaut
        // TODO Schreibe hier deinen Code
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.dino_item, parent, false)

        // und in einem ViewHolder zurückgegeben
        return ViewHolder(adapterLayout)                     //TODO()
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // TODO Schreibe hier deinen Code
        val dino = dataset[position]

        holder.dinoImage.setImageResource(dino.imageResource)

        holder.dinoName.text = dino.name
        holder.dinoprice.text = "${dino.price} Euro"
        holder.dinoweight.text = "${dino.weight} g"
        holder.dinoheight.text = "${dino.height} cm"

        if (dino.isSale == true){
            holder.dinoSale.visibility = View.VISIBLE
        } else{
            holder.dinoSale.visibility = View.INVISIBLE
        }






        holder.buyButton.setOnClickListener {

            Toast.makeText(
                context,
                "${dino.name} wurde in deinen Einkaufswagen gelegt :)",
                Toast.LENGTH_SHORT
            )
                .show()
        }

    }


    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return dataset.size       //TODO()
    }
}