package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class Horario(
    @SerializedName("id")
    var id: Int,
    @SerializedName("profesor")
    val profesor:Profesor,
    @SerializedName("dia_semana")
    val dia_semana: Int,
    @SerializedName("hora")
    val hora: Int,
    @SerializedName("aula")
    var aula: String,
    @SerializedName("grupo")
    val grupo:String,
    @SerializedName("horario")
    val horario: Horario,
    @SerializedName("materia")
    val materia: String,
    @SerializedName("genera_guardia")
    var genera_guardia: Boolean,
       ): Serializable