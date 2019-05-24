package com.example.demo.repository

import com.example.demo.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository <Note, Long>
