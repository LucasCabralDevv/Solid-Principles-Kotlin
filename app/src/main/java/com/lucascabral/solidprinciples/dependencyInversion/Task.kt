package com.lucascabral.solidprinciples.dependencyInversion

class Task {

    var taskName: String = ""
    var owner: Person? = null
    var hoursWorked: Double = 0.0
    var isComplete: Boolean = false

    private val log = Logger()
    private val emailer = Emailer()

    fun performWork(hours: Double) {
        hoursWorked += hours
        log.log("Performing working on $taskName")
    }

    fun completeTask() {
        isComplete = true
        log.log("$taskName completed!")

        emailer.sendEmail(owner!!, "$taskName completed in $hoursWorked hours!")
    }
}