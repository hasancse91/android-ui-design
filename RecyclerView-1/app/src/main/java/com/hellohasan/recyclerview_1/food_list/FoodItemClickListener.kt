package com.hellohasan.recyclerview_1.food_list

interface FoodItemClickListener {
    fun onItemClicked(position: Int)
    fun onFavoriteIconClicked(position: Int)
}