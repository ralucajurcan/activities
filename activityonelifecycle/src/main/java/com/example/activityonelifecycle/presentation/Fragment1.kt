package com.example.activityonelifecycle.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.activityonelifecycle.R
import com.example.activityonelifecycle.databinding.FragmentFragment1Binding

class Fragment1 : Fragment(R.layout.fragment_fragment1) {

    private val viewModel: SharedViewModel by activityViewModels()

    private lateinit var binding: FragmentFragment1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment1", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Fragment1", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFragment1Binding.bind(view)
        Log.d("Fragment1", "onViewCreated")

        binding.button1.setOnClickListener {
            viewModel.updateData("Hi from F1")

            this.parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Fragment2())
                .addToBackStack(null)
                .commit()
        }

        viewModel.sharedData.observe(viewLifecycleOwner) {value ->
            Log.d("Fragment1", "Observed sharedData = $value")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment1", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment1", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment1", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment1", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment1", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment1", "onDetach")
    }
}