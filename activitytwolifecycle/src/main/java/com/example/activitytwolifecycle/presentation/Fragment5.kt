package com.example.activitytwolifecycle.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activitytwolifecycle.R
import com.example.activitytwolifecycle.databinding.FragmentFragment5Binding

class Fragment5 : Fragment(R.layout.fragment_fragment5) {

    private lateinit var binding: FragmentFragment5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment5", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Fragment5", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragment5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFragment5Binding.bind(view)

        Log.d("Fragment5", "onViewCreated")

        binding.button5.setOnClickListener {
            this.parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_container, Fragment6())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment5", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment5", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment5", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment5", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment5", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment5", "onDetach")
    }
}