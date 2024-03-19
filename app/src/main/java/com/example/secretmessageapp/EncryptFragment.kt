package com.example.secretmessageapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.secretmessageapp.databinding.FragmentEncryptBinding


class EncryptFragment : Fragment() {

    private lateinit var binding: FragmentEncryptBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentEncryptBinding.inflate(inflater, container, false)

        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
        binding.encryptedText.text = message.reversed()

        return binding.root
    }

}