package com.example.notesapp_railya_khaibulina_44.domain.usecase

import com.example.notesapp_railya_khaibulina_44.domain.model.Note
import com.example.notesapp_railya_khaibulina_44.domain.repository.NoteRepository

class CreateNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun createNote(note: Note) = noteRepository.createNote(note)

}