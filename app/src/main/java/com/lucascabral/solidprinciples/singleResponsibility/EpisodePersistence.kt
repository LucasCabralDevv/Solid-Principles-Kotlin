package com.lucascabral.solidprinciples.singleResponsibility

class EpisodePersistence {

    fun markAsWatched(episode: Episode) {
        LocalDataBase().saveAsWatched(episode)
    }
}