package tibaes.com.clculostrabalhistas

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_salario_liquido2.*

class SalarioLiquido2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salario_liquido2)

        // incluir o botão de voltar na página
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnCalcularSL.setOnClickListener {
            val liquido = (etxSalarioBrutoSL.text.toString().toDouble() - (etxSalarioBrutoSL.text.toString().toDouble() * 0.8))
            txtResultadoSL.text =  liquido.toString()
        }

        // abrindo outro site
        btnVerFonteSL.setOnClickListener {
            val uris = Uri.parse("http://www.calculador.com.br/calculo/salario-liquido")
            val intents = Intent(Intent.ACTION_VIEW, uris)
            startActivity(intents)
        }
    }

    // adicionando as funções nos itens do menu
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // caso o botão home seja selecionado (esse é o botão padrão quando inserimos o DisplayHome
        return if (item?.itemId == android.R.id.home) {
            // finalizando a activity
            finish()
            true
        } else {
            super.onOptionsItemSelected(item)
        }
    }
}



