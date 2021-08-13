package com.lucascabral.solidprinciples.singleResponsibility

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