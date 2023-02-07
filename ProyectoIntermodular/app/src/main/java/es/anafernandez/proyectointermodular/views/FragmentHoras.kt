package es.anafernandez.proyectointermodular.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.FragmentAvisoBinding
import es.anafernandez.proyectointermodular.databinding.FragmentHorasBinding

class FragmentHoras : Fragment() {
    private lateinit var binding: FragmentHorasBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHorasBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //aquí tiene que seleccionar las horas que va a faltar y generar una guardia

    }
}