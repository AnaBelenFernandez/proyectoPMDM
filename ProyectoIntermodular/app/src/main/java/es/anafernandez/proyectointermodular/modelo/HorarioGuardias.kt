package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.sql.Time
import java.util.*

data class HorarioGuardias(
    @SerializedName("id")
    var id: Int,
    @SerializedName("profesor")
    val profesor:Profesor,
    @SerializedName("dia_semana")
    val dia_semana: Int,
    @SerializedName("hora_guardia")
    val hora_guardia: Int,
    @SerializedName("realizadas")
    var realizadas: Int,
    ):java.io.Serializable