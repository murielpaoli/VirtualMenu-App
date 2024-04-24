package com.betrybe.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.betrybe.trybevirtualmenu.R
import android.widget.TextView
import android.widget.ImageView



class MenuItemDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        val dishId = intent.getIntExtra("DISH_ID", 0)
        val dishName = intent.getStringExtra("DISH_NAME")
        val dishImage = intent.getIntExtra("DISH_IMAGE", 0)
        val dishDescription = intent.getStringExtra("DISH_DESCRIPTION")
        val dishPrice = intent.getDoubleExtra("DISH_PRICE", 0.0)

        val dishNameTextView = findViewById<TextView>(R.id.detail_name)
        val dishImageImageView = findViewById<ImageView>(R.id.detail_image)
        val dishDescriptionTextView = findViewById<TextView>(R.id.detail_description)
        val dishPriceTextView = findViewById<TextView>(R.id.detail_price)

        dishNameTextView.text = dishName
        dishImageImageView.setImageResource(dishImage)
        dishDescriptionTextView.text = dishDescription
        dishPriceTextView.text = dishPrice.toString()
        dishId.toString()

    }
}
