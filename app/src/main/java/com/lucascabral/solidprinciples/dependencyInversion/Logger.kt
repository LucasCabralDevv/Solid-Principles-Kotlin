package com.lucascabral.solidprinciples.dependencyInversion

import com.lucascabral.solidprinciples.dependencyInversion.interfaces.LoggerInterface

class Logger : LoggerInterface {

    override fun log(s: String) {
        println(s)
    }
}