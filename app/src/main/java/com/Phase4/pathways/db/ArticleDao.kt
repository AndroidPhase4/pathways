package com.Phase4.pathways.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.Phase4.pathways.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article) : Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}

// Interface defined functions on  how to access/write local database
// onConflict if it already exist in database it will replace it in the DB
// Upsert stands for insert and update