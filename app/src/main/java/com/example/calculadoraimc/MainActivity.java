package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confereEmail(View v){
        Intent intent = new Intent(getApplicationContext(), IMC.class);
        EditText email = (EditText) findViewById(R.id.email);
        EditText senha = (EditText) findViewById(R.id.senha);
        String emailnovo = email.getText().toString();
        String password = senha.getText().toString();
        if(emailnovo.equals("generico@email.com") && password.equals("123")){

            startActivity(intent);
        }else {
            Toast.makeText(
                    getApplicationContext(),
                    "Email ou senha incorretos!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
