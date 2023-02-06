package com.raminabbasiiii.movies.data.mapper

import android.os.Build
import com.example.khabeer_task.features.data.responeses.football.*
import com.example.khabeer_task.features.domain.entities.*
import com.example.khabeer_task.util.IntValidation
import com.raminabbasiiii.movies.data.responeses.MovieDto
import com.raminabbasiiii.movies.data.responeses.User_Response
import java.time.Duration
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*



fun FootballResponse.toFootball(): Football_Entities {
    var list=  this.matches.map {
        it.toMatches()
    }.toList()

return  Football_Entities(
    count =this.count,
    competition = this.competition!!.toCompetition(),
    matches=list as ArrayList<Matches_Entities>,
)

}


fun calculateDifference(date_utc: String): String? {
    val date = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        LocalDate.now()
    } else {
        TODO("VERSION.SDK_INT < O")
    }

    var date_name: String
    val dtf: DateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy")


    val date1: LocalDate? = LocalDate.parse(date.toString(), dtf)
    val date2: LocalDate? = LocalDate.parse(date_utc, dtf)
    val days: Int = Duration.between(date1, date2).toDays().toInt()
    if(days  == -1){
        date_name = "Yesterday"
    }else if(days == 0){
        date_name= "Today"
    }else if(days == 1){
        date_name= "Tomorrow"
    }else{
        date_name=date.toString();
    }

    return date_name;

}

fun ChangeDateFormate(date: String?): String? {

    val firstApiFormat = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        DateTimeFormatter.ofPattern("yyyy-MM-dd")
    } else {
        TODO("VERSION.SDK_INT < O")
    }

    val date = LocalDate.parse("$date" , firstApiFormat)

    return date.toString()
}
fun ChangeTimeFormate(date: String?): String? {
    val firstApiFormat = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        DateTimeFormatter.ofPattern("HH:mm")
    } else {
        TODO("VERSION.SDK_INT < O")
    }

    val date = LocalDate.parse("$date" , firstApiFormat)

    return date.toString()
}

fun Matches.toMatches() : Matches_Entities{
//   List<Referees_Entities>? Referees_mapper=(this?.!.map((e) => e.toDomain()) ?? Iterable.empty()).cast<Referees_Entities>().toList();
  var list=  this.referees.map {
        it.toReferees()
    }.toList()

    return Matches_Entities(
        id_Matches =this.id,
        season = this.season!!.toSeason(),
//        utcDate =calculateDifference(this.utcDate.toString()),
        utcDate =this.utcDate.toString(),
        status = this.status,
        matchday =this.matchday,
        stage = this.stage,
        group =this.group,
        lastUpdated = this.lastUpdated,
        odds = this.odds!!.toOdds(),
        score =this.score!!.toScore(),
        homeTeam = this.homeTeam!!.toHomeTeam(),
        awayTeam = this.awayTeam!!.toAwayTeam(),
        referees = list,
//        dateformate = ChangeDateFormate(this.utcDate.toString()),
        dateformate = this.utcDate.toString(),
//        time_start = ChangeTimeFormate(this.utcDate),
        time_start = this.utcDate,


        )
}

fun Competition.toCompetition() : Competition_Entities{
    return  Competition_Entities(
        id_Competition  =this.id,
        area =  this.area!!.toArea(),
        name_Competition = this.name,
        code = this.code,
        plan = this.plan,
        lastUpdated =this.lastUpdated,

    )
}

fun Area.toArea() : Area_Entities{
    return  Area_Entities(
        id=this.id,
        name_Area = this.name
    )
}

fun Season.toSeason() : Season_Entities{
    return Season_Entities(
        id_Season =this.id,
        startDate=this.startDate,
        endDate=this.endDate,
        currentMatchday = this.currentMatchday,

    )
}

fun Odds.toOdds() : Odds_Entities{
    return  Odds_Entities(
        msg=this.msg,
    )
}

fun Score.toScore() :Score_Entities{

    return Score_Entities(
        winner=this.winner,
        duration=this.duration,
        fullTime= this.fullTime!!.toFullTime(),
        halfTime  = this.halfTime!!.toHalfTime(),
        extraTime = this.extraTime!!.toExtraTime(),
        penalties = this.penalties!!.toPenalties(),
    )
}

fun ExtraTime.toExtraTime() : ExtraTime_Entities{
    return ExtraTime_Entities(
        homeTeam_ExtraTime =this.homeTeam,
        awayTeam_ExtraTime =this.awayTeam,
    )
}

fun HalfTime.toHalfTime() : HalfTime_Entities{
    return HalfTime_Entities(
     homeTeam_HalfTime =this.homeTeam,
     awayTeam_HalfTime =this.awayTeam
    )
}

fun FullTime.toFullTime() : FullTime_Entities{
    return FullTime_Entities(
        homeTeam_FullTim = IntValidation(this.homeTeam),
        awayTeam_FullTim = IntValidation(this.awayTeam)
    )
}
fun Penalties.toPenalties() : Penalties_Entities{
    return  Penalties_Entities(
        homeTeam_Penalties =this.homeTeam,
        awayTeam_Penalties =this.awayTeam,
    )
}
fun HomeTeam.toHomeTeam() : HomeTeam_Entities{
    return  HomeTeam_Entities(
        id_HomeTeam =this.id,
        name_HomeTeam =this.name
    )
}

fun AwayTeam.toAwayTeam() : AwayTeam_Entities {

    return AwayTeam_Entities(
        id_AwayTeam =this.id,
        name_AwayTeam =this.name
    )
}


fun Referees.toReferees() : Referees_Entities {
    return Referees_Entities(
        id_Referees = this.id,
        name_Referees = this.name,
        role = this.role,
        nationality = this.nationality,
    )
}
