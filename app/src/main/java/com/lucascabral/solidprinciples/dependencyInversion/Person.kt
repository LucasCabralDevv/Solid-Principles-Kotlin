package com.lucascabral.solidprinciples.dependencyInversion

import com.lucascabral.solidprinciples.dependencyInversion.interfaces.PersonInterface

data class Person(
    override val firstName: String,
    override val lastName: String,
    override val phoneNumber: String,
    override val emailAddress: String
) : PersonInterface
