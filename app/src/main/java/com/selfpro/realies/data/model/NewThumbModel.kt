package com.selfpro.realies.data.model

import android.graphics.Bitmap

data class NewThumbModel(
    val title: String,
    val thumbImage: String,
    val createdAt: String,
    val broadCasterImage: String,
    val subThumb: List<SubThumbModel>
) {
    data class SubThumbModel(
        val title: String,
        val createdAt: String
    )
    fun getThumbImage(): String {
//        return "${App.baseUrl}/surveys/image/get?image=${image}"
        return ""
    }

    fun getBroadCasterImage(): String {
        return ""
    }
}