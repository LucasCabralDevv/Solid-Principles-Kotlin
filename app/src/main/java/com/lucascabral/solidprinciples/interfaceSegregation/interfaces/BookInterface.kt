package com.lucascabral.solidprinciples.InterfaceSegregation.interfaces

interface BookInterface : LibraryItem {
    val author: String
    val chapters: Int
}