package com.example.less_17.domain.usecase

import com.example.less_17.domain.model.Note
import com.example.less_17.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private  val noteRepository: NoteRepository
){

    fun deleteNote(note: Note) = noteRepository.deleteNote(note)

}
