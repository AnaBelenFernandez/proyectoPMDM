package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable
<<<<<<< Updated upstream
=======
import java.time.LocalDate
>>>>>>> Stashed changes
import java.util.*

data class Guardia(
    @SerializedName("id")
    var id: Int,
    @SerializedName("prof_falta")
<<<<<<< Updated upstream
    val prof_falta:Profesor,
    @SerializedName("prof_hace_guardia")
    val prof_hace_guardia: Profesor,
    @SerializedName("estado")
    val Estado: EnumEstado,
    @SerializedName("fecha")
    var fecha: Date,
=======
    val prof_falta:Int,
    @SerializedName("prof_hace_guardia")
    val prof_hace_guardia: Int,
    @SerializedName("estado")
    val Estado: EnumEstado,
    @SerializedName("fecha")
    var fecha: LocalDate,
>>>>>>> Stashed changes
    @SerializedName("dia_semana")
    val dia_semana:Int,
    @SerializedName("horario")
    val horario: Horario,
    @SerializedName("hora")
    val hora: String,
    @SerializedName("aviso")
    var aviso: Aviso_Guardia,
<<<<<<< Updated upstream
    @SerializedName("gruppo")
=======
    @SerializedName("grupo")
>>>>>>> Stashed changes
    val grupo:String,
    @SerializedName("aula")
    val aula: String,
    @SerializedName("observaciones")
    val observaciones: String,



    ): Serializable