package edu.tec.projectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.tec.projectofinal.databinding.FragmentNav1Binding


class Nav1 : Fragment() {

    lateinit var binding: FragmentNav1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNav1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.butonIniciarsesion.setOnClickListener {
            findNavController().navigate(R.id.action_nav1_to_navInicioSesion)
        }
      binding.botonRegistro.setOnClickListener {
          findNavController().navigate(R.id.action_nav1_to_navRegistrarse)
      }
    }


}