package com.example.hungry4pizza.hungry4pizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class PedidoActivity extends AppCompatActivity {

    private RadioGroup rgTamPizza;
    private Spinner spFormaPag;
    private CheckBox cbAtum;
    private CheckBox cbBacon;
    private CheckBox cbCalabresa;
    private CheckBox cbMussarela;
    private CheckBox cbBordaRecheada;
    private CheckBox cbRecheioExtra;
    private CheckBox cbRefrigerente;
    private CheckBox cbSobremesa;
    private TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        rgTamPizza = (RadioGroup) findViewById(R.id.radioGroup);
        spFormaPag = (Spinner) findViewById(R.id.spFormadePagamento);
        cbAtum = (CheckBox) findViewById(R.id.checkboxAtum);
        cbBacon = (CheckBox) findViewById(R.id.checkboxBacon);
        cbCalabresa = (CheckBox) findViewById(R.id.checkboxCalabresa);
        cbMussarela = (CheckBox) findViewById(R.id.checkboxMussarela);
        cbBordaRecheada = (CheckBox) findViewById(R.id.checkboxBordaRecheada);
        cbRecheioExtra = (CheckBox) findViewById(R.id.checkboxRecheioExtra);
        cbRefrigerente = (CheckBox) findViewById(R.id.checkboxRefrigerante);
        cbSobremesa = (CheckBox) findViewById(R.id.checkboxSobremesa);
        txtUser = (TextView) findViewById(R.id.txtLogin);

        String user  = getIntent().getStringExtra("usuario");

        if (getIntent() != null) {
            txtUser.setText("Olá "+user);
        }

    }

    public void calcular(View v) {

    }
}
