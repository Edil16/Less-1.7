package com.example.less_17.data.repository

import com.example.less_17.data.localdb.NoteDao
import com.example.less_17.data.mapper.toEntity
import com.example.less_17.data.mapper.toNote
import com.example.less_17.domain.model.Note
import com.example.less_17.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val noteDao: NoteDao
): NoteRepository {

    override fun createNote(note: Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNotes().map { it.toNote() }
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toEntity())
    }

}