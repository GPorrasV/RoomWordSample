package com.example.roomwordsample

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.roomwordsample.Word
import kotlinx.coroutines.flow.Flow


//Room es una capa de base de datos sobre una base de datos SQLite.
@Dao
interface WordDao {
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): Flow<List<Word>>

    //Si tiene una anotación ya declara, asi como insert, no se necesita proporcionar SQL
    //OnConflict permite que no se inserte una palabra nueva, si ya hay otra guardada con el mismo nombre
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}