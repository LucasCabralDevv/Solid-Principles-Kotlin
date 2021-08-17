package com.lucascabral.solidprinciples.dependencyInversion

import com.lucascabral.solidprinciples.dependencyInversion.interfaces.LoggerInterface
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.MessageSender
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.PersonInterface
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.TaskInterface

object Factory {

    fun createPerson(): PersonInterface {
        return Person(
            firstName = "Lucas",
            lastName = "Cabral",
            emailAddress = "lucas@gmail.com",
            phoneNumber = "1235675343"
        )
    }

    fun createTask(): TaskInterface {
        return Task(
            createLogger(),
            createEmailer()
        )
    }

    private fun createLogger(): LoggerInterface {
        return Logger()
    }

    private fun createEmailer(): MessageSender {
        return WhatsAppSender()
    }
}