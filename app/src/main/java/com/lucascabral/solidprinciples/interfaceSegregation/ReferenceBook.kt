package com.lucascabral.solidprinciples.interfaceSegregation

import com.lucascabral.solidprinciples.interfaceSegregation.interfaces.BookInterface

class ReferenceBook(
    override val id: String,
    override val title: String,
    override val author: String,
    override val chapters: Int,
): BookInterface