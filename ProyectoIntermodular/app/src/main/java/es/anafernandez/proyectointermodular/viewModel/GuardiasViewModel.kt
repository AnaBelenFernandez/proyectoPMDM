package es.anafernandez.proyectointermodular.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import es.anafernandez.proyectointermodular.modelo.*
import kotlinx.coroutines.launch

class GuardiasViewModel() : ViewModel() {
    val listaGuardias = MutableLiveData<List<Guardia>>()
    val listaHorarios = MutableLiveData<List<Horario>>()
    val listaAvisos = MutableLiveData<List<Aviso_Guardia>>()
    val listaProfesores=MutableLiveData<List<Profesor>>()
    val profesor=MutableLiveData<Profesor>()
    val aviso=MutableLiveData<Aviso_Guardia>();


    val repository = GuardiasRepository();


    fun cargarlistaGuardias() {
        viewModelScope.launch {
            try {
              listaGuardias.postValue(repository.getGuardias())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    fun cargarlistaAvisos() {
        viewModelScope.launch {
            try {
                listaAvisos.postValue(repository.getAvisos())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    fun cargarlistaProfesores() {
        viewModelScope.launch {
            try {
                listaProfesores.postValue(repository.getProfesores())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun getProfesor(id:Int) {
        viewModelScope.launch {
            try {
                profesor.postValue(repository.getProfesorId(id))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun getAviso(id:Int) {
        viewModelScope.launch {
            try {
                aviso.postValue(repository.getAviso((id)))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun crearGuardia(guardia: Guardia) {
        viewModelScope.launch {
            try {
                var guardia=repository.crearGuardia((guardia))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


}