package mx.edu.tsoem.isc.lpha.PracticaEstados;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bumptech.glide.Glide;



public class Principal extends AppCompatActivity {

    Spinner splista;
    List<String> Milista = new ArrayList<>(Arrays.asList("Estado de México", "Durango", "Chihuahua", "Jalisco", "Zacatecas", "Puebla"));

    ImageView imagen;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);
        imagen = findViewById(R.id.foto);


        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Milista);
        splista.setAdapter(adaptador);

        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();


                if (valor.equals("Estado de México")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1NRKaRaYF5AviKHB7WPV9_Y8G5OliBkSp").into(imagen);
                }else if (valor.equals("Puebla")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1lGCUvt2jThvwjv06x4nnEvQSXhr2xKoB").into(imagen);
                }else if (valor.equals("Chihuahua")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1VseYoXFCiY_IJ4_qYArt46-QUMKmpqwE").into(imagen);
                }else if (valor.equals("Durango")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1lhXX64PmAm08lMRF0G0OEE_LNrkGqxM1").into(imagen);
                }else if (valor.equals("Jalisco")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1TIcZrKVjTmvfu5TNMOhlFMpr4kteIWht").into(imagen);
                }else if (valor.equals("Zacatecas")){
                    Toast.makeText(Principal.this, "Selecciono: " +valor, Toast.LENGTH_SHORT).show();
                    Glide.with(Principal.this).load("https://drive.google.com/uc?export=download&id=1YagflZIDCrIqM7XRNXv-0LE16p7yUoAm").into(imagen);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}