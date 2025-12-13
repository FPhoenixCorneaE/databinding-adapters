package com.fphoenixcorneae.databinding.adapters.indicator

import androidx.core.graphics.toColorInt
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.fphoenixcorneae.baseui.HorizontalSlidingIndicator

@BindingAdapter(
    value = [
        "hsiBackgroundColor",
        "hsiIndicatorColor",
        "hsiCornerRadius",
        "hsiIndicatorRatio",
        "hsiBindRecyclerView"
    ],
    requireAll = false
)
fun HorizontalSlidingIndicator.config(
    backgroundColor: String? = null,
    indicatorColor: String? = null,
    cornerRadius: Float? = null,
    indicatorRatio: Float? = null,
    recyclerView: RecyclerView? = null
) {
    runCatching {
        backgroundColor?.toColorInt()?.let {
            this.indicatorBackgroundColor = it
        }
    }
    runCatching {
        indicatorColor?.toColorInt()?.let {
            this.indicatorColor = it
        }
    }
    indicatorRatio?.let {
        this.indicatorRatio = it.coerceAtLeast(0f).coerceAtMost(1f)
    }
    cornerRadius?.let {
        this.cornerRadius = it * resources.displayMetrics.density
    }
    recyclerView?.let {
        bindRecyclerView(it)
    }
}