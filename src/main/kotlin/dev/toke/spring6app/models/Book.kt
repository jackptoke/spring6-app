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
        val id: Long?,
        val title: String,
        val isbn: String,
        @ManyToMany(mappedBy = "books")
        val authors: List<Author> = mutableListOf()
) {
        override fun toString(): String {
                return "Book - ($id): $title ISBN: $isbn"
        }

        override fun equals(other: Any?): Boolean {
                if(this === other) return true
                if(other !is Book) return  false
                return other.id.let { id == other.id }
        }

        override fun hashCode(): Int {
                return id.let { id.hashCode() }
        }
}
