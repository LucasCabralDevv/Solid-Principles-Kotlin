package com.lucascabral.solidprinciples.InterfaceSegregation

import com.lucascabral.solidprinciples.InterfaceSegregation.interfaces.BookInterface

class ReferenceBook(
    override val id: String,
    override val title: String,
    override val author: String,
    override val chapters: Int,
): BookInterface