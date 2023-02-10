package es.anafernandez.proyectointermodular.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.FragmentAvisoBinding
import es.anafernandez.proyectointermodular.databinding.FragmentCalendarioBinding
import es.anafernandez.proyectointermodular.modelo.Aviso_Guardia
import es.anafernandez.proyectointermodular.modelo.Horario
import es.anafernandez.proyectointermodular.modelo.Profesor
import es.anafernandez.proyectointermodular.viewModel.GuardiasViewModel
import java.text.DateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class FragmentAviso : Fragment() {
    private lateinit var binding: FragmentAvisoBinding
    private lateinit var horario: Horario
    private lateinit var profesor: Profesor
    private val guardiasViewModel: GuardiasViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAvisoBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnConfirmarAviso.setOnClickListener {
            //aquí hay que generar un aviso insertando una tupla en la tabla avisos
            var aviso: Aviso_Guardia? = null
            aviso?.fecha_aviso = binding.textViewFechaAviso.toString()
            aviso?.hora_aviso = binding.textViewHoraAviso.text
            aviso?.horario = binding.textViewHorario.text
            if (binding.checkBoxanulado.isChecked) {
                aviso?.anulado = true;
            } else {
                aviso?.anulado = false;
            }
            if (binding.checkBoxConfirmado.isChecked) {
                aviso?.confirmado = true
            } else {
                aviso?.confirmado = false
            }
            //aviso?.profesor=guardiasViewModel.getProfesor(Integer.valueOf(binding.textViewProfesor.toString())
            aviso?.motivo = binding.textViewMotivo.toString()
            aviso?.observaciones = binding.textViewObservaciones.toString()

            if (aviso != null) {
                guardiasViewModel.crearAviso(aviso)
            }
            //después tendría que aparecer el horario del profesor de ese día para que seleccione las horas que va a faltar
            //o si va a faltar el día completo
            //para eso debemos seleccionar de la tabla horario, las horas que tiene ese profesor ese día
            //pasamos un objeto horario
            arguments?.let {
                profesor = it.getSerializable("profesor") as Profesor
            }
            guardiasViewModel.listaHorarios.observe(viewLifecycleOwner)
            { lista ->
                lista.forEach { horario -> horario.profesor == profesor }
                //aquí hemos encontrado el horario del profesor ¿como lo recojo para mandarlo al fragment?

            }
            val accion = FragmentAvisoDirections.deAvisoAHoras(horario = horario)
            view.findNavController().navigate(accion)
            //este objeto se recoge en el método OnCreateView del Fragment que lo recibe ( FragmentHoras)
        }
    }
}
