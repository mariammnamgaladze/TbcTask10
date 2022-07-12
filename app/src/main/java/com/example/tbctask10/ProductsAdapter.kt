package com.example.tbctask10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tbctask10.databinding.LayoutProductsBinding

class ProductsAdapter:RecyclerView.Adapter<ProductsAdapter.ViewHolder> (){

    inner class ViewHolder(var binding:LayoutProductsBinding):
            RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutProductsBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = selectedProductsList[position]
        holder.binding.apply {
            TextViewPrice.text = currentItem.price.toString()+" gel"
            TextViewTitle.text = currentItem.title
            imageView.setImageResource(currentItem.image)
        }
    }

    override fun getItemCount(): Int = selectedProductsList.size
}