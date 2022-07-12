package com.example.tbctask10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tbctask10.databinding.LayoutCategoryBinding

typealias onCategoryClick= (category:Category) -> Unit

class CategoryAdapter:RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    private val category = Category.values().toList()
    lateinit var onCategoryClick:onCategoryClick

    inner class ViewHolder(var binding:LayoutCategoryBinding):
            RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutCategoryBinding.inflate(
                LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = category[position]
        holder.binding.scrollCategory.text = currentItem.categoryName
        holder.binding.root.setOnClickListener{onCategoryClick(currentItem)}
    }

    override fun getItemCount(): Int = category.size
}