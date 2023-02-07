package es.anafernandez.proyectointermodular.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.FragmentCalendarioBinding
import es.anafernandez.proyectointermodular.databinding.FragmentGuardiasBinding
import es.anafernandez.proyectointermodular.viewModel.GuardiasViewModel

class FragmentGuardias : Fragment() {
    private lateinit var binding: FragmentGuardiasBinding
    private val guardiasViewModel: GuardiasViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGuardiasBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //observar las guardias de un determinado día y profesor y cargarlas al recyclerView
        guardiasViewModel.listaGuardias.observe(viewLifecycleOwner) { lista ->
            with(binding.recyclerViewGuardias) {
                adapter = GuardiasAdapter(lista)
                layoutManager = LinearLayoutManager(context)

            }

        }
    }
}