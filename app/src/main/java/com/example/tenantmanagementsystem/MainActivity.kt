package com.example.tenantmanagementsystem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tenantmanagementsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the binding layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            // Read input values from edit texts
            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()

            // Step 20: Create Tenant object and pass it to Data Binding
            val tenant = Tenant(name, phone, rent)
            binding.tenant = tenant

            // (Optional) Clear input fields after saving
            binding.tenantNameEditText.text?.clear()
            binding.phoneEditText.text?.clear()
            binding.rentEditText.text?.clear()
        }
    }
}