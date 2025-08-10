package com.fphoenixcorneae.databinding.adapters.edittext

import androidx.databinding.BindingAdapter
import com.fphoenixcorneae.baseui.edittext.SuffixEditText

@BindingAdapter(value = ["suffixText", "suffixColor"], requireAll = false)
fun setSuffix(view: SuffixEditText, text: String?, color: Int) {
    view.suffixText = text
    view.suffixColor = color
}

@BindingAdapter("onTextChanged")
fun onTextChanged(view: SuffixEditText, onTextChanged: SuffixEditText.OnTextChanged) {
    view.setOnTextChanged(onTextChanged)
}