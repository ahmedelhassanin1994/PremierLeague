package com.example.khabeer_task.features.domain.entities


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Football_Entities")
 class Football_Entities(


    @PrimaryKey(autoGenerate = true)
    var id_Football: Int? = 0,
    var count: Int? = null,
    @Embedded (prefix = "competition") var competition: Competition_Entities? = Competition_Entities(),
    @SerializedName("matches")
    @Embedded(prefix = "matches")  val matches: List<Matches_Entities>?= null
)

@Entity
data class Area_Entities(

    var id: Int? = null,
    var name_Area: String? = null

)

@Entity
data class Competition_Entities(

    var id_Competition: Int? = null,
    @Embedded  var area: Area_Entities? = Area_Entities(),
    var name_Competition: String? = null,
    var code: String? = null,
    var plan: String? = null,
    var lastUpdated: String? = null

)


@Entity
data class Season_Entities(

    var id_Season: Int? = 0,
    var startDate: String? = "",
    var endDate: String? = "",
    var currentMatchday: Int? = 0

)

@Entity
data class Odds_Entities(

    var msg: String? = ""
)


@Entity
data class FullTime_Entities(

    var homeTeam_FullTim: Int? = 0,
    var awayTeam_FullTim: Int? = 0

)


@Entity
data class HalfTime_Entities(

    var homeTeam_HalfTime: Int? = 0,
    var awayTeam_HalfTime: Int? = 0

)


@Entity
data class ExtraTime_Entities(
    var homeTeam_ExtraTime: String? = "",
    var awayTeam_ExtraTime: String? = ""

)


@Entity
data class Penalties_Entities(

    var homeTeam_Penalties: String? = "",
    var awayTeam_Penalties: String? = ""

)


@Entity
data class Score_Entities(

    var winner: String? = "",
    var duration: String? = "",
    @Embedded  var fullTime: FullTime_Entities? = FullTime_Entities(),
    @Embedded  var halfTime: HalfTime_Entities? = HalfTime_Entities(),
    @Embedded var extraTime: ExtraTime_Entities? = ExtraTime_Entities(),
    @Embedded var penalties: Penalties_Entities? = Penalties_Entities()

)

@Entity
data class HomeTeam_Entities(

    var id_HomeTeam: Int? = null,
    var name_HomeTeam: String? = null

)

@Entity
data class AwayTeam_Entities(

    var id_AwayTeam: Int? = null,
    var name_AwayTeam: String? = null

)

@Entity
data class Referees_Entities(

    var id_Referees: Int? = null,
    var name_Referees: String? = null,
    var role: String? = null,
    var nationality: String? = null
)

@Entity
data class Matches_Entities(

    var id_Matches: Int? = null,
    @Embedded var season: Season_Entities? = Season_Entities(),
    var utcDate: String? = null,
    var status: String? = null,
    var matchday: Int? = null,
    var stage: String? = null,
    var group: String? = null,
    var lastUpdated: String? = null,
    @Embedded  var odds: Odds_Entities? = Odds_Entities(),
    @Embedded  var score: Score_Entities? = Score_Entities(),
    @Embedded  var homeTeam: HomeTeam_Entities? = HomeTeam_Entities(),
    @Embedded  var awayTeam: AwayTeam_Entities? = AwayTeam_Entities(),
    @Embedded  var referees: List<Referees_Entities> = arrayListOf(),
    var dateformate: String? = null,
    var time_start: String? = null,

    )