package es.anafernandez.proyectointermodular.modelo

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Profesor (
    @SerializedName("id")
    var id: Int,
    @SerializedName("dni")
    val dni:String,
    @SerializedName("nombre")
    val nombre: String,
    @SerializedName("ape1")
    val ape1: String,
    @SerializedName("ape2")
    var ape2: String,
    @SerializedName("tfno")
    val tfno:String,
    @SerializedName("baja")
    val baja: Boolean,
    @SerializedName("activo")
    val activo: Boolean,
    @SerializedName("dept_cod")
    var dept_cod: String,
    @SerializedName("id_sustituye")
    var id_sustituye: Int,


        ): Serializable