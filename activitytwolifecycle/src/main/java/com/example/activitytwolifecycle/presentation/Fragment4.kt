package com.example.activitytwolifecycle.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import com.example.activitytwolifecycle.R
import com.example.activitytwolifecycle.databinding.FragmentFragment4Binding

class Fragment4 : Fragment(R.layout.fragment_fragment4) {

    private val viewModel: SharedViewModel by navGraphViewModels(R.id.nav_graph_main)

    private lateinit var binding: FragmentFragment4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment4", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Fragment4", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragment4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFragment4Binding.bind(view)

        Log.d("Fragment4", "onViewCreated")

        binding.button4.setOnClickListener {
            viewModel.updateData("Hi from F4")
            findNavController().navigate(R.id.action_fragment4_to_fragment5)
        }

        viewModel.sharedData.observe(viewLifecycleOwner) {value ->
            Log.d("Fragment4", "Observed sharedData = $value")
            binding.textview4.text = "Shared data: $value"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment4", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment4", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment4", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment4", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment4", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment4", "onDetach")
    }
}