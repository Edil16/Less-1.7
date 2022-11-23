package com.example.less_17.domain.repository

import com.example.less_17.domain.model.Note

interface NoteRepository {

    fun createNote(note: Note)

    fun getAllNotes():List<Note>

    fun editNote(note: Note)

    fun deleteNote(note: Note)

}