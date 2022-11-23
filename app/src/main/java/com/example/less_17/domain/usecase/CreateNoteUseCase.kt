package com.example.less_17.domain.usecase

import com.example.less_17.domain.model.Note
import com.example.less_17.domain.repository.NoteRepository

class CreateNoteUseCase(
    private  val noteRepository: NoteRepository
){

    fun createNote(note: Note) = noteRepository.createNote(note)

}
