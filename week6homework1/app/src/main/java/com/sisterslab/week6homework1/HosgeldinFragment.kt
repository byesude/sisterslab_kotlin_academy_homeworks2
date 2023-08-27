package com.sisterslab.week6homework1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sisterslab.week6homework1.databinding.FragmentHosgeldinBinding


class HosgeldinFragment : Fragment() {

    private lateinit var binding: FragmentHosgeldinBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHosgeldinBinding.inflate(layoutInflater)
        return binding.root
    }
}