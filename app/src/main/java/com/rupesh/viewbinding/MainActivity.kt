package com.rupesh.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rupesh.viewbinding.databinding.ActivityMainBinding

class MainBindingActivity : AppCompatActivity() {
  var binding:ActivityMainBinding ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding ?.root)
        binding?.btnValidate?.setOnClickListener{
            if(binding?.etName?.text?.toString().isNullOrEmpty()){
                binding?.etName?.error= "Enter your name"

            }else if(binding?.etRollNo?.text?.toString().isNullOrEmpty()){
                binding?.etRollNo?.error="Enter your roll.no"
            }else if (binding?.etHeight?.text?.toString().isNullOrEmpty()){
                binding?.etHeight?.error="Enter your height"
            }else {
                Toast.makeText(this, "validation Completed", Toast.LENGTH_SHORT).show()
            }
        }

    }
}

