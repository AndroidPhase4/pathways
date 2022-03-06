package com.Phase4.pathways

import androidx.room.Entity

@Entity(
    tableName = "articles"
)
data class Article(
    var id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)