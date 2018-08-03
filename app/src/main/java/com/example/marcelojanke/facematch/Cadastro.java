package com.example.marcelojanke.facematch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void Cadastrar(View v){

        EditText nome = findViewById(R.id.txtNome);
        EditText idade =  findViewById(R.id.txtIdade);

        RadioGroup rg = findViewById(R.id.rbg);
        RadioButton generoSelecionado = findViewById(rg.getCheckedRadioButtonId());


        CheckBox cbHomem = findViewById(R.id.cbHomens);
        CheckBox cbMulheres = findViewById(R.id.cbMulheres);

        EditText senha =  findViewById(R.id.txtSenha);
        EditText descricao = findViewById(R.id.txtDescricao);
    }
}
