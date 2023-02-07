package es.anafernandez.data.api

import es.anafernandez.proyectointermodular.modelo.Aviso_Guardia
import es.anafernandez.proyectointermodular.modelo.Guardia
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
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

}

object GuardiasApi {
    val retrofitService: GuardiasApiService by lazy { retrofit.create(GuardiasApiService::class.java) }
}