package com.selfpro.realies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.selfpro.realies.R
import com.selfpro.realies.databinding.ItemPreferenceBinding
import com.selfpro.realies.util.base.BaseListAdapter

class PreferenceAdapter : BaseListAdapter<String, ItemPreferenceBinding>(R.layout.item_preference) {
    override fun action(data: String, binding: ItemPreferenceBinding, position: Int) {
        binding.tvText.text = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(
            ItemPreferenceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
}