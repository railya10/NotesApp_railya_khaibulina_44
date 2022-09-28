package com.example.notesapp_railya_khaibulina_44.data.mapper

import com.example.notesapp_railya_khaibulina_44.data.model.NoteEntity
import com.example.notesapp_railya_khaibulina_44.domain.model.Note

fun Note.noteToNoteEntity() = NoteEntity(
    id = id,
    title = title,
    text = text
)

fun NoteEntity.noteEntityToNote() = Note(
    id = id,
    title = title,
    text = text
)


