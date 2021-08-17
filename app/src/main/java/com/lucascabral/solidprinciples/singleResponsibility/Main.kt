package com.lucascabral.solidprinciples.SingleResponsibility

import com.lucascabral.solidprinciples.SingleResponsibility.Episode
import com.lucascabral.solidprinciples.SingleResponsibility.EpisodePersistence

class Main {

    fun main() {
        val firstEpisode = Episode()
        val episodePersistence = EpisodePersistence()
        //...
        //firstEpisode.markAsWatched()
        episodePersistence.markAsWatched(firstEpisode)
        //...
    }
}