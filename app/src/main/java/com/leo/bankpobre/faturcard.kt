package com.leo.bankpobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.leo.bankpobre.databinding.ActivityFaturcardBinding

class faturcard : AppCompatActivity() {

    private lateinit var binding: ActivityFaturcardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFaturcardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar=binding.fatbar
        toolbar.title = "Saldo"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(400,0,400,0)
        toolbar.setBackgroundColor(getColor(R.color.acquagreen))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_back))
        toolbar.setNavigationOnClickListener {
        val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
            finish()


            }

        val pagar=binding.button
        pagar.setOnClickListener {
            Toast.makeText(this, "Fatura paga com sucesso! \n Valor debitado da conta", Toast.LENGTH_SHORT).show()
        }
    }
}