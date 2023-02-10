package es.anafernandez.data.api

import es.anafernandez.proyectointermodular.modelo.Aviso_Guardia
import es.anafernandez.proyectointermodular.modelo.Guardia
import es.anafernandez.proyectointermodular.modelo.Profesor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

private const val URL_BASE =
    "https://opendata.gijon.es/"
private val retrofit = Retrofit.Builder()
    .baseUrl(URL_BASE)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

interface GuardiasApiService {
    @GET("descargar.php?id=790&tipo=JSON")
    suspend fun getAvisos(): List<Aviso_Guardia>

    @GET("{id}")
    suspend fun getAviso(@Path("id") id: Int): Aviso_Guardia

    @GET("descargar.php?id=790&tipo=JSON")
    suspend fun getProfesores(): List<Profesor>

    @GET("{id}")
    suspend fun getProfesor(@Path("id")id:Int): Profesor

    @GET("descargar.php?id=790&tipo=JSON")
    suspend fun getGuardias(): List<Guardia>


    @GET("/guardias")
    suspend fun crearGuardia(guardia: Guardia): Guardia

    @GET(" /guardias/{id}")
    suspend fun editarProfesorGuardia(guardia: Guardia): Guardia


}
//métodos necesarios

//AVISO
//profesor por id
//insertar aviso
//modificar aviso

//GUARDIA
//profesor por id
//buscar profesor en bajas_permisos
//buscar horarioguardias profesor
//buscar horario en cursos_guardia
//modificar guardia
//modificar horario_guardias

object GuardiasApi {
    val retrofitService: GuardiasApiService by lazy { retrofit.create(GuardiasApiService::class.java) }
}