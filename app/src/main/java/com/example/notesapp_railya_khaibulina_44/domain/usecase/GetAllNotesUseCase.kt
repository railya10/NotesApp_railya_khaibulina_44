package com.example.notesapp_railya_khaibulina_44.domain.usecase

import com.example.notesapp_railya_khaibulina_44.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun getAllNotes() = noteRepository.getAllNotes()

}