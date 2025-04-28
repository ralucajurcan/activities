package com.example.activitytwolifecycle.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activitytwolifecycle.R
import com.example.activitytwolifecycle.databinding.FragmentFragment6Binding

class Fragment6 : Fragment(R.layout.fragment_fragment6) {

    private lateinit var binding: FragmentFragment6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment6", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Fragment6", "onCreateView")
        return inflater.inflate(R.layout.fragment_fragment6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFragment6Binding.bind(view)

        Log.d("Fragment6", "onViewCreated")

        val fragmentManager = requireActivity().supportFragmentManager

        binding.button6.setOnClickListener {
            Log.d("Fragment6", "button6 click")

            // this.parentFragmentManager.popBackStack() -- not gonna work because F5 has already been destroyed, nothing underneath F6 -> blank screen
            // If F5 already exists, bring it to the front; otherwise create it once
            if (!fragmentManager.popBackStackImmediate("Fragment5_manual", 0)) {
                fragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment_container, Fragment5())
                    .addToBackStack("Fragment5_manual")
                    .commit()
            }
        }

        // if someone wants to press the device back btn ->  need to override the onBackPressedDispatcher
        // requireActivity().onBackPressedDispatcher.addCallback
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment6", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment6", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment6", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment6", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment6", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment6", "onDetach")
    }
}