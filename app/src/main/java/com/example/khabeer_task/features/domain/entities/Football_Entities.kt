package com.example.khabeer_task.features.domain.entities


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Football_Entities")
data class Football_Entities(


    @PrimaryKey(autoGenerate = true)
    var id: Int? = 0,
    var count: Int? = null,
    var competition: Competition_Entities? = Competition_Entities(),
    var matches: ArrayList<Matches_Entities> = arrayListOf()

)

data class Area_Entities(

    var id: Int? = null,
    var name: String? = null

)

data class Competition_Entities(

    var id: Int? = null,
    var area: Area_Entities? = Area_Entities(),
    var name: String? = null,
    var code: String? = null,
    var plan: String? = null,
    var lastUpdated: String? = null

)

data class Season_Entities(

    var id: Int? = 0,
    var startDate: String? = "",
    var endDate: String? = "",
    var currentMatchday: Int? = 0

)

data class Odds_Entities(

    var msg: String? = ""
)


data class FullTime_Entities(

    var homeTeam: Int? = 0,
    var awayTeam: Int? = 0

)

data class HalfTime_Entities(

    var homeTeam: Int? = 0,
    var awayTeam: Int? = 0

)


data class ExtraTime_Entities(
    var homeTeam: String? = "",
    var awayTeam: String? = ""

)


data class Penalties_Entities(

    var homeTeam: String? = "",
    var awayTeam: String? = ""

)

data class Score_Entities(

    var winner: String? = "",
    var duration: String? = "",
    var fullTime: FullTime_Entities? = FullTime_Entities(),
    var halfTime: HalfTime_Entities? = HalfTime_Entities(),
    var extraTime: ExtraTime_Entities? = ExtraTime_Entities(),
    var penalties: Penalties_Entities? = Penalties_Entities()

)

data class HomeTeam_Entities(

    var id: Int? = null,
    var name: String? = null

)

data class AwayTeam_Entities(

    var id: Int? = null,
    var name: String? = null

)

data class Referees_Entities(

    var id: Int? = null,
    var name: String? = null,
    var role: String? = null,
    var nationality: String? = null

)

data class Matches_Entities(

    var id: Int? = null,
    var season: Season_Entities? = Season_Entities(),
    var utcDate: String? = null,
    var status: String? = null,
    var matchday: Int? = null,
    var stage: String? = null,
    var group: String? = null,
    var lastUpdated: String? = null,
    var odds: Odds_Entities? = Odds_Entities(),
    var score: Score_Entities? = Score_Entities(),
    var homeTeam: HomeTeam_Entities? = HomeTeam_Entities(),
    var awayTeam: AwayTeam_Entities? = AwayTeam_Entities(),
    var referees: List<Referees_Entities> = arrayListOf(),
    var dateformate: String? = null,
    var time_start: String? = null,


    )