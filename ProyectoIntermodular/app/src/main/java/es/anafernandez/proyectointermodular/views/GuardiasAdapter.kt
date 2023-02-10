package es.anafernandez.proyectointermodular.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.ItemGuardiaBinding
import es.anafernandez.proyectointermodular.modelo.Guardia

class GuardiasAdapter(
    private val listaGuardias: List<Guardia>,

) : RecyclerView.Adapter<GuardiasAdapter.GuardiaViewHolder>() {

    class GuardiaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemGuardiaBinding.bind(view)
        fun bind(guardia:Guardia) {
           binding.textViewAula.text=guardia.aula
            binding.textViewHora.text=guardia.hora
            binding.textViewGrupo.text=guardia.grupo
            //programar aquí que al seleccionar el check la guardia queda marcada como realizada
            binding.checkBoxRealizada.setOnClickListener{
                guardia.Estado//hay que seleccionar la erre
            }

 }


        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuardiasAdapter.GuardiaViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_guardia, parent, false)


        return GuardiasAdapter.GuardiaViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: GuardiasAdapter.GuardiaViewHolder, position: Int) {
        val guardia = listaGuardias[position]
        holder.bind(guardia )
    }

    override fun getItemCount(): Int = listaGuardias.size

}