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

       EditText nomeTxt = findViewById(R.id.txtNome);
        EditText idadeTxt =  findViewById(R.id.txtIdade);

        RadioGroup rgTxt = findViewById(R.id.rbg);
        RadioButton generoSelecionadoTxt = findViewById(rgTxt.getCheckedRadioButtonId());


        CheckBox cbHomemTxt = findViewById(R.id.cbHomens);
        CheckBox cbMulheresTxt = findViewById(R.id.cbMulheres);

        EditText senhaTxt =  findViewById(R.id.txtSenha);
        EditText descricaoTxt = findViewById(R.id.txtDescricao);
        EditText turmaTxt = findViewById(R.id.txtTurma);

        String nome = nomeTxt.getText().toString();
        String idade = idadeTxt.getText().toString();
        String senha = senhaTxt.getText().toString();
        String descricao = descricaoTxt.getText().toString();
        String turma = turmaTxt.getText().toString();

        String genero = generoSelecionadoTxt.getText().toString();

        boolean homem = false;
        boolean mulher = false;


        if(cbHomemTxt.isChecked()){
            homem = true;
        }
        if(cbMulheresTxt.isChecked()){
            mulher = true;
        }
    }


}
