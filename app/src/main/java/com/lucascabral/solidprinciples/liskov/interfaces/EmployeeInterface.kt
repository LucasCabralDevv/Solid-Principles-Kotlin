package com.lucascabral.solidprinciples.liskov.interfaces

interface EmployeeInterface {
    var firstName: String
    var lastName: String
    var salary: Double

    fun calculateMonthlySalary(rank: Int)
}