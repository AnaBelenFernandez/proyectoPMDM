package es.anafernandez.proyectointermodular.modelo

import es.anafernandez.data.api.GuardiasApi

class GuardiasRepository {
    suspend fun getGuardias(): List<Guardia> = GuardiasApi.retrofitService.getGuardias()
    suspend fun getAvisos():List<Aviso_Guardia> =GuardiasApi.retrofitService.getAvisos()
    suspend fun getProfesores():List<Profesor> =GuardiasApi.retrofitService.getProfesores()
    suspend fun getProfesorId(id : Int):Profesor= GuardiasApi.retrofitService.getProfesor(id)
    suspend fun getAviso(id:Int):Aviso_Guardia=GuardiasApi.retrofitService.getAviso(id)
    suspend fun crearGuardia(guardia:Guardia):Guardia=GuardiasApi.retrofitService.crearGuardia(guardia);
    //métodos necesarios

    //AVISOS
    //get profesor por id
    //insertar aviso
    //modificar aviso

    //GUARDIAS
    //buscar profesor en bajas_permisos
    //buscar horario_guardias profesor
    //modificar guardia
    //modificar horario_guardias
}