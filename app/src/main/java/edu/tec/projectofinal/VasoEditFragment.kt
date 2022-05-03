package edu.tec.projectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.tec.projectofinal.databinding.FragmentVasoEditBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem


class VasoEditFragment : Fragment() {

    lateinit var binding: FragmentVasoEditBinding
    private val list= mutableListOf<CarouselItem>()
    private val list2= mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVasoEditBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val carousel: ImageCarousel = view.findViewById(R.id.carousel1)
        list.add(CarouselItem(R.drawable.tapaa))
        list.add(CarouselItem(R.drawable.tapab))
        list.add(CarouselItem(R.drawable.tapav))
        list.add(CarouselItem(R.drawable.tapar))
        carousel.addData(list)
        carousel.registerLifecycle(viewLifecycleOwner)
        val carousel2:ImageCarousel=view.findViewById(R.id.carousel2)
        list2.add(CarouselItem(R.drawable.vaso))
        list2.add(CarouselItem(R.drawable.vasochupon))
        list2.add(CarouselItem(R.drawable.vasocoffe))
        list2.add(CarouselItem(R.drawable.vasocontapa))
        carousel2.addData(list2)
        carousel2.registerLifecycle(viewLifecycleOwner)

        binding.botonContinuar.setOnClickListener {
            findNavController().navigate(R.id.action_vasoEditFragment_to_tamanoVasoFragment)
        }
    }

}