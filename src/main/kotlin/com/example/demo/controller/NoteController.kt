package com.example.demo.controller

import com.example.demo.model.Note
import com.example.demo.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController {

    @Autowired
    lateinit var noteRepository : NoteRepository

    @GetMapping
    fun list(): List<Note> {
        return noteRepository.findAll().toList();
    }

    @PostMapping
    fun add(@RequestBody note: Note): Note {
        return noteRepository.save(note)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody note: Note) : Note? {
        if(noteRepository.existsById(id)) {
            val safeNote = note.copy(id)
            return noteRepository.save(safeNote)
        }
        return null
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) {
        if(noteRepository.existsById(id)) {
            noteRepository.deleteById(id)
        }
    }
}
