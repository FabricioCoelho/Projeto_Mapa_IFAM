package devandroid.fabricio.projeto_mapaifam

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import devandroid.fabricio.projeto_mapaifam.databinding.ActivityCadastroBinding

class
cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private var auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btCriarConta.setOnClickListener { view ->
            val nome = binding.nomeCadastro.text.toString()
            val email = binding.emailCadastro.text.toString()
            val senha = binding.senha.text.toString()
            val confirmarSenha = binding.confirmarSenha.text.toString()

            //verificação se todos os campos de cadastro foram preenchidos
            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmarSenha.isEmpty()) {
                val snackbar = Snackbar.make(view, "Preencha todos os campos!", Snackbar.LENGTH_SHORT)
                snackbar.setBackgroundTint(Color.RED)
                snackbar.show()
            }
            //verificação se a senha e a confirmação de senha são iguais
            else if (senha != confirmarSenha) {
                val snackbar = Snackbar.make(view, "As senhas não conferem!", Snackbar.LENGTH_SHORT)
                snackbar.setBackgroundTint(Color.RED)
                snackbar.show()
            }
            else {
                auth.createUserWithEmailAndPassword(email,senha).addOnCompleteListener { cadastro ->
                    if (cadastro.isSuccessful){
                        val snackbar = Snackbar.make(view, "Conta criada com sucesso!", Snackbar.LENGTH_SHORT)
                        snackbar.setBackgroundTint(Color.GREEN)
                        snackbar.show()
                        //Vai para a tela de login
                        val intent = Intent(this, MainActivity_login::class.java)
                        startActivity(intent)
                    }
                }
            }
        }

    }
}