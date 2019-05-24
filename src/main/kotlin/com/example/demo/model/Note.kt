package com.example.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Note(@Id
           @GeneratedValue
           val id: Long,
           val title: String,
           val description: String)
