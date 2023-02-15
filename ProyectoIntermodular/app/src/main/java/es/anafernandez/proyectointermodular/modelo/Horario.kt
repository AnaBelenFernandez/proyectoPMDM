package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class Horario(
    @SerializedName("id")
    var id: Int,
    @SerializedName("profesor")
<<<<<<< Updated upstream
    val profesor:Profesor,
=======
    val profesor:Int,
>>>>>>> Stashed changes
    @SerializedName("dia_semana")
    val dia_semana: Int,
    @SerializedName("hora")
    val hora: Int,
    @SerializedName("aula")
    var aula: String,
    @SerializedName("grupo")
    val grupo:String,
<<<<<<< Updated upstream
    @SerializedName("horario")
    val horario: Horario,
=======
>>>>>>> Stashed changes
    @SerializedName("materia")
    val materia: String,
    @SerializedName("genera_guardia")
    var genera_guardia: Boolean,
       ): Serializable