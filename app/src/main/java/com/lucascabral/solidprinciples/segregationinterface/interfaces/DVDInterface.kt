package com.lucascabral.solidprinciples.segregationinterface.interfaces

interface DVDInterface : LibraryItem {
    val durationInMinutes: Int
    val actors: List<String>
}