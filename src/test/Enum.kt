package test

enum class Teams {TEAM_A() {
    override fun teamName(name: String) {
        println("Team A")
    }
}
,
    TEAM_B {
        override fun teamName(name: String) {
            println("Team B")
        }
    }
    ,
    TEAM_C {
        override fun teamName(name: String) {
            println("TeamC")
        }
    };

    abstract fun teamName(name: String)
}
