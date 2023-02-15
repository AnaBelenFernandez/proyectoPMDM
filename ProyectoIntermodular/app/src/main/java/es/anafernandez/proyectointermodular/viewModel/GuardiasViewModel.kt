package es.anafernandez.proyectointermodular.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import es.anafernandez.proyectointermodular.modelo.*
import kotlinx.coroutines.launch
<<<<<<< Updated upstream
=======
import java.time.LocalDate
>>>>>>> Stashed changes

class GuardiasViewModel() : ViewModel() {
    //listas
    val listaGuardias = MutableLiveData<List<Guardia>>()
    val listaHorarios = MutableLiveData<List<Horario>>()
    val listaAvisos = MutableLiveData<List<Aviso_Guardia>>()
    val listaProfesores = MutableLiveData<List<Profesor>>()

    //objetos
    val profesor = MutableLiveData<Profesor>()
    val aviso = MutableLiveData<Aviso_Guardia>();
    val guardia = MutableLiveData<Guardia>()
<<<<<<< Updated upstream
=======
    val horarioGuardias=MutableLiveData<HorarioGuardias>()
    val horario=MutableLiveData<Horario>()
>>>>>>> Stashed changes

    var accesoConcedido=MutableLiveData<Boolean>()


    val repository = GuardiasRepository();
//login
    fun login(user:String, pwd:String){

        viewModelScope.launch{
            try{
                accesoConcedido.postValue(repository.login(user,pwd))
            }catch (e:Exception){
                e.printStackTrace()
            }
        }
    }

    //métodos de guardias
    fun cargarlistaGuardias() {
        viewModelScope.launch {
            try {
                listaGuardias.postValue(repository.getGuardias())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun cargarGuardia(id: Int) {
        viewModelScope.launch {
            try {
                guardia.postValue(repository.getGuardia(id))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun crearGuardia(nueva: Guardia) {
        viewModelScope.launch {
            try {
                guardia.postValue(repository.crearGuardia((nueva)))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun actualizarGuardia(id: Int, nueva: Guardia) {
        viewModelScope.launch {
            try {
                guardia.postValue(repository.actualizarGuardia(id, nueva))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun borrarGuardia(id: Int) {
        viewModelScope.launch {
            try {
                guardia.postValue(repository.borrarGuardia(id))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
//métodos de avisos
    fun cargarlistaAvisos() {
        viewModelScope.launch {
            try {
                listaAvisos.postValue(repository.getAvisos())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    fun getAviso(id: Int) {
        viewModelScope.launch {
            try {
                aviso.postValue(repository.getAviso((id)))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    fun crearAviso(nuevo: Aviso_Guardia) {
        viewModelScope.launch {
            try {
                aviso.postValue(repository.crearAviso((nuevo)))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun actualizarAviso(id: Int, nuevo: Aviso_Guardia) {
        viewModelScope.launch {
            try {
                aviso.postValue(repository.actualizarAviso(id, nuevo))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun borrarAviso(id: Int) {
        viewModelScope.launch {
            try {
                aviso.postValue(repository.borrarAviso(id))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
//métodos de profesores
    fun cargarlistaProfesores() {
        viewModelScope.launch {
            try {
                listaProfesores.postValue(repository.getProfesores())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

<<<<<<< Updated upstream
    fun getProfesor(id: Int) {
=======
    fun getProfesor(id: Int):Profesor? {
>>>>>>> Stashed changes
        viewModelScope.launch {
            try {
                profesor.postValue(repository.getProfesorId(id))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
<<<<<<< Updated upstream
=======
    return profesor.value
>>>>>>> Stashed changes
    }
    fun crearProfesor(nuevo: Profesor) {
        viewModelScope.launch {
            try {
                profesor.postValue(repository.crearProfesor((nuevo)))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun actualizarProfesor(id: Int, nuevo: Profesor) {
        viewModelScope.launch {
            try {
                profesor.postValue(repository.actualizarProfesor(id, nuevo))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun borrarProfesor(id: Int) {
        viewModelScope.launch {
            try {
                profesor.postValue(repository.borrarProfesor(id))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
<<<<<<< Updated upstream
}
=======
    //método para recoger el horario de guardias de un profesor
    fun getHorarioGuardias(profesor: Int): HorarioGuardias? {
        viewModelScope.launch {
            try {
                horarioGuardias.postValue(repository.getHorarioGuardia(profesor))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
   return horarioGuardias.value }


//método para recoger la lista de horario de un profesor
fun getHorario(profesor: Int): List<Horario>? {
    viewModelScope.launch {
        try {
            listaHorarios.postValue(repository.getHorario(profesor))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    return listaHorarios.value }
    //método para obtener la lista de guardias de un día
    fun getGuardiasDia(dia: LocalDate): List<Guardia>? {
        viewModelScope.launch {
            try {
                listaGuardias.postValue(repository.getGuardiasDia(dia))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return listaGuardias.value }


}
>>>>>>> Stashed changes
