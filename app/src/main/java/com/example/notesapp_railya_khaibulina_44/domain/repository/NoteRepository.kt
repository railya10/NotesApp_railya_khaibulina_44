package com.example.notesapp_railya_khaibulina_44.domain.repository

import com.example.notesapp_railya_khaibulina_44.domain.model.Note

interface NoteRepository {

    fun createNote(note: Note)

    fun editNote(note: Note)

    fun deleteNote(note: Note)

    fun getAllNotes()
}