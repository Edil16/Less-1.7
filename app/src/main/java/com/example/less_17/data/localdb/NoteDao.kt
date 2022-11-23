package com.example.less_17.data.localdb

import androidx.room.*
import com.example.less_17.data.model.NoteEntity

@Dao
interface NoteDao {

    //CRUD
    //C - create
    //R - read
    //U - update
    //D - delete

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    fun getAllNotes():List<NoteEntity>

    @Update
    fun editNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)
}