package test

sealed class Tournaments {
    data class Team(val name: String) : Tournaments()
    data class Player(val playerName: String, val teamName: String) : Tournaments()
    object Manager
}