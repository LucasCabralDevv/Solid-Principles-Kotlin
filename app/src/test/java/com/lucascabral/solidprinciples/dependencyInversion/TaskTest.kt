package com.lucascabral.solidprinciples.dependencyInversion

import org.junit.Test

class TaskTest {

    @Test
    fun dependencyInversionTest() {
        val person: Person = Person(
            firstName = "Lucas",
            lastName = "Cabral",
            emailAddress = "lucas@gmail.com",
            phoneNumber = "1235675343"
        )

        val task: Task = Task().apply {
            taskName = "Task Test"
            owner = person
        }

        task.performWork(4.0)
        task.performWork(1.5)
        task.completeTask()
    }
}