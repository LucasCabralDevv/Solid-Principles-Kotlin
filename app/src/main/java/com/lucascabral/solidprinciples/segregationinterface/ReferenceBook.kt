package com.lucascabral.solidprinciples.segregationinterface

import com.lucascabral.solidprinciples.segregationinterface.interfaces.BookInterface
import com.lucascabral.solidprinciples.segregationinterface.interfaces.LibraryItem
import java.util.*

class ReferenceBook(
    override val id: String,
    override val title: String,
    override val author: String,
    override val chapters: Int,
): BookInterface {
}