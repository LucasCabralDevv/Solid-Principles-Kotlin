package com.lucascabral.solidprinciples.liskov.interfaces

import com.lucascabral.solidprinciples.liskov.Employee
import com.lucascabral.solidprinciples.liskov.Manager

interface ManagedInterface {
    var manager: Employee
    fun assignManager(manager: Manager)
}