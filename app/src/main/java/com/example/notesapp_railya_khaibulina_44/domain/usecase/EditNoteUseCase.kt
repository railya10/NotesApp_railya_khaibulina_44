package com.example.notesapp_railya_khaibulina_44.domain.usecase

import com.example.notesapp_railya_khaibulina_44.domain.model.Note
import com.example.notesapp_railya_khaibulina_44.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun editNote(note: Note) = noteRepository.editNote(note)

}