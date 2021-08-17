package com.lucascabral.solidprinciples.dependencyInversion

import com.lucascabral.solidprinciples.dependencyInversion.interfaces.MessageSender
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.PersonInterface

class Emailer : MessageSender {
    override fun sendMessage(owner: PersonInterface, s: String) {
        println("Sending email to ${owner.emailAddress} with message: \"$s\"")
    }
}