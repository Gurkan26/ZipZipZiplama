package com.gurkan.zipzipziplamaca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
class MainActivity : AppCompatActivity() {
    private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        val myFloatButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        myFloatButton.setOnClickListener {
            navHostFragment.navController.navigate(R.id.action_fragmentAnaEkran_to_fragmentCevapAnahtari)
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (!navHostFragment.navController.popBackStack()) {
            super.onBackPressed()
        }
    }
}
