package es.anafernandez.proyectointermodular.modelo

import es.anafernandez.data.api.GuardiasApi

class GuardiasRepository {
    suspend fun getGuardias(): List<Aviso_Guardia> = GuardiasApi.retrofitService.getAvisos();
}