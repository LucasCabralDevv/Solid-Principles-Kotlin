package com.lucascabral.solidprinciples.dependencyInversion.interfaces

interface TaskInterface {
    var taskName: String
    var owner: PersonInterface?
    var hoursWorked: Double
    var isComplete: Boolean

    fun performWork(hours: Double)
    fun completeTask()
}