package dev.toke.spring6app.models

import jakarta.persistence.*

@Entity
data class Author(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val firstName: String,
        val lastName: String,
        @ManyToMany(cascade = [CascadeType.ALL])
        @JoinTable(name = "author_book",
                joinColumns = [JoinColumn(name = "author_id", referencedColumnName = "id")],
                inverseJoinColumns = [JoinColumn(name = "book_id", referencedColumnName = "id")])
        var books: List<Book> = mutableListOf()
        ) {
    override fun toString(): String {
        return "Author - ($id): $firstName $lastName Books: $books"
    }
}
