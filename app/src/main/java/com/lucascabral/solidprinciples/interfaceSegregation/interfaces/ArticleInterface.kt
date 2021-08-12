package com.lucascabral.solidprinciples.interfaceSegregation.interfaces

interface ArticleInterface : LibraryItem {
    val author: String
    val magazinePublications: List<String>
}