package com.example.compose_workshop_2.repository

import androidx.lifecycle.LiveData
import com.example.compose_workshop_2.database.Note
import com.example.compose_workshop_2.database.NoteDao

class NoteRepository(private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }

    suspend fun update(note: Note) {
        noteDao.update(note)
    }

    suspend fun delete(note: Note) {
        noteDao.delete(note)
    }
}