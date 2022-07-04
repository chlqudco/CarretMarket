package com.chlqudco.develop.carretmarket.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity
import com.chlqudco.develop.carretmarket.databinding.ItemProductBinding

class ProductListAdapter: RecyclerView.Adapter<ProductListAdapter.ProductItemViewHolder>() {

    //상품 리스트 담고 있는 배열
    private var productList: List<ProductEntity> = listOf()
    //클릭 되었을 때 할 일
    private lateinit var itemClickedListener: (ProductEntity) -> Unit

    inner class ProductItemViewHolder(private val binding: ItemProductBinding, val itemClickedListener: (ProductEntity)->Unit): RecyclerView.ViewHolder(binding.root){

        fun bindData(data: ProductEntity) = with(binding){

        }

        fun bindViews(data: ProductEntity){
            binding.root.setOnClickListener {
                itemClickedListener(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        return ProductItemViewHolder(ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false), itemClickedListener)
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        holder.bindData(productList[position])
        holder.bindViews(productList[position])
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    //외부에서 상품과 리스너를 달기 위해 작성한 함수
    fun setProductList(productList: List<ProductEntity>, itemClickedListener: (ProductEntity) -> Unit = { }){
        this.productList = productList
        this.itemClickedListener = itemClickedListener
        notifyDataSetChanged()
    }
}