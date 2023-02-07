package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.sql.Time
import java.util.*

data class Aviso_Guardia (
    @SerializedName("id_aviso")
    var id_aviso: Int,
    @SerializedName("profesor")
    val profesor:Profesor,
    @SerializedName("horario")
    val horario: Horario,
    @SerializedName("motivo")
    val motivo: String,
    @SerializedName("observaciones")
    var observaciones: String,
    @SerializedName("confirmado")
    val confirmado:Boolean,
    @SerializedName("anulado")
    val anulado: Boolean,
    @SerializedName("fecha_aviso")
    val fecha_aviso: Date,
    @SerializedName("hora_aviso")
    var hora_aviso: Time,



    ): Serializable