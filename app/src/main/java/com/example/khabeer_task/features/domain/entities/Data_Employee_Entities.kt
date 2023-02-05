package com.example.khabeer_task.features.domain.entities


data class DataEmployee_Entities(

    var Activation: Boolean,
    var Success: Boolean,
    var Payroll: Payroll_Entities,
    var EnglishMessage: String,
    var ArabicMessage: String,

    )

data class Employee_Entities(

    var EMPID: Int,
    var CUSTOMID: Int,
    var EMPDATAAR: String,
    var EMPDATAEN: String,
    var JOBCODE: Int,
    var JOBNAMEAR: String,
    var JOBNAMEEN: String,
    var SECNAMEAR: String,
    var SECNAMEEN: String,
    var CONTRACTSTDATE: String,
    var ATMACCOUNT: String,
    var MARSTATUSEN: String,
    var MARSTATUSAR: String,
    var EMPGENDUR: String,
    var SALCOMPCODEA: Int,
    var COMPDESCAAR: String,
    var COMPDESCAEN: String,
    var SALVALUEA: Int,
    var SALCOMPCODED: Int,
    var COMPDESCDAR: String,
    var COMPDESCDEN: String,
    var SALVALUED: Int,
    var SALVALUENET: Int,
    var CURRSYMBOLAR: String,
    var CURRSYMBOLEN: String,
    var FRACTIONNAMEEN: String,
    var FRACTIONNAMEAR: String,
    var STATUSNAMEAR: String,
    var STATUSNAMEEN: String,
    var STATUSAR: String,
    var STATUSEN: String,
    var EMPPIC: String

)

data class Allowences_Entities(

    var EMPID: Int,
    var SALCOMPCODE: Int,
    var COMPDESCAR: String,
    var COMPDESCEN: String,
    var SALVALUE: Double,
    var SALCOMPTYPE: Int

)


data class Deduction_Entities(

    var EMPID: Int,
    var SALCOMPCODE: Int,
     var COMPDESCAR: String,
    var COMPDESCEN: String,
    var SALVALUE: Double,
     var SALCOMPTYPE: Int

)

data class Payroll_Entities(

    var Employee: ArrayList<Employee_Entities> = arrayListOf(),
    var Allowences: ArrayList<Allowences_Entities> = arrayListOf(),
     var Deduction: ArrayList<Deduction_Entities> = arrayListOf(),
     var Date: String? = null

)

