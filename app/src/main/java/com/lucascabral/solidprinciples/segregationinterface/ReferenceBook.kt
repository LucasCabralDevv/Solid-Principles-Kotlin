package com.lucascabral.solidprinciples.segregationinterface

import com.lucascabral.solidprinciples.segregationinterface.interfaces.LibraryItem
import java.util.*

class ReferenceBook(
    override val id: String,
    override val title: String,
    override val author: String,
    override val chapters: Int,
): LibraryItem {

    override var borrowDate: Date = Calendar.getInstance().time
    override var borrower: String = ""
    override val checkoutDurationInDays: Int = -1

    override fun checkOut(borrower: String) {
        throw NotImplementedError()
    }

    override fun checkIn() {
        throw NotImplementedError()
    }

    override fun getDueDate(): Date {
        throw NotImplementedError()
    }
}