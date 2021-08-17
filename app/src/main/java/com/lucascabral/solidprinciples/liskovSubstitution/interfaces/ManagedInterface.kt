package com.lucascabral.solidprinciples.LiskovSubstitution.interfaces

import com.lucascabral.solidprinciples.LiskovSubstitution.Employee
import com.lucascabral.solidprinciples.LiskovSubstitution.Manager

interface ManagedInterface {
    var manager: Employee
    fun assignManager(manager: Manager)
}