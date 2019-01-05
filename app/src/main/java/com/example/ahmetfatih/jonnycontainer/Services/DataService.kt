package com.example.ahmetfatih.jonnycontainer.Services

import com.example.ahmetfatih.jonnycontainer.Model.Kategori
import com.example.ahmetfatih.jonnycontainer.Model.Urun

object DataService {

    val kategoriler = listOf(
        Kategori("SHİRT", "shirtimage"),
        Kategori("HOODİES", "hoodieimage"),
        Kategori("HATS", "hatimage"),
        Kategori("DİGİTAL", "digitalgoodsimage"),
        Kategori("SHİRT", "shirtimage"),
        Kategori("HOODİES", "hoodieimage"),
        Kategori("HATS", "hatimage"),
        Kategori("DİGİTAL", "digitalgoodsimage"),
        Kategori("SHİRT", "shirtimage"),
        Kategori("HOODİES", "hoodieimage"),
        Kategori("HATS", "hatimage"),
        Kategori("DİGİTAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Urun("DevslopesGrapicBoonie","hat1","18$"),
        Urun("DevslopesHatBlack","hat2","20$"),
        Urun("DevslopesGrapicBoonie","hat3","18$"),
        Urun("DevslopesGrapicBoonie","hat4","22$"),
        Urun("DevslopesGrapicBoonie","hat1","18$"),
        Urun("DevslopesHatBlack","hat2","20$"),
        Urun("DevslopesGrapicBoonie","hat3","18$"),
        Urun("DevslopesGrapicBoonie","hat4","22$"),
        Urun("DevslopesGrapicBoonie","hat1","18$"),
        Urun("DevslopesHatBlack","hat2","20$"),
        Urun("DevslopesGrapicBoonie","hat3","18$"),
        Urun("DevslopesGrapicBoonie","hat4","22$")
    )

    val hoodies = listOf(
        Urun("Hoody Gray","hoodie1","28$"),
        Urun("Hoody Red","hoodie2","32$"),
        Urun("Gray Hoody","hoodie3","28$"),
        Urun("Red Hoody","hoodie4","32$"),
        Urun("Hoody Gray","hoodie1","28$"),
        Urun("Hoody Red","hoodie2","32$"),
        Urun("Gray Hoody","hoodie3","28$"),
        Urun("Red Hoody","hoodie4","32$"),
        Urun("Hoody Gray","hoodie1","28$"),
        Urun("Hoody Red","hoodie2","32$"),
        Urun("Gray Hoody","hoodie3","28$"),
        Urun("Red Hoody","hoodie4","32$")
    )

    val shirts = listOf(
        Urun("Shirt 1 ","shirt1","18$"),
        Urun("Shirt 2","shirt2","20$"),
        Urun("Shirt 3","shirt3","25$"),
        Urun("Shirt 4","shirt4","35$"),
        Urun("Shirt 4","shirt5","35$"),
        Urun("Shirt 1 ","shirt1","18$"),
        Urun("Shirt 2","shirt2","20$"),
        Urun("Shirt 3","shirt3","25$"),
        Urun("Shirt 4","shirt4","35$"),
        Urun("Shirt 4","shirt5","35$"),
        Urun("Shirt 1 ","shirt1","18$"),
        Urun("Shirt 2","shirt2","20$"),
        Urun("Shirt 3","shirt3","25$"),
        Urun("Shirt 4","shirt4","35$"),
        Urun("Shirt 4","shirt5","35$")
    )

    val digitalGoods = listOf<Urun>()

    fun urunGetir(sinifi: String) : List<Urun>{
        return when(sinifi){
            "SHİRT" -> shirts
            "HOODİES" -> hoodies
            "HATS" -> hats
            else -> digitalGoods
        }
    }
}