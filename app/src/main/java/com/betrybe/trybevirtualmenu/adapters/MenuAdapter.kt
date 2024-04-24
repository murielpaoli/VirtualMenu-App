package com.betrybe.trybevirtualmenu.adapters

import com.betrybe.trybevirtualmenu.models.DataMenu
import com.betrybe.trybevirtualmenu.models.Dish
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView
import android.widget.ImageView
import com.betrybe.trybevirtualmenu.R
import android.view.ViewGroup
import android.view.LayoutInflater

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    private val dishes: List<Dish> = DataMenu().getDishes()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.item_menu_name)
        val image: ImageView = view.findViewById(R.id.item_menu_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dish = dishes[position]
        holder.name.text = dish.name
        holder.image.setImageResource(dish.image)
    }

    override fun getItemCount() = dishes.size
}