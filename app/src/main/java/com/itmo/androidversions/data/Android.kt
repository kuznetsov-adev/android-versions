package com.itmo.androidversions.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Android(
    val title: String,
    @DrawableRes val imageAndroid: Int,
    @DrawableRes val posterAndroid: Int,
    val overview: String,
    val releaseDate: String,
    val trailerUrl: String
) : Parcelable
