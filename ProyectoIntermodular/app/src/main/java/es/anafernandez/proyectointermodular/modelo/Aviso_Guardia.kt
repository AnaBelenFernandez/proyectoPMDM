package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.sql.Time
import java.util.*

data class Aviso_Guardia (
    @SerializedName("id_aviso")
    var id_aviso: Int,
    @SerializedName("profesor")
    var profesor:Profesor,
    @SerializedName("horario")
    val horario: Horario,
    @SerializedName("motivo")
    var motivo: String,
    @SerializedName("observaciones")
    var observaciones: String,
    @SerializedName("confirmado")
    var confirmado:Boolean,
    @SerializedName("anulado")
    var anulado: Boolean,
    @SerializedName("fecha_aviso")
    var fecha_aviso: Date,
    @SerializedName("hora_aviso")
    var hora_aviso: Time,



    ): Serializable