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

    ) : RecyclerView.Adapter<HorarioAdapter.HorasViewHolder>() {

    class HorasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemHorasBinding.bind(view)
        fun bind(horario: Horario) {
            binding.textViewHora.text=horario.hora.toString()

            //programar aquí que al hacer check la hora quede seleccionada como ausencia
            binding.checkBoxAusencia.setOnClickListener{
                horario.hora
            }

        }
    }
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorarioAdapter.HorasViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_horas, parent, false)

        return HorarioAdapter.HorasViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HorarioAdapter.HorasViewHolder, position: Int) {
        val hora = listaHoras[position]
        holder.bind(hora )
    }

    override fun getItemCount(): Int = listaHoras.size

}