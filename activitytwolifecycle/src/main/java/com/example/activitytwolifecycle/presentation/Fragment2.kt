package com.example.activitytwolifecycle.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import com.example.activitytwolifecycle.R
import com.example.activitytwolifecycle.databinding.FragmentFragment2Binding

class Fragment2 : Fragment(R.layout.fragment_fragment2) {

    private val viewModel: SharedViewModel by navGraphViewModels(R.id.nav_graph_main)

    private lateinit var binding: FragmentFragment2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment2", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Fragment2", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFragment2Binding.bind(view)

        Log.d("Fragment2", "onViewCreated")

        binding.button2.setOnClickListener {
            viewModel.updateData("Hi from F2")
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }

        viewModel.sharedData.observe(viewLifecycleOwner) {value ->
            Log.d("Fragment2", "Observed sharedData = $value")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment2", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment2", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment2", "onDetach")
    }
}