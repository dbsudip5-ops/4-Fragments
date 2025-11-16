package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  // auto-generated from activity_main.xml

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load default fragment
        replaceFragment(FragmentOne())

        // Button clicks
        binding.btnOne.setOnClickListener { replaceFragment(FragmentOne()) }
        binding.btnTwo.setOnClickListener { replaceFragment(FragmentTwo()) }
        binding.btnThree.setOnClickListener { replaceFragment(FragmentThree()) }
        binding.btnFour.setOnClickListener { replaceFragment(FragmentFour()) }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
