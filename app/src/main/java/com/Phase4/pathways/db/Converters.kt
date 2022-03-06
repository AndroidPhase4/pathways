package com.Phase4.pathways.db

import androidx.room.TypeConverter
import com.Phase4.pathways.Models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }

}