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
        val holder: ViewHolder

        if (convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.kategori_liste_elemani, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.kategoriResmi)
            holder.categoryName = categoryView.findViewById(R.id.kategoriİsmi)
            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView        }

        val kategory = kategori[position]

        val resourceId = context.resources.getIdentifier(kategory.img, "drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = kategory.title
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


    private class ViewHolder{
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}