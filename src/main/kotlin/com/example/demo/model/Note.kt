package com.example.demo.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Note(@Id
           @GeneratedValue
           @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
           val id: Long,
           val title: String,
           val description: String)
