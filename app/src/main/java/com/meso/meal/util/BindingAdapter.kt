package com.meso.meal.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.meso.meal.R


@BindingAdapter("image_url")
fun imageFromUrl(imageView: ImageView, url: String? = null) {
    try {
        Glide.with(imageView.context)
            .load(url!!)
            .load(R.drawable.ic_launcher_background)
            .into(imageView)
    } catch (e: Exception) {
        print(e.message)
    }
}

@BindingAdapter("bind_data")
fun bindData (recyclerView: RecyclerView,list: List<Any>?){
    val adapter = recyclerView.adapter as ListAdapter<*,*>
    adapter.submitList(list!! as List<Nothing>)
}