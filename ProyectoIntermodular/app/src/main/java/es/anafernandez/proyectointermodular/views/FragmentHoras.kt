package es.anafernandez.proyectointermodular.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.FragmentAvisoBinding
import es.anafernandez.proyectointermodular.databinding.FragmentHorasBinding
import es.anafernandez.proyectointermodular.modelo.Horario
import es.anafernandez.proyectointermodular.modelo.Profesor
import es.anafernandez.proyectointermodular.viewModel.GuardiasViewModel

class FragmentHoras : Fragment() {
    private lateinit var binding: FragmentHorasBinding
    private val guardiasViewModel: GuardiasViewModel by activityViewModels()
<<<<<<< Updated upstream
    private lateinit var horario: Horario
=======
    private lateinit var horario: List<Horario>
    private lateinit var horasAusencia:List<Horario>
>>>>>>> Stashed changes
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHorasBinding.inflate(inflater, container, false)
        return binding.root
<<<<<<< Updated upstream
        arguments?.let {
            horario = it.getSerializable("horario") as Horario
        }
=======

>>>>>>> Stashed changes
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //aquí tenemos que cargar el recycler view con las horas que le corresponden al profesor ese día
        arguments?.let {
<<<<<<< Updated upstream
            horario = it.getSerializable("horario") as Horario
        }
        //no sé si tendremos que cogerlas del objeto recibido o hacer un método en guardias view model
        //si fuese observando el viewModel sería así

        guardiasViewModel.listaHorarios.observe(viewLifecycleOwner) { lista ->
            with(binding.recyclerViewHoras) {
                adapter = HorarioAdapter(lista)
                layoutManager = LinearLayoutManager(context)

            }
    }
        //si fuese a partir del objeto horario, no sé si entonces habría que recibir una lista de horarios, en vez de un horario

}}
=======
            horario = listOf(it.getSerializable("horario") as Horario)
        }
//horario es un array de horario: no sé si hay que hacerlo de forma dinámica(observando) o cargándolo directamente al recyclerview
        binding.recyclerViewHoras.layoutManager = LinearLayoutManager(context);
        binding.recyclerViewHoras.adapter = HorarioAdapter(horario, { onClickHora(horasAusencia) })
        //al pulsar el botón confirmar se tienen que guardar la horas seleccionadas en el check en el aviso generado

    }
  fun onClickHora(horas:List<Horario>) {
      //aquí añadimos el horario seleccionado a una lista de horarios que guardaremos en el aviso al pulsar el botón confirmar
      //pero como cojo del item la hora y la traigo aquí?
  }

    }
>>>>>>> Stashed changes
