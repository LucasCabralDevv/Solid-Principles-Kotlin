package com.lucascabral.solidprinciples.dependencyInversion

import com.lucascabral.solidprinciples.dependencyInversion.interfaces.PersonInterface
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.TaskInterface
import org.junit.Test

class TaskTest {

    @Test
    fun dependencyInversionTest() {
        val person: PersonInterface = Factory.createPerson()

        val task: TaskInterface = Factory.createTask().apply {
            taskName = "Task Test"
            owner = person
        }

        task.performWork(4.0)
        task.performWork(1.5)
        task.completeTask()
    }
}