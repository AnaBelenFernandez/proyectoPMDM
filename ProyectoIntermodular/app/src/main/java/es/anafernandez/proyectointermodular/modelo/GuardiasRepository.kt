package es.anafernandez.proyectointermodular.modelo

import es.anafernandez.data.api.GuardiasApi
<<<<<<< Updated upstream
=======
import retrofit2.http.GET
import retrofit2.http.Path
import java.security.Guard
import java.time.LocalDate
>>>>>>> Stashed changes

class GuardiasRepository {
    //login
    suspend fun login(user :String, pwd: String):Boolean=GuardiasApi.retrofitService.login(user,pwd)
    //métodos guardias
    suspend fun getGuardias(): List<Guardia> = GuardiasApi.retrofitService.getGuardias()
    suspend fun getGuardia(id:Int):Guardia=GuardiasApi.retrofitService.getGuardia(id)
    suspend fun crearGuardia(guardia:Guardia):Guardia=GuardiasApi.retrofitService.crearGuardia(guardia)
    suspend fun actualizarGuardia(id:Int, guardia: Guardia):Guardia=GuardiasApi.retrofitService.actualizarGuardia(id, guardia)
    suspend fun borrarGuardia(id:Int):Guardia=GuardiasApi.retrofitService.borrarGuardia(id)
<<<<<<< Updated upstream
=======
//aquí falta el método de coger las guardias de un día que devuelve una lista de guardia, pero si pongo el argumento que devuelve da error
    suspend fun getGuardiasDia(dia:LocalDate)=GuardiasApi.retrofitService.getGuardiasDia(dia)


>>>>>>> Stashed changes
    //métodos avisos
    suspend fun getAvisos():List<Aviso_Guardia> =GuardiasApi.retrofitService.getAvisos()
    suspend fun getAviso(id:Int):Aviso_Guardia=GuardiasApi.retrofitService.getAviso(id)
    suspend fun crearAviso( avisoGuardia: Aviso_Guardia):Aviso_Guardia=GuardiasApi.retrofitService.crearAviso(avisoGuardia)
    suspend fun actualizarAviso(id:Int, aviso:Aviso_Guardia):Aviso_Guardia=GuardiasApi.retrofitService.actualizarAviso(id, aviso)
    suspend fun borrarAviso(id: Int):Aviso_Guardia=GuardiasApi.retrofitService.borrarAviso(id)
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    //métodos profesores

    suspend fun getProfesores():List<Profesor> =GuardiasApi.retrofitService.getProfesores()
    suspend fun getProfesorId(id : Int):Profesor= GuardiasApi.retrofitService.getProfesor(id)
    suspend fun crearProfesor(profesor: Profesor):Profesor=GuardiasApi.retrofitService.crearProfesor(profesor)
    suspend fun actualizarProfesor(id: Int, profesor:Profesor):Profesor=GuardiasApi.retrofitService.actualizarProfesor(id,profesor)
    suspend fun borrarProfesor(id: Int):Profesor=GuardiasApi.retrofitService.borrarProfesor(id)

<<<<<<< Updated upstream

=======
//método horario guardias
suspend fun getHorarioGuardia(profesor:Int):HorarioGuardias=GuardiasApi.retrofitService.getHorarioGuardia(profesor)
//método obtener horario profesor que devuelve una lista de horarios
    suspend fun getHorario(profesor:Int)=GuardiasApi.retrofitService.getHorario(profesor)
>>>>>>> Stashed changes

}