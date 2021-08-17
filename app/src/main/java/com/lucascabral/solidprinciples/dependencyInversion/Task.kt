package com.lucascabral.solidprinciples.dependencyInversion

import com.lucascabral.solidprinciples.dependencyInversion.interfaces.LoggerInterface
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.MessageSender
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.PersonInterface
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.TaskInterface

class Task(
    private val log: LoggerInterface,
    private val emailer: MessageSender
) : TaskInterface {

    override var taskName: String = ""
    override var owner: PersonInterface? = null
    override var hoursWorked: Double = 0.0
    override var isComplete: Boolean = false

    override fun performWork(hours: Double) {
        hoursWorked += hours
        log.log("Performing working on $taskName")
    }

    override fun completeTask() {
        isComplete = true
        log.log("$taskName completed!")

        emailer.sendMessage(owner!!, "$taskName completed in $hoursWorked hours!")
    }
}