package com.example.khabeer_task.features.data.responeses.football


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "FootballResponse")
data class FootballResponse (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("count"       ) var count       : Int?               = null,
    @SerializedName("competition" ) var competition :  Competition?       = Competition(),
    @SerializedName("matches"     ) var matches     :  ArrayList<Matches> = arrayListOf()

)


@Entity
data class Area (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id"   ) var id   : Int?    = null,
    @SerializedName("name" ) var name : String? = null

)

@Entity
data class Competition (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id"          ) var id          : Int?    = null,
    @SerializedName("area"        ) var area        : Area?   = Area(),
    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("code"        ) var code        : String? = null,
    @SerializedName("plan"        ) var plan        : String? = null,
    @SerializedName("lastUpdated" ) var lastUpdated : String? = null

)


@Entity
data class Season (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id"              ) var id              : Int?    = null,
    @SerializedName("startDate"       ) var startDate       : String? = null,
    @SerializedName("endDate"         ) var endDate         : String? = null,
    @SerializedName("currentMatchday" ) var currentMatchday : Int?    = null

)

@Entity
data class Odds (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("msg" ) var msg : String? = null

)


@Entity
data class FullTime (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("homeTeam" ) var homeTeam : Int? = null,
    @SerializedName("awayTeam" ) var awayTeam : Int? = null

)


@Entity
data class HalfTime (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("homeTeam" ) var homeTeam : Int? = null,
    @SerializedName("awayTeam" ) var awayTeam : Int? = null

)

@Entity
data class ExtraTime (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("homeTeam" ) var homeTeam : String? = null,
    @SerializedName("awayTeam" ) var awayTeam : String? = null

)


@Entity
data class Penalties (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("homeTeam" ) var homeTeam : String? = null,
    @SerializedName("awayTeam" ) var awayTeam : String? = null

)

@Entity
data class Score (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("winner"    ) var winner    : String?    = null,
    @SerializedName("duration"  ) var duration  : String?    = null,
    @SerializedName("fullTime"  ) var fullTime  : FullTime?  = FullTime(),
    @SerializedName("halfTime"  ) var halfTime  : HalfTime?  = HalfTime(),
    @SerializedName("extraTime" ) var extraTime : ExtraTime? = ExtraTime(),
    @SerializedName("penalties" ) var penalties : Penalties? = Penalties()

)

@Entity
data class HomeTeam (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id"   ) var id   : Int?    = null,
    @SerializedName("name" ) var name : String? = null

)

@Entity
data class AwayTeam (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id"   ) var id   : Int?    = null,
    @SerializedName("name" ) var name : String? = null

)

@Entity
data class Referees (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id"          ) var id          : Int?    = null,
    @SerializedName("name"        ) var name        : String? = null,
    @SerializedName("role"        ) var role        : String? = null,
    @SerializedName("nationality" ) var nationality : String? = null

)

@Entity
data class Matches (

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id"          ) var id          : Int?                = null,
    @SerializedName("season"      ) var season      : Season?             = Season(),
    @SerializedName("utcDate"     ) var utcDate     : String?             = null,
    @SerializedName("status"      ) var status      : String?             = null,
    @SerializedName("matchday"    ) var matchday    : Int?                = null,
    @SerializedName("stage"       ) var stage       : String?             = null,
    @SerializedName("group"       ) var group       : String?             = null,
    @SerializedName("lastUpdated" ) var lastUpdated : String?             = null,
    @SerializedName("odds"        ) var odds        : Odds?               = Odds(),
    @SerializedName("score"       ) var score       : Score?              = Score(),
    @SerializedName("homeTeam"    ) var homeTeam    : HomeTeam?           = HomeTeam(),
    @SerializedName("awayTeam"    ) var awayTeam    : AwayTeam?           = AwayTeam(),
    @SerializedName("referees"    ) var referees    : ArrayList<Referees> = arrayListOf()

)