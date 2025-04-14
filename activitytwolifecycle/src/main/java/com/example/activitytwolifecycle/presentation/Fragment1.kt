package com.example.activitytwolifecycle.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.example.activitytwolifecycle.R
import com.example.activitytwolifecycle.databinding.FragmentFragment1Binding

class Fragment1 : Fragment(R.layout.fragment_fragment1) {

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
            val navHost = NavHostFragment.create(R.navigation.nav_graph)

            this.parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_container, navHost)
                .commit()
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