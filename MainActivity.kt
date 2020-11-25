package com.example.gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonCalculate) {
            calculate()
        }
    }

    private fun calculate() {
        if (validation()) {
            try {
                val distance = editDistance.text.toString().toFloat()
                val price = editPrice.text.toString().toFloat()
                val autonomy = editAutonomy.text.toString().toFloat()

                val valor = (distance * price) / autonomy

                textValor.text = "R$ ${"%.2f".format(valor)}"
            }catch (nfe : NumberFormatException){
                Toast.makeText(this, getString(R.string.informe_valores_validos), Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, getString(R.string.preencha_todos_campos), Toast.LENGTH_LONG).show()
        }
    }

    private fun validation(): Boolean {
        return (editDistance.text.toString() != "" && editPrice.text.toString() != ""
                && editAutonomy.text.toString() != "" && editAutonomy.text.toString() != "0")
    }
}
