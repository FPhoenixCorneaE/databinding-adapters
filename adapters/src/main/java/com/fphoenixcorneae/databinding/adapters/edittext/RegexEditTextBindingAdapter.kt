package com.fphoenixcorneae.databinding.adapters.edittext

import androidx.databinding.BindingAdapter
import com.fphoenixcorneae.baseui.edittext.RegexEditText

@BindingAdapter("regex")
fun setRegex(view: RegexEditText, regex: List<String>) {
    view.setRegex(*regex.toTypedArray())
}