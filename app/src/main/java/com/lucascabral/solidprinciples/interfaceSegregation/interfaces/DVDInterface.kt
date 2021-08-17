package com.lucascabral.solidprinciples.InterfaceSegregation.interfaces

interface DVDInterface : LibraryItem {
    val durationInMinutes: Int
    val actors: List<String>
}