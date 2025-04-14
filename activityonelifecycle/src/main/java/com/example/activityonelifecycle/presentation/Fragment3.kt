package com.example.activityonelifecycle.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.activityonelifecycle.R
import com.example.activityonelifecycle.databinding.FragmentFragment3Binding

class Fragment3 : Fragment(R.layout.fragment_fragment3) {

    private val viewModel: SharedViewModel by activityViewModels()

    private lateinit var binding: FragmentFragment3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment3", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Fragment3", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragment3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFragment3Binding.bind(view)

        Log.d("Fragment3", "onViewCreated")

        viewModel.sharedData.observe(viewLifecycleOwner) {value ->
            Log.d("Fragment3", "Observed shared data = $value")
            binding.textview3.text = "Shared data: $value"
        }

        binding.button3.setOnClickListener {
            viewModel.updateData("Updated by F3")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment3", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment3", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment3", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment3", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment3", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment3", "onDetach")
    }
}