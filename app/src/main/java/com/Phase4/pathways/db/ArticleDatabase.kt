package com.Phase4.pathways.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.Phase4.pathways.models.Article


// list of Entities 1 table only
// List default version 1
@Database(
    entities = [Article::class],
    version = 1
)


@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase() {

    // Abstract function that returns itemDAO
    abstract fun getArticleDao(): ArticleDao
    
    companion object {
        @Volatile
        private var instance: ArticleDatabase? = null
        // Synchronize only 1 instance of DB
        private val LOCK = Any()

        // create instance of Database using invoke function
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it}
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_db.db"
            ).build()

    }
}