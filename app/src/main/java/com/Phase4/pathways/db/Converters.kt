package com.Phase4.pathways.db

import androidx.room.TypeConverter
import com.Phase4.pathways.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        // convert that source to string by returning name only
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        // whenever we have a string we convert to source class
        return Source(name, name)
    }

}