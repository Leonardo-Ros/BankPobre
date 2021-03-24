package com.leo.bankpobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leo.bankpobre.databinding.ActivityTransfBinding

class Transf : AppCompatActivity() {

    private lateinit var binding: ActivityTransfBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransfBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.transtool
        toolbar.title = "Transferência"
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