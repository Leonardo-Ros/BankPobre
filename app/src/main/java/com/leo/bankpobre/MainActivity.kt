package com.leo.bankpobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leo.bankpobre.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fatcard.setOnClickListener {

            var intent = Intent(this,faturcard::class.java)
            startActivity(intent)
            finish()
        }

        binding.saldoemconta.setOnClickListener{

            var intent = Intent(this, Saldo::class.java)
            startActivity(intent)
            finish()
        }

        binding.transferencia.setOnClickListener {

            var intent= Intent(this,Transf::class.java)
            startActivity(intent)
            finish()
        }

        binding.Poupimg.setOnClickListener {
            var intent= Intent(this,PoupaScreen::class.java)
            startActivity(intent)
            finish()
        }
    }
}