package com.example.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Esta clase describirá la entidad (que representará la tabla SQLite) para tus palabras.
//Se crean instancias de objetos a partir de filas en la base de datos.
//Las anotaciones sirven para crear una asociación entre la clase y la base de datos
@Entity(tableName = "word_table")
data class Word (@PrimaryKey @ColumnInfo(name = "word") val word:String)


