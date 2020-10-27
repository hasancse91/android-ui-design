package com.hellohasan.recyclerview_1.model

interface FoodModel {
    fun getFoodList(): MutableList<Food>
    fun getFoodItemById(id: Int): Food
}