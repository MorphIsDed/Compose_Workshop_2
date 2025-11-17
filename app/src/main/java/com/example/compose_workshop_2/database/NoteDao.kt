package com.example.compose_workshop_2.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("SELECT * FROM notes_table ORDER BY timestamp DESC")
    fun getAllNotes(): LiveData<List<Note>>

    @Query("DELETE FROM notes_table")
    suspend fun deleteAll()
}