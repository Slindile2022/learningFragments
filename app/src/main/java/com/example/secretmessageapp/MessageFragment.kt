package com.example.secretmessageapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.secretmessageapp.databinding.FragmentMessageBinding

class MessageFragment: Fragment() {

    private lateinit var binding: FragmentMessageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding =  FragmentMessageBinding.inflate(inflater, container, false)

        binding.nextButton.setOnClickListener {
            val message = binding.message.text.toString()

            if (message.isEmpty()){
                Toast.makeText(requireContext(), "Message can't be empty!!", Toast.LENGTH_SHORT).show()
            }else{
                val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)
                findNavController().navigate(action)
            }
        }

        return binding.root
    }
}