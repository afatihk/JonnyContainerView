package com.example.ahmetfatih.jonnycontainer.Adaptor

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ahmetfatih.jonnycontainer.Model.Urun
import com.example.ahmetfatih.jonnycontainer.R

class ProductsAdapter(val icerik : Context, val urunler : List<Urun>) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ProductHolder {
        val gorunum = LayoutInflater.from(icerik).inflate(R.layout.urun_liste_elemani,p0,false)
        return ProductHolder(gorunum)
    }

    override fun getItemCount(): Int {
        return urunler.count()
    }

    override fun onBindViewHolder(p0: ProductHolder, p1: Int) {
        p0.baglama(icerik,urunler[p1])
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val resim = itemView.findViewById<ImageView>(R.id.urunResim)
        val isim = itemView.findViewById<TextView>(R.id.urunIsimi)
        val fiyat = itemView.findViewById<TextView>(R.id.fiyatText)

        fun baglama(context : Context, sinif : Urun){

            val kaynak = context.resources.getIdentifier(sinif.img, "drawable", context.packageName)
            resim.setImageResource(kaynak)
            isim.text = sinif.title
            fiyat.text = sinif.price
        }
    }
}