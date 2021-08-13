package com.lucascabral.solidprinciples.singleResponsibility

import java.util.*

class Episode {

    fun title(): String = "A great episode!"

    fun durationInHours(): Int = 1

    fun releaseDate(): Calendar = Calendar.getInstance()

    fun director(): String = "Some director"

    fun markAsWatched() {
        LocalDataBase().saveAsWatched(this)
    }
}