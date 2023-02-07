package es.anafernandez.proyectointermodular.modelo

import es.anafernandez.data.api.GuardiasApi

class GuardiasRepository {
    suspend fun getGuardias(): List<Aviso_Guardia> = GuardiasApi.retrofitService.getAvisos();
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