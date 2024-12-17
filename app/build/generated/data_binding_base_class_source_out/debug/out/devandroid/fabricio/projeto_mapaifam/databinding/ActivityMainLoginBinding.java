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

public final class ActivityMainLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText Senha;

  @NonNull
  public final Button btCadastrar;

  @NonNull
  public final Button btLogin;

  @NonNull
  public final EditText emailLogin;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView textoLogin;

  private ActivityMainLoginBinding(@NonNull ConstraintLayout rootView, @NonNull EditText Senha,
      @NonNull Button btCadastrar, @NonNull Button btLogin, @NonNull EditText emailLogin,
      @NonNull ConstraintLayout main, @NonNull TextView textoLogin) {
    this.rootView = rootView;
    this.Senha = Senha;
    this.btCadastrar = btCadastrar;
    this.btLogin = btLogin;
    this.emailLogin = emailLogin;
    this.main = main;
    this.textoLogin = textoLogin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Senha;
      EditText Senha = ViewBindings.findChildViewById(rootView, id);
      if (Senha == null) {
        break missingId;
      }

      id = R.id.btCadastrar;
      Button btCadastrar = ViewBindings.findChildViewById(rootView, id);
      if (btCadastrar == null) {
        break missingId;
      }

      id = R.id.btLogin;
      Button btLogin = ViewBindings.findChildViewById(rootView, id);
      if (btLogin == null) {
        break missingId;
      }

      id = R.id.emailLogin;
      EditText emailLogin = ViewBindings.findChildViewById(rootView, id);
      if (emailLogin == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.textoLogin;
      TextView textoLogin = ViewBindings.findChildViewById(rootView, id);
      if (textoLogin == null) {
        break missingId;
      }

      return new ActivityMainLoginBinding((ConstraintLayout) rootView, Senha, btCadastrar, btLogin,
          emailLogin, main, textoLogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
