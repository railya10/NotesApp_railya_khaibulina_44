package com.example.notesapp_railya_khaibulina_44

import android.app.Application
import androidx.room.Room
import com.example.notesapp_railya_khaibulina_44.data.localdb.NoteDataBase

class App : Application() {
    companion object {
        lateinit var roomDatabase: NoteDataBase
    }

    override fun onCreate() {
        super.onCreate()
        roomDatabase = Room.databaseBuilder(
            applicationContext,
            NoteDataBase::class.java,
            "note_db"
        ).allowMainThreadQueries()
            .build()
    }
}