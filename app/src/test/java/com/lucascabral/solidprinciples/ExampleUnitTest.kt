package com.lucascabral.solidprinciples

import com.lucascabral.solidprinciples.liskov.BaseEmployee
import com.lucascabral.solidprinciples.liskov.CEO
import com.lucascabral.solidprinciples.liskov.Employee
import com.lucascabral.solidprinciples.liskov.Manager
import com.lucascabral.solidprinciples.segregationinterface.DVD
import com.lucascabral.solidprinciples.segregationinterface.interfaces.BorrowableDVDInterface
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val manager = Manager()
        manager.firstName = "Lucas"
        manager.lastName = "Cabral"
        manager.calculateMonthlySalary(4)

        val employee = CEO()
        employee.firstName = "Zé"
        employee.lastName = "Cabral"
        //employee.assignManager(manager)
        employee.calculateMonthlySalary(2)

        printPayroll(employee)
    }

    private fun printPayroll(employee: BaseEmployee) {
        println("${employee.firstName} salary is ${employee.salary}")
    }
}