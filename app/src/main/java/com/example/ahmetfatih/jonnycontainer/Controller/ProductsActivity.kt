package com.example.ahmetfatih.jonnycontainer.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.ahmetfatih.jonnycontainer.Adaptor.ProductsAdapter
import com.example.ahmetfatih.jonnycontainer.R
import com.example.ahmetfatih.jonnycontainer.Services.DataService
import com.example.ahmetfatih.jonnycontainer.Utilities.EXTRA_URUN
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adaptor : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val gelen = intent.getStringExtra(EXTRA_URUN)
        adaptor = ProductsAdapter(this, DataService.urunGetir(gelen))
        urunListesi.adapter = adaptor
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
        val yonetici = GridLayoutManager(this,spanCount)
        urunListesi.layoutManager = yonetici
    }
}
