package com.example.ahmetfatih.jonnycontainer.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.LayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.ahmetfatih.jonnycontainer.Adaptor.CategoryAdapter
import com.example.ahmetfatih.jonnycontainer.Adaptor.CategoryRecycleAdapter
import com.example.ahmetfatih.jonnycontainer.Model.Kategori
import com.example.ahmetfatih.jonnycontainer.R
import com.example.ahmetfatih.jonnycontainer.Services.DataService
import com.example.ahmetfatih.jonnycontainer.Utilities.EXTRA_URUN
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adaptor : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adaptor = CategoryRecycleAdapter(this,DataService.kategoriler) {oylesine->
            val urunIntent = Intent(this, ProductsActivity::class.java)
            urunIntent.putExtra(EXTRA_URUN,oylesine.title)
            startActivity(urunIntent)
        }

        kategoriListesi.adapter = adaptor

        val yonetici = LinearLayoutManager(this)
        kategoriListesi.layoutManager = yonetici
        kategoriListesi.setHasFixedSize(true)
    }
}
