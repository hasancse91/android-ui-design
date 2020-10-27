package com.hellohasan.recyclerview_1.food_list

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.hellohasan.recyclerview_1.R
import kotlinx.android.synthetic.main.item_food.view.*

class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val ivFood: AppCompatImageView = itemView.findViewById(R.id.iv_food)
    val tvFoodName: AppCompatTextView = itemView.findViewById(R.id.tv_food_name)
    val tvPriceValue: AppCompatTextView = itemView.tv_price_value
    val ivFavorite = itemView.iv_favorite as AppCompatImageView // another way of casting
}