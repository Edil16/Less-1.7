package com.example.less_17.data.mapper

import com.example.less_17.data.model.NoteEntity
import com.example.less_17.domain.model.Note

fun Note.toEntity() = NoteEntity(
    id,
    title,
    description,
    createAt
)

fun NoteEntity.toNote() = Note(
    id,
    title,
    description,
    createAt
)