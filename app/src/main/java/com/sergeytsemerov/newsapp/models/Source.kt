package com.sergeytsemerov.newsapp.models

import android.os.Parcel
import kotlinx.parcelize.Parceler

data class Source(
    val id: String?,
    val name: String?
)

object SourceParceler : Parceler<Source> {
    override fun create(parcel: Parcel) = Source(parcel.readString(), parcel.readString())

    override fun Source.write(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(name)
    }
}