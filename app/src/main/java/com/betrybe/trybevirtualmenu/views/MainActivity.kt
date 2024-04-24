package com.betrybe.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.betrybe.trybevirtualmenu.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.trybevirtualmenu.adapters.MenuAdapter
import com.betrybe.trybevirtualmenu.models.Dish
import android.content.Intent

class MainActivity : AppCompatActivity(), MenuAdapter.OnDishClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.main_menu)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MenuAdapter(this)
    }

    override fun onDishClick(dish: Dish) {
        val intent = Intent(this, MenuItemDetailActivity::class.java)
        intent.putExtra("DISH_ID", dish.id)
        intent.putExtra("DISH_NAME", dish.name)
        intent.putExtra("DISH_IMAGE", dish.image)
        intent.putExtra("DISH_DESCRIPTION", dish.description)
        intent.putExtra("DISH_PRICE", dish.price)
        startActivity(intent)
    }
}
