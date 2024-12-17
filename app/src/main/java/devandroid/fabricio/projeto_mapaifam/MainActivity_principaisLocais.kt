package devandroid.fabricio.projeto_mapaifam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainLocationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_principais_locais)

        //Ação do Botão Entrar
        val btProximo: Button = findViewById(R.id.btProximo)
        btProximo.setOnClickListener {
            //Vai para a tela de login
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}
