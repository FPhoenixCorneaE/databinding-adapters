package com.fphoenixcorneae.databinding.adapters.edittext

import androidx.databinding.BindingAdapter
import com.fphoenixcorneae.baseui.edittext.PrefixEditText

@BindingAdapter(value = ["prefixText", "prefixColor"], requireAll = false)
fun setPrefix(view: PrefixEditText, text: String?, color: Int) {
    view.prefixText = text
    view.prefixColor = color
}

@BindingAdapter("onTextChanged")
fun onTextChanged(view: PrefixEditText, onTextChanged: PrefixEditText.OnTextChanged) {
    view.setOnTextChanged(onTextChanged)
}