package com.lucascabral.solidprinciples.segregationinterface.interfaces

interface ArticleInterface : LibraryItem {
    val author: String
    val magazinePublications: List<String>
}