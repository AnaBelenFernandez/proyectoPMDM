package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.sql.Time
<<<<<<< Updated upstream
=======
import java.time.LocalDate
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    var fecha_aviso: Date,
=======
    var fecha_aviso: LocalDate,
>>>>>>> Stashed changes
    @SerializedName("hora_aviso")
    var hora_aviso: Time,



    ): Serializable