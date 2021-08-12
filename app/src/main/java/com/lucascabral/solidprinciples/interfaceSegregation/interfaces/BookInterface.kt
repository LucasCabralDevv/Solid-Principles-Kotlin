package com.lucascabral.solidprinciples.interfaceSegregation.interfaces

interface BookInterface : LibraryItem {
    val author: String
    val chapters: Int
}