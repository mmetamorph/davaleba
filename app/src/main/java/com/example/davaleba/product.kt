package com.example.davaleba

import androidx.annotation.DrawableRes

data class Product(
    val id: Int,
    val title: String,
    @DrawableRes
    val image: Int
)
