package es.anafernandez.proyectointermodular.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.FragmentAvisoBinding
import es.anafernandez.proyectointermodular.databinding.FragmentCalendarioBinding

class FragmentAviso : Fragment() {
    private lateinit var binding: FragmentAvisoBinding
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
            //después tendría que aparecer el horario del profesor de ese día para que seleccione las horas que va a faltar
            //o si va a faltar el día completo

                val accion = FragmentAviso.action(numero = numero.text.toString().toInt())
                view.findNavController().navigate(accion)
            }
        }
    }
}