package com.example.notesapp_railya_khaibulina_44.data.localdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notesapp_railya_khaibulina_44.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}