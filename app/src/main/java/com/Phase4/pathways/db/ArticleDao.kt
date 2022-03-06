package com.Phase4.pathways.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.Phase4.pathways.Models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(article: Article)

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    fun deleteArticle(article: Article)
}