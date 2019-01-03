package com.example.ahmetfatih.jonnycontainer.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.ahmetfatih.jonnycontainer.Model.Kategori
import com.example.ahmetfatih.jonnycontainer.R
import com.example.ahmetfatih.jonnycontainer.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adaptor : ArrayAdapter<Kategori>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adaptor = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.kategoriler)

        kategoriListesi.adapter = adaptor
    }
}
