package com.lucascabral.solidprinciples.LiskovSubstitution.interfaces

interface EmployeeInterface {
    var firstName: String
    var lastName: String
    var salary: Double

    fun calculateMonthlySalary(rank: Int)
}