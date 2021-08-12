package com.lucascabral.solidprinciples.interfaceSegregation.interfaces

interface DVDInterface : LibraryItem {
    val durationInMinutes: Int
    val actors: List<String>
}