package com.lucascabral.solidprinciples

import com.lucascabral.solidprinciples.liskovSubstitution.BaseEmployee
import com.lucascabral.solidprinciples.liskovSubstitution.CEO
import com.lucascabral.solidprinciples.liskovSubstitution.Manager
import org.junit.Test

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