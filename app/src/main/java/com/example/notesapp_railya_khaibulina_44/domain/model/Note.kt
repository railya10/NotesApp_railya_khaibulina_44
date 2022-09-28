package com.example.notesapp_railya_khaibulina_44.domain.model

data class Note(
    val id: Int = DEFAULT_ID,
    val title: String,
    val text: String
) {
    companion object {
        const val DEFAULT_ID = 0
    }
}
