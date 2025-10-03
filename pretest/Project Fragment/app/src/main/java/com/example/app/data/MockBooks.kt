package com.example.app.data

data class Book(
    val title: String,
    val author: String,
    val isFavorite: Boolean = false
)


object MockBooks {
    val items = listOf(
        Book("Clean Code", "Robert C. Martin", true),
        Book("Kotlin in Action", "Dmitry Jemerov", false),
        Book("Android Apprentice", "raywenderlich Team", true)
    )
}
