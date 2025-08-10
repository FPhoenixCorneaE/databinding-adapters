package com.fphoenixcorneae.databinding.adapters.edittext

import androidx.databinding.BindingAdapter
import com.fphoenixcorneae.baseui.edittext.EmojiDisableEditText

@BindingAdapter("disableEmoji")
fun disableEmoji(view: EmojiDisableEditText, disable: Boolean) {
    view.disableEmoji(disableEmoji = disable)
}