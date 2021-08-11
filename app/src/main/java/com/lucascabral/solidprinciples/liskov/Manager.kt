package com.lucascabral.solidprinciples.liskov

class Manager : Employee() {

    override fun calculateMonthlySalary(rank: Int) {
        this.salary = (19.5 + (rank * 4))*220
    }

    fun generatePerformanceReview() {
        println("I'm generating performance review as Manager")
    }
}