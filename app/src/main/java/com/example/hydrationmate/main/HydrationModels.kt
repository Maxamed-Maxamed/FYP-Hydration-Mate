package com.example.hydrationmate.main


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
class HydrationModels {

    @Parcelize
    data class Hydration(
        val id: Int,
        val name: String,
        val description: String,
        val image: String
    ): Parcelable



}