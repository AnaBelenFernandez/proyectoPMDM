package es.anafernandez.proyectointermodular.views

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.FragmentCalendarioBinding
import es.anafernandez.proyectointermodular.databinding.FragmentGuardiasBinding
import es.anafernandez.proyectointermodular.modelo.Profesor
import es.anafernandez.proyectointermodular.viewModel.GuardiasViewModel
import java.time.LocalDate
import java.time.LocalDate.parse
import java.time.format.DateTimeFormatter
import java.util.Date

class FragmentGuardias : Fragment() {
    private lateinit var binding: FragmentGuardiasBinding
    private val guardiasViewModel: GuardiasViewModel by activityViewModels()
    private lateinit var profesor: Profesor

    private lateinit var fecha:LocalDate
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGuardiasBinding.inflate(inflater, container, false)
        return binding.root

    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //observar las guardias de un determinado día y profesor y cargarlas al recyclerView
        //aquí tenemos el profesor y el día
        arguments?.let {
            profesor = it.getSerializable("profesor") as Profesor
            var stringfecha: String? =it.getString("fecha")
            val formatter = DateTimeFormatter.ofPattern("d MM, yyyy")
           fecha = parse(stringfecha, formatter)

        }
        guardiasViewModel.listaGuardias.observe(viewLifecycleOwner) { lista ->
            with(binding.recyclerViewGuardias) {
                adapter = GuardiasAdapter(lista)
                layoutManager = LinearLayoutManager(context)

            }

        }
    }
}