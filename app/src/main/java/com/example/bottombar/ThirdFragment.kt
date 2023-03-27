package com.example.bottombar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottombar.databinding.FragmentThirdBinding

class ThirdFragment:Fragment() {

    lateinit var binding : FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }
}