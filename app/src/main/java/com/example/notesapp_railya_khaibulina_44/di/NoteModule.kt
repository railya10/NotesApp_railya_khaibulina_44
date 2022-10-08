package com.example.notesapp_railya_khaibulina_44.di

import android.content.Context
import androidx.room.Room
import com.example.notesapp_railya_khaibulina_44.data.localdb.NoteDao
import com.example.notesapp_railya_khaibulina_44.data.localdb.NoteDatabase
import com.example.notesapp_railya_khaibulina_44.data.repository.NoteRepositoryImpl
import com.example.notesapp_railya_khaibulina_44.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(
        @ApplicationContext context: Context
    ): NoteDatabase =
        Room.databaseBuilder(
            context,
            NoteDatabase::class.java,
            "note_db"
        ).allowMainThreadQueries()
            .build()

    @Singleton
    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase) = noteDatabase.noteDao()

    @Provides
    fun provideNoteRepository(noteDao: NoteDao): NoteRepository = NoteRepositoryImpl(noteDao)
}



