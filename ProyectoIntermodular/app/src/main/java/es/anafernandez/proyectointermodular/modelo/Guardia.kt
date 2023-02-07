package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class Guardia(
    @SerializedName("id")
    var id: Int,
    @SerializedName("prof_falta")
    val prof_falta:Profesor,
    @SerializedName("prof_hace_guardia")
    val prof_hace_guardia: Profesor,
    @SerializedName("estado")
    val Estado: EnumEstado,
    @SerializedName("fecha")
    var fecha: Date,
    @SerializedName("dia_semana")
    val dia_semana:Int,
    @SerializedName("horario")
    val horario: Horario,
    @SerializedName("hora")
    val hora: String,
    @SerializedName("aviso")
    var aviso: Aviso_Guardia,
    @SerializedName("gruppo")
    val grupo:String,
    @SerializedName("aula")
    val aula: String,
    @SerializedName("observaciones")
    val observaciones: String,



    ): Serializable