package com.example.notesapp_railya_khaibulina_44.domain.repository

import com.example.notesapp_railya_khaibulina_44.domain.model.Note
import com.example.notesapp_railya_khaibulina_44.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun createNote(note: Note) : Flow<Resource<Unit>>

    fun editNote(note: Note): Flow<Resource<Unit>>

    fun deleteNote(note: Note): Flow<Resource<Unit>>

    fun getAllNotes() : Flow<Resource<List<Note>>>
}