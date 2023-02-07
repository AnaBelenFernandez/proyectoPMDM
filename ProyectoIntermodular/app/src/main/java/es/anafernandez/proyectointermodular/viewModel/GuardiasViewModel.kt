package es.anafernandez.proyectointermodular.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import es.anafernandez.proyectointermodular.modelo.*
import kotlinx.coroutines.launch

class GuardiasViewModel():ViewModel() {
    val listaGuardias = MutableLiveData<List<Guardia>>()
   val listaHorarios = MutableLiveData<List<Horario>>()
    val listaAvisos= MutableLiveData<List<Aviso_Guardia>>()
 val listaAvisoGuardia=MutableLiveData<List<Aviso_Guardia>>()
  val horarioGuardias=MutableLiveData<HorarioGuardias>()
    val repository = GuardiasRepository();
    fun cargarDatos() {
        viewModelScope.launch {
            try {

                listaAvisos.postValue(repository.getGuardias())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


}