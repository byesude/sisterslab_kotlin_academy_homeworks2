package com.sisterslab.week6homework1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.sisterslab.week6homework1.databinding.FragmentAnasayfaBinding

class AnaSayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.kaydetButton.setOnClickListener()
        {
            val ad = binding.adEdittext.text.toString()
            val soyad = binding.soyadedittext.text.toString()
            if (ad.isEmpty() || soyad.isEmpty()) {
                Toast.makeText(requireContext(), "Boş alanları doldurun!", Toast.LENGTH_SHORT).show()
            } else {
                Navigation.findNavController(it).navigate(R.id.action_anaSayfaFragment_to_hosgeldinFragment)
            }
        }
        return binding.root
    }
}