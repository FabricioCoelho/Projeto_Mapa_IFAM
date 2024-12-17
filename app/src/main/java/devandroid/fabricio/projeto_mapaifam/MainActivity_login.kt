package devandroid.fabricio.projeto_mapaifam

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        // Ação do Botão Entrar
        val botaoEntrar: Button = findViewById(R.id.btLogin)
        botaoEntrar.setOnClickListener {
            //Vai para a tela de principais locais
            val intent = Intent(this, MainLocationsActivity::class.java)
            startActivity(intent)
        }
        // Ação do Botão criar conta
        val botaoCriarConta: Button = findViewById(R.id.btCadastrar)
            // Vai para a tela de cadastro
        botaoCriarConta.setOnClickListener {
            val intent = Intent(this, cadastro::class.java)
            startActivity(intent)
        }
    }
}