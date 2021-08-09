package com.lucascabral.solidprinciples.segregationinterface.interfaces

import java.util.*

interface LibraryItem {

    val id: String
    val title: String
    val author: String
    val chapters: Int
    var borrowDate: Date
    var borrower: String
    val checkoutDurationInDays: Int

    fun checkOut(borrower: String)
    fun checkIn()
    fun getDueDate(): Date
}