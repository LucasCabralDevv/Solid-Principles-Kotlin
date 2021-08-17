package com.lucascabral.solidprinciples.InterfaceSegregation

import com.lucascabral.solidprinciples.InterfaceSegregation.interfaces.BorrowableArticleInterface
import java.util.*

class Article(
    override val id: String,
    override val author: String,
    override val title: String,
    override var borrowDate: Date,
    override var borrower: String,
    override val magazinePublications: List<String>
): BorrowableArticleInterface {

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