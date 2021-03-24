package com.leo.bankpobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leo.bankpobre.databinding.ActivityPoupaScreenBinding

class PoupaScreen : AppCompatActivity() {

    private lateinit var binding: ActivityPoupaScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPoupaScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.pouptool
        toolbar.title = "Poupança"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(350, 0, 350, 0)
        toolbar.setBackgroundColor(getColor(R.color.acquagreen))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_back))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
    }
    }
}