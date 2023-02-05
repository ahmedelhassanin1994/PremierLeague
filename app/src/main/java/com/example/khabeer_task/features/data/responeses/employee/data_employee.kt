package com.example.khabeer_task.features.data.responeses.employee

import com.google.gson.annotations.SerializedName


data class DataEmployee_Response (

    @SerializedName("Activation"     ) var Activation     : Boolean? = null,
    @SerializedName("Success"        ) var Success        : Boolean? = null,
    @SerializedName("Payroll"        ) var Payroll        : Payroll? = Payroll(),
    @SerializedName("EnglishMessage" ) var EnglishMessage : String?  = null,
    @SerializedName("ArabicMessage"  ) var ArabicMessage  : String?  = null

)

data class Employee (

    @SerializedName("EMP_ID"          ) var EMPID          : Int?    = null,
    @SerializedName("CUSTOM_ID"       ) var CUSTOMID       : Int?    = null,
    @SerializedName("EMP_DATA_AR"     ) var EMPDATAAR      : String? = null,
    @SerializedName("EMP_DATA_EN"     ) var EMPDATAEN      : String? = null,
    @SerializedName("JOBCODE"         ) var JOBCODE        : Int?    = null,
    @SerializedName("JOBNAME_AR"      ) var JOBNAMEAR      : String? = null,
    @SerializedName("JOBNAME_EN"      ) var JOBNAMEEN      : String? = null,
    @SerializedName("SEC_NAME_AR"     ) var SECNAMEAR      : String? = null,
    @SerializedName("SEC_NAME_EN"     ) var SECNAMEEN      : String? = null,
    @SerializedName("CONTRACTSTDATE"  ) var CONTRACTSTDATE : String? = null,
    @SerializedName("ATM_ACCOUNT"     ) var ATMACCOUNT     : String? = null,
    @SerializedName("MAR_STATUS_EN"   ) var MARSTATUSEN    : String? = null,
    @SerializedName("MAR_STATUS_AR"   ) var MARSTATUSAR    : String? = null,
    @SerializedName("EMP_GENDUR"      ) var EMPGENDUR      : String? = null,
    @SerializedName("SAL_COMP_CODE_A" ) var SALCOMPCODEA   : Int?    = null,
    @SerializedName("COMP_DESC_A_AR"  ) var COMPDESCAAR    : String? = null,
    @SerializedName("COMP_DESC_A_EN"  ) var COMPDESCAEN    : String? = null,
    @SerializedName("SAL_VALUE_A"     ) var SALVALUEA      : Int?    = null,
    @SerializedName("SAL_COMP_CODE_D" ) var SALCOMPCODED   : Int?    = null,
    @SerializedName("COMP_DESC_D_AR"  ) var COMPDESCDAR    : String? = null,
    @SerializedName("COMP_DESC_D_EN"  ) var COMPDESCDEN    : String? = null,
    @SerializedName("SAL_VALUE_D"     ) var SALVALUED      : Int?    = null,
    @SerializedName("SAL_VALUE_NET"   ) var SALVALUENET    : Int?    = null,
    @SerializedName("CURRSYMBOL_AR"   ) var CURRSYMBOLAR   : String? = null,
    @SerializedName("CURRSYMBOL_EN"   ) var CURRSYMBOLEN   : String? = null,
    @SerializedName("FRACTIONNAME_EN" ) var FRACTIONNAMEEN : String? = null,
    @SerializedName("FRACTIONNAME_AR" ) var FRACTIONNAMEAR : String? = null,
    @SerializedName("STATUSNAME_AR"   ) var STATUSNAMEAR   : String? = null,
    @SerializedName("STATUSNAME_EN"   ) var STATUSNAMEEN   : String? = null,
    @SerializedName("STATUS_AR"       ) var STATUSAR       : String? = null,
    @SerializedName("STATUS_EN"       ) var STATUSEN       : String? = null,
    @SerializedName("EMP_PIC"         ) var EMPPIC         : String? = null

)

data class Allowences (

    @SerializedName("EMP_ID"        ) var EMPID       : Int?    = null,
    @SerializedName("SAL_COMP_CODE" ) var SALCOMPCODE : Int?    = null,
    @SerializedName("COMP_DESC_AR"  ) var COMPDESCAR  : String? = null,
    @SerializedName("COMP_DESC_EN"  ) var COMPDESCEN  : String? = null,
    @SerializedName("SAL_VALUE"     ) var SALVALUE    : Double? = null,
    @SerializedName("SAL_COMP_TYPE" ) var SALCOMPTYPE : Int?    = null

)


data class Deduction (

    @SerializedName("EMP_ID"        ) var EMPID       : Int?    = null,
    @SerializedName("SAL_COMP_CODE" ) var SALCOMPCODE : Int?    = null,
    @SerializedName("COMP_DESC_AR"  ) var COMPDESCAR  : String? = null,
    @SerializedName("COMP_DESC_EN"  ) var COMPDESCEN  : String? = null,
    @SerializedName("SAL_VALUE"     ) var SALVALUE    : Double? = null,
    @SerializedName("SAL_COMP_TYPE" ) var SALCOMPTYPE : Int?    = null

)

data class Payroll (

    @SerializedName("Employee"   ) var Employee   : ArrayList<Employee>   = arrayListOf(),
    @SerializedName("Allowences" ) var Allowences : ArrayList<Allowences> = arrayListOf(),
    @SerializedName("Deduction"  ) var Deduction  : ArrayList<Deduction>  = arrayListOf(),
    @SerializedName("Date"       ) var Date       : String?               = null

)

