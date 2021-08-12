package com.lucascabral.solidprinciples.liskov

import com.lucascabral.solidprinciples.liskov.interfaces.ManagerInterface

class Manager : Employee(), ManagerInterface {

    override fun calculateMonthlySalary(rank: Int) {
        this.salary = (19.5 + (rank * 4))*220
    }

    override fun generatePerformanceReview() {
        println("I'm generating performance review as Manager")
    }
}