package com.example.quibicantata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoSair(View view) { // botao sair
        finish();
//        AlertDialog alertDialog;
//        alertDialog = new AlertDialog.Builder(this).create();
//        alertDialog.setTitle("Botão Sair Apertado");
//        alertDialog.setMessage("Volte Sempre :)");
//        alertDialog.show();
        Toast.makeText(getBaseContext(), "Volte Sempre :)", Toast.LENGTH_LONG).show();

    }

    public void buttonLink1(View view) { // botao 1
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S8w9vV_EFaU")));

        Toast.makeText(getBaseContext(), "Carregando...)", Toast.LENGTH_SHORT).show();
    }

    public void buttonLink2(View view) { // botao 2
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2-Es0vFl3So")));

        Toast.makeText(getBaseContext(), "Carregando...", Toast.LENGTH_SHORT).show();
    }

    public void buttonLink3(View view) { // botao 3
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eFECPVCsvO8")));

        Toast.makeText(getBaseContext(), "Carregando...", Toast.LENGTH_SHORT).show();
    }

    public void buttonLink4(View view) { // botao 4
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eJ80GufzCCc")));

        Toast.makeText(getBaseContext(), "Carregando...", Toast.LENGTH_SHORT).show();
    }

    public void buttonLink5(View view) { // botao 5
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RjohbsRl2N8")));

        Toast.makeText(getBaseContext(), "Carregando...", Toast.LENGTH_SHORT).show();
    }

    public void buttonLink6(View view) { // botao 6
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=o2Lx6e_8pto")));

        Toast.makeText(getBaseContext(), "Carregando...", Toast.LENGTH_SHORT).show();
    }
}
