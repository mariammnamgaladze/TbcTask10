package com.example.tbctask10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tbctask10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val productsAdapter : ProductsAdapter by lazy {
        ProductsAdapter()
    }
    private val categoryAdapter : CategoryAdapter by lazy {
        CategoryAdapter()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        start()

    }

    private fun start(){
        setUpRecycler()
        listeners()
    }

    private fun setUpRecycler(){
        binding.recyclerViewItems.adapter = productsAdapter
        binding.recyclerViewCategories.adapter = categoryAdapter

        selectedProductsList.addAll(productsList)
        productsAdapter.notifyDataSetChanged()
    }

    private fun listeners(){
        categoryAdapter.onCategoryClick={ category ->
            clickCategory(category)
        }
    }

    private fun clickCategory (category: Category){
        selectedProductsList.clear()
        productsList.forEach {
            if (it.category.contains(category)){
                selectedProductsList.add(it)
            }
        }
        productsAdapter.notifyDataSetChanged()

    }
}