package com.lucascabral.solidprinciples.segregationinterface

import com.lucascabral.solidprinciples.segregationinterface.interfaces.LibraryItem
import java.util.*

class DVD(
    override val id: String,
    override val title: String,
    override var borrowDate: Date,
    override var borrower: String,
    val durationInMinutes: Int,
    val actors: List<String>
): LibraryItem {

    override val author = ""
    override val chapters = -1
    override val checkoutDurationInDays = 7

    override fun checkOut(borrower: String) {
        this.borrower = borrower
        borrowDate = Calendar.getInstance().time
    }

    override fun checkIn() {
        this.borrower = ""
    }

    override fun getDueDate(): Date {
        val c = Calendar.getInstance()
        c.time = borrowDate
        c.add(Calendar.DAY_OF_MONTH, checkoutDurationInDays)
        return c.time
    }
}