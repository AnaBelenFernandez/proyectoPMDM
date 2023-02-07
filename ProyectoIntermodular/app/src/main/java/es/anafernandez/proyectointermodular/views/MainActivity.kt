package es.anafernandez.proyectointermodular.views

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import es.anafernandez.proyectointermodular.R
import es.anafernandez.proyectointermodular.databinding.ActivityGestionGuardiasBinding
import es.anafernandez.proyectointermodular.databinding.ActivityMainBinding
import es.anafernandez.proyectointermodular.modelo.Profesor
import es.anafernandez.proyectointermodular.viewModel.GuardiasViewModel
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private val guardiasViewModel: GuardiasViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private val fragmentCalendario = FragmentCalendario()
    private val fragmentGuardias = FragmentGuardias()
    private val fragmentAviso=FragmentAviso();
    private lateinit var profesor:Profesor


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflado
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        guardiasViewModel.cargarDatos()
        setFragment(fragmentCalendario)
        opcionesMenu()
        //aquí tenemos que coger el profesor del login y asignárselo a la variable


    }

    private fun setFragment(fragmentToChange: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.layoutFragmentHolder, fragmentToChange)
            .commit()
    }

    private fun opcionesMenu() {
        binding.viewBottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.guardias -> setFragment(fragmentGuardias)
                R.id.avisos -> setFragment(fragmentAviso)
            }
            true
        }
    }
}