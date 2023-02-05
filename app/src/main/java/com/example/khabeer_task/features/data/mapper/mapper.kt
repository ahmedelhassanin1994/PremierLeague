package com.raminabbasiiii.movies.data.mapper

import android.os.Build
import com.example.khabeer_task.features.data.responeses.football.*
import com.example.khabeer_task.features.domain.entities.*
import com.example.khabeer_task.util.IntValidation
import com.raminabbasiiii.movies.data.responeses.MovieDto
import com.raminabbasiiii.movies.data.responeses.User_Response
import com.raminabbasiiii.movies.domain.entities.Movie
import com.raminabbasiiii.movies.domain.entities.MovieDetails
import java.time.Duration
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun MovieDto.toMovie(): Movie {
    return Movie(
        id = id,
        title = title,
        poster = poster,
        year = year,
        country = country,
        rating = rating,
        genres = genres,
        images = images
    )
}

fun MovieDto.toMovieDetails(): MovieDetails {
    return MovieDetails(
        id = id,
        title = title,
        poster = poster,
        year = year,
        country = country,
        rating = rating,
        rated = rated,
        released = released,
        runtime = runtime,
        director = director,
        writer = writer,
        actors = actors,
        plot = plot,
        awards = awards,
        votes = votes,
        genres = genres,
        images = images
    )
}


fun User_Response.toUser(): User_Entities {
    return User_Entities(
        UserType = UserType,
        Activation = Activation,
        Token = Token,
        UserRole = UserRole,
        AccountRole = AccountRole,
        AccountId = AccountId,
        Success = Success,
        Code = Code,
        EnglishMessage = EnglishMessage,
        ArabicMessage = ArabicMessage,
        CurrentPage = CurrentPage,
        IsArabic = IsArabic,
        PageCount = PageCount,
        VisitStatus = VisitStatus,

    )
}

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
        id =this.id,
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
        id=this.id,
        area =  this.area!!.toArea(),
        name = this.name,
        code = this.code,
        plan = this.plan,
        lastUpdated =this.lastUpdated,

    )
}

fun Area.toArea() : Area_Entities{
    return  Area_Entities(
        id=this.id,
        name = this.name
    )
}

fun Season.toSeason() : Season_Entities{
    return Season_Entities(
        id=this.id,
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
        homeTeam=this.homeTeam,
        awayTeam=this.awayTeam,
    )
}

fun HalfTime.toHalfTime() : HalfTime_Entities{
    return HalfTime_Entities(
     homeTeam=this.homeTeam,
     awayTeam=this.awayTeam
    )
}

fun FullTime.toFullTime() : FullTime_Entities{
    return FullTime_Entities(
        homeTeam= IntValidation(this.homeTeam),
        awayTeam= IntValidation(this.awayTeam)
    )
}
fun Penalties.toPenalties() : Penalties_Entities{
    return  Penalties_Entities(
        homeTeam=this.homeTeam,
        awayTeam=this.awayTeam,
    )
}
fun HomeTeam.toHomeTeam() : HomeTeam_Entities{
    return  HomeTeam_Entities(
        id=this.id,
        name=this.name
    )
}

fun AwayTeam.toAwayTeam() : AwayTeam_Entities {

    return AwayTeam_Entities(
        id=this.id,
        name=this.name
    )
}


fun Referees.toReferees() : Referees_Entities {
    return Referees_Entities(
        id = this.id,
        name = this.name,
        role = this.role,
        nationality = this.nationality,
    )
}
