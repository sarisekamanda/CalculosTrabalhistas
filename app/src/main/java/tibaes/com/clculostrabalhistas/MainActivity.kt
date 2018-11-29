package tibaes.com.clculostrabalhistas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFGTS.setOnClickListener {
            // abrindo outra página
            val intent = Intent(this, FGTSActivity::class.java)
            startActivity(intent)
        }
    }



}
