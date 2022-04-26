package com.example.recyclerviewevi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MotivasiAdapter:RecyclerView.Adapter<MotivasiAdapter.ViewHolder>() {
    // deklarasikan dataset
    private var foto = intArrayOf(R.drawable.albertenstein, R.drawable.abrahamli, R.drawable.briantracyjpeg)
    private var kata = arrayOf("Cobalah untuk tidak menjadi seorang yang SUKSES, tapi jadipah seorang yang BERNILAI", "Beri saya waktu enam jam untuk menebang pohon dan saya akan menghabiskan empat jam pertama untuk menajamkan kapaknya","Apapun yang kita harapkan dengan percaya diri, akan menjadi ramalan yang terpenuhi dengan sendirinya")
    private var tokoh = arrayOf("Albert Einstein", "Abraham Lincoln", "Brian Tracy")

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
       //instance pallete cardview
        var itemFoto:ImageView
        var kata:TextView
        var tokoh:TextView

        init {
            itemFoto = itemView.findViewById(R.id.item_foto)
            kata = itemView.findViewById(R.id.kata)
            tokoh = itemView.findViewById(R.id.tokoh)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.bagian_cardview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemFoto.setImageResource(foto[position])
        holder.kata.text = kata[position]
        holder.tokoh.text = tokoh[position]
    }

    override fun getItemCount(): Int {
        //digunakan untuk menghitung jumlah data yang kita punya
        return kata.size

    }
}