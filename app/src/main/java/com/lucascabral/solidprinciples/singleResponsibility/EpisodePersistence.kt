package com.lucascabral.solidprinciples.SingleResponsibility

class EpisodePersistence {

    fun markAsWatched(episode: Episode) {
        LocalDataBase().saveAsWatched(episode)
    }
}