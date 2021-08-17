package com.lucascabral.solidprinciples.dependencyInversion

class Emailer {
    fun sendEmail(owner: Person, s: String) {
        println("Sending email to ${owner.emailAddress} with message: \"$s\"")
    }
}