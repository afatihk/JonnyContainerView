package com.example.ahmetfatih.jonnycontainer.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ahmetfatih.jonnycontainer.R
import com.example.ahmetfatih.jonnycontainer.Utilities.EXTRA_URUN
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val gelen = intent.getStringExtra(EXTRA_URUN)
        urunText.text = gelen
    }
}
