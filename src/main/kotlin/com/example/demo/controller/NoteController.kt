package com.example.demo.controller

import com.example.demo.model.Note
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController {
    @GetMapping
    fun list(): List<Note> {
        return listOf(Note("Leitura", "Livro de Sprint Boot"),
                      Note("Pesquisa", "Ambiente com Docker"))
    }

    @PostMapping
    fun add(@RequestBody note: Note): Note {
        return note
    }
}
