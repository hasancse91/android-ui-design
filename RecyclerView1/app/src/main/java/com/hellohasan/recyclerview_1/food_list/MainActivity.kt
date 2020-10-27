package com.hellohasan.recyclerview_1.food_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.hellohasan.recyclerview_1.R
import com.hellohasan.recyclerview_1.model.FoodModel
import com.hellohasan.recyclerview_1.model.FoodModelImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var foodModel: FoodModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFoodList()
    }

    private fun showFoodList() {
        foodModel = FoodModelImpl()

        val foodList = foodModel.getFoodList()

        val adapter = FoodListAdapter(foodList, object : FoodItemClickListener {

            override fun onItemClicked(position: Int) {
                showToast(foodList[position].name)
            }

            override fun onFavoriteIconClicked(position: Int) {
                showToast("Icon: ${foodList[position].name}")
            }

        })

        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}