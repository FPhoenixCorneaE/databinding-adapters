package com.fphoenixcorneae.databinding.adapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter(
    value = [
        "adapter",
        "layoutManager"
    ],
    requireAll = false
)
fun RecyclerView.initRecycler(
    adapter: RecyclerView.Adapter<*>? = null,
    layoutManager: RecyclerView.LayoutManager? = LinearLayoutManager(context),
) {
    adapter?.also {
        this.adapter = it
    }
    layoutManager?.also {
        this.layoutManager = it
    }
}