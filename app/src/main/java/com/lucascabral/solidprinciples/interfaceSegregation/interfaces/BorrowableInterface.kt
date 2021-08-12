package com.lucascabral.solidprinciples.interfaceSegregation.interfaces

import java.util.*

interface BorrowableInterface {

    var borrowDate: Date
    var borrower: String
    val checkoutDurationInDays: Int

    fun checkOut(borrower: String)
    fun checkIn()
    fun getDueDate(): Date
}