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
        val botaoProximo: Button = findViewById(R.id.btProximo)

        botaoProximo.setOnClickListener {
            val intent = Intent(this, MainActivity_login::class.java)
            startActivity(intent)
        }
    }
}
