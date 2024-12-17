package devandroid.fabricio.projeto_mapaifam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Ação do Botão Entrar
        val botaoEntrar: Button = findViewById(R.id.btEntrar)
        botaoEntrar.setOnClickListener {
            //Vai para a tela de login
            val intent = Intent(this, MainActivity_login::class.java)
            startActivity(intent)
        }
    }
}