package com.example.notesapp_railya_khaibulina_44

import android.app.Application
import androidx.room.Room
import com.example.notesapp_railya_khaibulina_44.data.localdb.NoteDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    companion object {
        lateinit var roomDatabase: NoteDatabase
    }

    override fun onCreate() {
        super.onCreate()
        roomDatabase = Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java,
            "note_db"
        ).allowMainThreadQueries()
            .build()
    }
}