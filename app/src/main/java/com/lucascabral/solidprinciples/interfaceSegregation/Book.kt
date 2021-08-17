package com.lucascabral.solidprinciples.InterfaceSegregation

import com.lucascabral.solidprinciples.InterfaceSegregation.interfaces.BorrowableBookInterface
import java.util.*

class Book(
    override val id: String,
    override val title: String,
    override val author: String,
    override val chapters: Int,
    override var borrowDate: Date,
    override var borrower: String,
): BorrowableBookInterface {

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