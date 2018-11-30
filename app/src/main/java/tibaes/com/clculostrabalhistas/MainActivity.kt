package tibaes.com.clculostrabalhistas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import tibaes.com.clculostrabalhistas.R.id.btnSalarioLiquido2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFGTS.setOnClickListener {
            // abrindo outra página
            val intent = Intent(this, FGTSActivity::class.java)
            startActivity(intent)
        }

        btnSalarioLiquido2.setOnClickListener {
            val intent = Intent(this, SalarioLiquido2::class.java)
            startActivity(intent)
        }

        btnSalarioHora.setOnClickListener {
            val intent = Intent(this, SalarioHora::class.java)
            startActivity(intent)
        }
    }



}
