package com.fragmentkotlinfitra

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragment.R



class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FragmentSatu()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fFragment, firstFragment)
            commit()
        }
        val btnFirstFragment = findViewById<Button>(R.id.btnfirstFragment)
        btnFirstFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fFragment, firstFragment)
                commit()
            }
        }
        val btnSecondFragment = findViewById<Button>(R.id.btnsecondFragment)
        btnSecondFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fFragment, secondFragment)
                commit()
            }
        }
    }
}