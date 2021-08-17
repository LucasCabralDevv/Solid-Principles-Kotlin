package com.lucascabral.solidprinciples.liskovSubstitution

import com.lucascabral.solidprinciples.liskovSubstitution.interfaces.EmployeeInterface

abstract class BaseEmployee: EmployeeInterface {
    override lateinit var firstName: String
    override lateinit var lastName: String
    override var salary: Double = 0.0

    override fun calculateMonthlySalary(rank: Int) {
        this.salary = (12.5 + (rank * 2))*220
    }
}