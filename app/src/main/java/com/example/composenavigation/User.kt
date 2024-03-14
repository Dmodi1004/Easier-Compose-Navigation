package com.example.composenavigation

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.time.LocalDateTime

@Parcelize
data class User(
    val name: String,
    val id: String,
    val created: LocalDateTime
): Parcelable
