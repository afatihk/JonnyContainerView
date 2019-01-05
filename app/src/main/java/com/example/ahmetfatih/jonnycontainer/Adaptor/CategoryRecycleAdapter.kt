package com.example.ahmetfatih.jonnycontainer.Adaptor

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ahmetfatih.jonnycontainer.Model.Kategori
import com.example.ahmetfatih.jonnycontainer.R

class CategoryRecycleAdapter(val icerik : Context, val siniflandirma : List<Kategori>,
                             val secme : (Kategori)->Unit)
    : RecyclerView.Adapter<CategoryRecycleAdapter.IcAlem>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): IcAlem {
        val gorunum = LayoutInflater.from(icerik)
            .inflate(R.layout.kategori_liste_elemani, p0,false)
        return IcAlem(gorunum, secme)
    }

    override fun getItemCount(): Int {
        return siniflandirma.count()
    }

    override fun onBindViewHolder(p0: IcAlem, p1: Int) {
        p0.baglama(icerik, siniflandirma[p1])
    }

    inner class IcAlem(itemView: View, val secme: (Kategori) -> Unit) : RecyclerView.ViewHolder(itemView){
        val resim = itemView.findViewById<ImageView>(R.id.kategoriResmi)
        val isim = itemView.findViewById<TextView>(R.id.kategoriİsmi)

        fun baglama (context: Context, sinif: Kategori){
            val kaynakId = context.resources.getIdentifier(sinif.img, "drawable", context.packageName)
            resim.setImageResource(kaynakId)
            isim.text = sinif.title

            itemView.setOnClickListener { secme(sinif) }
        }
    }
}