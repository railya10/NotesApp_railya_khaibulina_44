package com.example.notesapp_railya_khaibulina_44.data.repository

import com.example.notesapp_railya_khaibulina_44.App
import com.example.notesapp_railya_khaibulina_44.data.mapper.noteToNoteEntity
import com.example.notesapp_railya_khaibulina_44.domain.model.Note
import com.example.notesapp_railya_khaibulina_44.domain.repository.NoteRepository

class NoteRepositoryImpl : NoteRepository {

    private val noteDao = App.roomDatabase.noteDao()

    override fun createNote(note: Note) {
        noteDao.createNote(note.noteToNoteEntity())
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.noteToNoteEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.noteToNoteEntity())
    }

    override fun getAllNotes() {
       noteDao.getAllNotes()
    }
}