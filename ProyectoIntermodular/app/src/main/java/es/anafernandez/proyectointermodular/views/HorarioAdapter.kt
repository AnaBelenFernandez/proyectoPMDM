package es.anafernandez.proyectointermodular.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.ItemGuardiaBinding
import es.anafernandez.proyectointermodular.databinding.ItemHorasBinding
import es.anafernandez.proyectointermodular.modelo.Guardia
import es.anafernandez.proyectointermodular.modelo.Horario

class HorarioAdapter(
    private val listaHoras: List<Horario>,
<<<<<<< Updated upstream
=======
    private val onClickHora: (Horario) -> Unit
>>>>>>> Stashed changes

    ) : RecyclerView.Adapter<HorarioAdapter.HorasViewHolder>() {

    class HorasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemHorasBinding.bind(view)
        fun bind(horario: Horario) {
<<<<<<< Updated upstream
            binding.textViewHora.text=horario.hora.toString()

            //programar aquí que al hacer check la hora quede seleccionada como ausencia
            binding.checkBoxAusencia.setOnClickListener{
                horario.hora
=======
            binding.textViewHora.text = horario.hora.toString()

            //programar aquí que al hacer check la hora quede seleccionada como ausencia
            binding.checkBoxAusencia.setOnClickListener {
               onClickHora(horario)
>>>>>>> Stashed changes
            }

        }
    }
<<<<<<< Updated upstream
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorarioAdapter.HorasViewHolder {
=======

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HorarioAdapter.HorasViewHolder {
>>>>>>> Stashed changes
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_horas, parent, false)

        return HorarioAdapter.HorasViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HorarioAdapter.HorasViewHolder, position: Int) {
        val hora = listaHoras[position]
<<<<<<< Updated upstream
        holder.bind(hora )
=======
        holder.bind(hora)
>>>>>>> Stashed changes
    }

    override fun getItemCount(): Int = listaHoras.size

}