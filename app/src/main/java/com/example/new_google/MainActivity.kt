package com.example.new_google

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.new_google.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.loadUrl("https://www.google.com/search?q=qalampir+uz&oq=qala&aqs=chrome.2.69i57j0i131i433i512l2j0i512j0i131i433i512j0i512l5.2084j0j15&sourceid=chrome&ie=UTF-8")


    }
}