// Generated by view binder compiler. Do not edit!
package devandroid.fabricio.projeto_mapaifam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import devandroid.fabricio.projeto_mapaifam.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCadastroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btCriarConta;

  @NonNull
  public final EditText confirmarSenha;

  @NonNull
  public final EditText emailCadastro;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final EditText nomeCadastro;

  @NonNull
  public final EditText senha;

  @NonNull
  public final TextView tituloCriarConta;

  private ActivityCadastroBinding(@NonNull ConstraintLayout rootView, @NonNull Button btCriarConta,
      @NonNull EditText confirmarSenha, @NonNull EditText emailCadastro,
      @NonNull ConstraintLayout main, @NonNull EditText nomeCadastro, @NonNull EditText senha,
      @NonNull TextView tituloCriarConta) {
    this.rootView = rootView;
    this.btCriarConta = btCriarConta;
    this.confirmarSenha = confirmarSenha;
    this.emailCadastro = emailCadastro;
    this.main = main;
    this.nomeCadastro = nomeCadastro;
    this.senha = senha;
    this.tituloCriarConta = tituloCriarConta;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCadastroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCadastroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cadastro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCadastroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btCriarConta;
      Button btCriarConta = ViewBindings.findChildViewById(rootView, id);
      if (btCriarConta == null) {
        break missingId;
      }

      id = R.id.confirmarSenha;
      EditText confirmarSenha = ViewBindings.findChildViewById(rootView, id);
      if (confirmarSenha == null) {
        break missingId;
      }

      id = R.id.emailCadastro;
      EditText emailCadastro = ViewBindings.findChildViewById(rootView, id);
      if (emailCadastro == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.nomeCadastro;
      EditText nomeCadastro = ViewBindings.findChildViewById(rootView, id);
      if (nomeCadastro == null) {
        break missingId;
      }

      id = R.id.senha;
      EditText senha = ViewBindings.findChildViewById(rootView, id);
      if (senha == null) {
        break missingId;
      }

      id = R.id.tituloCriarConta;
      TextView tituloCriarConta = ViewBindings.findChildViewById(rootView, id);
      if (tituloCriarConta == null) {
        break missingId;
      }

      return new ActivityCadastroBinding((ConstraintLayout) rootView, btCriarConta, confirmarSenha,
          emailCadastro, main, nomeCadastro, senha, tituloCriarConta);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
