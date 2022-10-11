package com.example.apptcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {
    private TextView text_tela_esquecisenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();

        text_tela_esquecisenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormLogin.this,FormLogin.class);
                startActivity(intent);
            }
        });
    }

    private void  IniciarComponentes(){
        text_tela_esquecisenha = findViewById(R.id.text_cadastrar_senha);

    }

}