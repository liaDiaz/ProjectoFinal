package edu.tec.projectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.tec.projectofinal.databinding.FragmentNavCarritoBinding
import edu.tec.projectofinal.databinding.FragmentTamanoVasoBinding


class navCarrito : Fragment() {
    lateinit var binding: FragmentNavCarritoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentNavCarritoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_navCarrito_to_carritoFragment)
        }
    }
}