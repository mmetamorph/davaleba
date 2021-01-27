package com.example.davaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val products = ArrayList<Product>()
        products.add(Product(1, "Pinterest", R.drawable._23552975_368694421001617_2006158181250637948_n))
        products.add(Product(2,"LinkedIn", R.drawable._2641243_2308463156101232_924211828920156160_n))
        products.add(Product(3, "Twitter", R.drawable._27447961_2629325724023965_6860064555959535187_n))
        products.add(Product(4, "Instagram", R.drawable._33010745_2864362310466968_785474398360999338_n))
        products.add(Product(5, "Viber", R.drawable._5404083_252350839292727_1970620725861548032_n))
        products.add(Product(6, "Reddit", R.drawable._5429692_588290218607265_6854784851141197824_n))
        products.add(Product(7, "Youtube", R.drawable._6357301_2223887364572913_886068061155622912_n))
        products.add(Product(8, "Instagram", R.drawable._8386258_299567364006856_3740913297885495296_n))
        products.add(Product(9, "WhatsApp", R.drawable._8407028_2424360240912248_270679520577585152_n))

        val adapter = productAdapter(products)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}