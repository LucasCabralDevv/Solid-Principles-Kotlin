package com.lucascabral.solidprinciples.dependencyInversion.interfaces

interface MessageSender {
    fun sendMessage(owner: PersonInterface, s: String)
}