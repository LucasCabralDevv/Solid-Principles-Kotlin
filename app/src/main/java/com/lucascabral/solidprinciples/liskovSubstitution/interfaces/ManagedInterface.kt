package com.lucascabral.solidprinciples.liskovSubstitution.interfaces

import com.lucascabral.solidprinciples.liskovSubstitution.Employee
import com.lucascabral.solidprinciples.liskovSubstitution.Manager

interface ManagedInterface {
    var manager: Employee
    fun assignManager(manager: Manager)
}