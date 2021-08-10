package com.lucascabral.solidprinciples

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
        assertEquals(4, 2 + 2)

        val dvd: BorrowableDVDInterface =
            DVD(
                "1", "My DVD",
                Calendar.getInstance().time,
                "Lucas",
                60,
                listOf()
            )
    }
}