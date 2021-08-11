package com.lucascabral.solidprinciples.liskov

open class Employee {

    lateinit var firstName: String
    lateinit var lastName: String
    lateinit var manager: Employee
    var salary: Double = 0.0

    open fun assignManager(manager: Manager) {
        this.manager = manager
    }

    open fun calculateMonthlySalary(rank: Int) {
        this.salary = (12.5 + (rank * 2))*220
    }
}