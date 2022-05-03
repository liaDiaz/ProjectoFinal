package edu.tec.projectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.tec.projectofinal.databinding.FragmentNavInicioSesionBinding
import edu.tec.projectofinal.databinding.FragmentNavRegistrarseBinding


class navRegistrarse : Fragment() {
    lateinit var binding: FragmentNavRegistrarseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNavRegistrarseBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.botonRegistrarseRegistro.setOnClickListener {
            findNavController().navigate(R.id.action_navRegistrarse_to_navInicioSesion)
        }


    }
}