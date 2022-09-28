package com.example.notesapp_railya_khaibulina_44.data.localdb

import androidx.room.*
import com.example.notesapp_railya_khaibulina_44.data.model.NoteEntity

@Dao
interface NoteDao {  //CRUD

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createNote (noteEntity: NoteEntity)

    @Query ("SELECT * FROM")
    suspend fun getAllNotes() : List <NoteEntity>

    @Update
    suspend fun editNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)


}