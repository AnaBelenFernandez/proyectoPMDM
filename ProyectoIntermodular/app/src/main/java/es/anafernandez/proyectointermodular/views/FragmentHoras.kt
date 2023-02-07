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
import es.anafernandez.proyectointermodular.viewModel.GuardiasViewModel

class FragmentHoras : Fragment() {
    private lateinit var binding: FragmentHorasBinding
    private val guardiasViewModel: GuardiasViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHorasBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //aquí tenemos que cargar el recycler view con las horas que le corresponden al profesor ese día
        guardiasViewModel.listaHorarios.observe(viewLifecycleOwner) { lista ->
            with(binding.recyclerViewHoras) {
                adapter = HorarioAdapter(lista)
                layoutManager = LinearLayoutManager(context)

            }
    }
}