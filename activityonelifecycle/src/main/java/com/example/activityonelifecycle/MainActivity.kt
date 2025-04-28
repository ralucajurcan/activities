package com.example.activityonelifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.activityonelifecycle.presentation.Fragment1
import com.example.activityonelifecycle.presentation.Fragment3

class MainActivity : AppCompatActivity() {
    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)
        Log.d("MainActivity", "startActivity")
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Log.d("MainActivity", "onCreateView")
        return super.onCreateView(name, context, attrs)
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.d("MainActivity", "onContentChanged")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Fragment1())
                .commit()
        }

        Log.d("MainActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("MainActivity", "onSaveInstanceState")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }
}
