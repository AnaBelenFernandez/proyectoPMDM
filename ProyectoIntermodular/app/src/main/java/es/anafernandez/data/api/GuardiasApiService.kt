package es.anafernandez.data.api

<<<<<<< Updated upstream
import es.anafernandez.proyectointermodular.modelo.Aviso_Guardia
import es.anafernandez.proyectointermodular.modelo.Guardia
import es.anafernandez.proyectointermodular.modelo.Profesor
=======
import es.anafernandez.proyectointermodular.modelo.*
>>>>>>> Stashed changes
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
<<<<<<< Updated upstream
=======
import java.time.LocalDate
>>>>>>> Stashed changes

private const val URL_BASE =
    "https://localhost:8080/api/"
private val retrofit = Retrofit.Builder()
    .baseUrl(URL_BASE)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

interface GuardiasApiService {
    //login
    @GET("/login")
    suspend fun login(user:String, pwd:String):Boolean
    //métodos de avisos
    @GET("/avisos")
    suspend fun getAvisos(): List<Aviso_Guardia>
    @GET("/avisos/{id}")
    suspend fun getAviso(@Path("id") id: Int): Aviso_Guardia

    @GET("/avisos")
    suspend fun crearAviso( aviso:Aviso_Guardia): Aviso_Guardia

    @GET("/avisos/{id}")
    suspend fun actualizarAviso(@Path("id") id: Int, aviso:Aviso_Guardia): Aviso_Guardia

    @GET("/avisos/{id}")
    suspend fun borrarAviso(@Path("id") id: Int): Aviso_Guardia

    //métodos de profesor
    @GET("/profesores")
    suspend fun getProfesores(): List<Profesor>

    @GET("/profesores/{id}")
    suspend fun getProfesor(@Path("id")id:Int): Profesor

    @GET("/profesores/{id}")
    suspend fun crearProfesor( profesor:Profesor): Profesor

    @GET("/profesores/{id}")
    suspend fun actualizarProfesor(@Path("id") id: Int, profesor:Profesor): Profesor

    @GET("/profesores/{id}")
    suspend fun borrarProfesor(@Path("id") id: Int): Profesor


    //métodos de guardias
    @GET("/guardias")
    suspend fun getGuardias(): List<Guardia>

<<<<<<< Updated upstream
=======
    //lista de guardias de un día
    @GET("/guardias{dia}")
    suspend fun getGuardiasDia(@Path("dia")dia:LocalDate): List<Guardia>

>>>>>>> Stashed changes
    @GET("/guardias/{id}")
    suspend fun getGuardia(@Path("id")id:Int): Guardia

    @GET("/guardias/{id}")
    suspend fun crearGuardia( guardia:Guardia): Guardia

<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    @GET("/guardias/{id}")
    suspend fun actualizarGuardia(@Path("id") id: Int, guardia: Guardia): Guardia

    @GET("/guardias/{id}")
    suspend fun borrarGuardia(@Path("id") id: Int): Guardia

<<<<<<< Updated upstream

=======
    //métodos de horario_guardias

       @GET("/guardias/{profesor}")
    suspend fun getHorarioGuardia(@Path("profesor")id:Int): HorarioGuardias


//método para obtener el horario de un profesor
@GET("/horarios/{profesor}")
suspend fun getHorario(@Path("profesor")id:Int): List<Horario>
>>>>>>> Stashed changes





}
<<<<<<< Updated upstream
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
=======

>>>>>>> Stashed changes

object GuardiasApi {
    val retrofitService: GuardiasApiService by lazy { retrofit.create(GuardiasApiService::class.java) }
}