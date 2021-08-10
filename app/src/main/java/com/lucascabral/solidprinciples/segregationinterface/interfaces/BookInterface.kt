package com.lucascabral.solidprinciples.segregationinterface.interfaces

interface BookInterface : LibraryItem {
    val author: String
    val chapters: Int
}