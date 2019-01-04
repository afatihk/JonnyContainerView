package com.example.ahmetfatih.jonnycontainer.Adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.ahmetfatih.jonnycontainer.Model.Kategori
import com.example.ahmetfatih.jonnycontainer.R

class CategoryAdapter (val context: Context, val kategori: List<Kategori> ): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        categoryView = LayoutInflater.from(context).inflate(R.layout.kategori_liste_elemani, null)
        val kategoriResim : ImageView = categoryView.findViewById(R.id.kategoriResmi)
        val kategoriIsim : TextView = categoryView.findViewById(R.id.kategoriİsmi)
        println("Yüksek Yüksek Yüksek PERFORMANS")

        val kategory = kategori[position]



        val resourceId = context.resources.getIdentifier(kategory.img, "drawable",context.packageName)
        kategoriResim.setImageResource(resourceId)
        println(resourceId)
        kategoriIsim.text = kategory.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return kategori[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return kategori.count()
    }
}