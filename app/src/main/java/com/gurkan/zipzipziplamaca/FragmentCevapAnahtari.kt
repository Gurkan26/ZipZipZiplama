package com.gurkan.zipzipziplamaca

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gurkan.zipzipziplamaca.databinding.FragmentCevapAnahtariBinding

class FragmentCevapAnahtari : Fragment() {
 lateinit var  binding: FragmentCevapAnahtariBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCevapAnahtariBinding.inflate(inflater,container,false)

        binding.buttonCevap.setOnClickListener{
            if(Integer.parseInt(binding.editTextTextPersonName.text.toString()) == 75
                && Integer.parseInt(binding.editTextTextPersonName2.text.toString()) == 95
                && Integer.parseInt(binding.editTextTextPersonName3.text.toString()) == 70) {
                Toast.makeText(requireContext(), "Tebrikler cevaplarınız doğru!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(requireContext(), "Cevaplarınız yanlış!", Toast.LENGTH_SHORT).show();
            }

        }


        return binding.root
    }

}