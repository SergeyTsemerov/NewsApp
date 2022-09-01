package com.sergeytsemerov.newsapp.db

import androidx.room.TypeConverter
import com.sergeytsemerov.newsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String? {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}