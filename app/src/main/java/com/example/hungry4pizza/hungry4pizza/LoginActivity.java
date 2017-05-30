package com.example.hungry4pizza.hungry4pizza;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout txtInputLogin;
    private TextInputLayout txtInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtInputLogin = (TextInputLayout) findViewById(R.id.tilLogin);
        txtInputPassword = (TextInputLayout) findViewById(R.id.tilPassword);
    }

    public void conectar(View v) {
        String login = txtInputLogin.getEditText().getText().toString();
        String senha = txtInputPassword.getEditText().getText().toString();

        if (login.equalsIgnoreCase("FIAP") && senha.equalsIgnoreCase("123")) {
            Intent intent = new Intent(this, PedidoActivity.class);
            intent.putExtra("usuario", login);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
        }
    }
}
