package es.anafernandez.proyectointermodular.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.FragmentCalendarioBinding
import java.util.*

class FragmentCalendario : Fragment() {
    private lateinit var binding: FragmentCalendarioBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalendarioBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.calendario.setOnClickListener{
            //aquí tenemos que recoger la fecha que cargaremos en el fragment guardias para que nos muestre las guardias de hoy
            var fecha=binding.calendario.date
            //enviamos la fecha al fragment guardias(tiene que ser cuándo se pulse el icono del menú guardias)
        }

    }}