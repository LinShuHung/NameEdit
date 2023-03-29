package com.suhun.nameedit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suhun.nameedit.databinding.ActivitySaveBinding

class SaveActivity : AppCompatActivity() {
    lateinit var binding:ActivitySaveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaveBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}