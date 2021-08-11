package com.lucascabral.solidprinciples.liskov

import java.lang.RuntimeException

class CEO : Employee() {
    override fun calculateMonthlySalary(rank: Int) {
        this.salary = (19.5 + (rank * 4))*220
    }

    override fun assignManager(manager: Manager) {
        throw RuntimeException("CEO has no manager")
    }

    fun generatePerformanceReview() {
        println("I'm generating performance review as CEO")
    }

    fun fireSomeone(employee: Employee) {
        println("${employee.firstName}, you are fired")
    }
}