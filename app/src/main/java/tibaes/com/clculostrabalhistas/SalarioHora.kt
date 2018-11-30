package tibaes.com.clculostrabalhistas

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_salario_hora.*

class SalarioHora : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salario_hora)

        // incluir o botão de voltar na página
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnCalcularSH.setOnClickListener {
            val salarioHora = (etxSalarioBrutoSH.text.toString().toDouble() / (etxHoras.text.toString().toDouble() * 20))
            txtResultadoSH.text =  salarioHora.toString()
        }

// abrindo outro site
        btnVerFonteSH.setOnClickListener {
            val uris = Uri.parse("http://www.calculadoratrabalhista.com.br/calculo-da-hora-trabalhada/")
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
