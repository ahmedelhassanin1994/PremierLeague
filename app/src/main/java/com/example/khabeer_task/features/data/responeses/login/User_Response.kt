package com.raminabbasiiii.movies.data.responeses
import com.google.gson.annotations.SerializedName

 class User_Response (

    @SerializedName("UserType")
    var UserType  : Int,
    @SerializedName("Activation")
    var Activation  : Boolean,
    @SerializedName("Token")
    var Token : String,
    @SerializedName("UserRole")
    var UserRole : String,
    @SerializedName("AccountRole")
    var AccountRole : String,
    @SerializedName("AccountId")
    var AccountId  : Int,
    @SerializedName("Success")
    var Success : Boolean,
    @SerializedName("Code")
    var Code  : Int,
    @SerializedName("EnglishMessage")
    var EnglishMessage : String,
    @SerializedName("ArabicMessage")
    var ArabicMessage : String,
    @SerializedName("CurrentPage")
    var CurrentPage : Int,
    @SerializedName("IsArabic")
    var IsArabic : String,
    @SerializedName("PageCount")
    var PageCount : Int,
    @SerializedName("VisitStatus")
    var VisitStatus : String

)


//data class User (
//
//    @SerializedName("AmbulanceProfileId"   ) var AmbulanceProfileId   : String?  = null,
//    @SerializedName("Id"                   ) var Id                   : Int?     = null,
//    @SerializedName("FirstNameAr"          ) var FirstNameAr          : String?  = null,
//    @SerializedName("LastNameAr"           ) var LastNameAr           : String?  = null,
//    @SerializedName("FirstNameEn"          ) var FirstNameEn          : String?  = null,
//    @SerializedName("LastNameEn"           ) var LastNameEn           : String?  = null,
//    @SerializedName("Email"                ) var Email                : String?  = null,
//    @SerializedName("PatientImage"         ) var PatientImage         : String?  = null,
//    @SerializedName("MobileNumber"         ) var MobileNumber         : String?  = null,
//    @SerializedName("Gender"               ) var Gender               : Int?     = null,
//    @SerializedName("BirthDate"            ) var BirthDate            : String?  = null,
//    @SerializedName("AspNetUsersId"        ) var AspNetUsersId        : Int?     = null,
//    @SerializedName("PhoneNumberConfirmed" ) var PhoneNumberConfirmed : Boolean? = null,
//    @SerializedName("EmailConfirmed"       ) var EmailConfirmed       : Boolean? = null,
//    @SerializedName("HasInsurance"         ) var HasInsurance         : Boolean? = null,
//    @SerializedName("ClassId"              ) var ClassId              : Int?     = null,
//    @SerializedName("LicenseNumber"        ) var LicenseNumber        : String?  = null,
//    @SerializedName("Source"               ) var Source               : String?  = null,
//    @SerializedName("ClassEnglishName"     ) var ClassEnglishName     : String?  = null,
//    @SerializedName("ClassArabicName"      ) var ClassArabicName      : String?  = null,
//    @SerializedName("UserName"             ) var UserName             : String?  = null
//)









