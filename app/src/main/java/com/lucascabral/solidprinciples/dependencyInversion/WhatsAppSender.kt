package com.lucascabral.solidprinciples.dependencyInversion

import com.lucascabral.solidprinciples.dependencyInversion.interfaces.MessageSender
import com.lucascabral.solidprinciples.dependencyInversion.interfaces.PersonInterface

class WhatsAppSender : MessageSender {
    override fun sendMessage(owner: PersonInterface, s: String) {
        // Send Message to WhatsApp
    }
}