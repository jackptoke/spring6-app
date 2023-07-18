package dev.toke.spring6app.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany

@Entity
data class Book(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val title: String,
        val isbn: String,
        @ManyToMany(mappedBy = "books")
        val authors: List<Author> = mutableListOf()
) {
        override fun toString(): String {
                return "Book - ($id): $title ISBN: $isbn"
        }
}
