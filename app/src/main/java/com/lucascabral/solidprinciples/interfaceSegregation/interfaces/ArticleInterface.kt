package com.lucascabral.solidprinciples.InterfaceSegregation.interfaces

interface ArticleInterface : LibraryItem {
    val author: String
    val magazinePublications: List<String>
}