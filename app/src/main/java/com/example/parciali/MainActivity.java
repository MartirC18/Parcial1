package com.example.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button ir2;
    private Button calcular;
    EditText peso;
    EditText altura;
    EditText nombre;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ir2 = (Button) findViewById(R.id.btnpantalla2);
        peso = (EditText) findViewById(R.id.edtPeso);
        altura = (EditText) findViewById(R.id.edtAlltura);
        nombre = (EditText) findViewById(R.id.edtNombre);
        resultado=(TextView)findViewById(R.id.txtresultado);
        calcular=(Button)findViewById(R.id.btnCalcular);

        ir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(pantalla2);
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double pesod=Double.parseDouble(peso.getText().toString());
                double alturad=Double.parseDouble(altura.getText().toString());

                double resultadoimc=pesod/(alturad*alturad);
                String nombrec=nombre.getText().toString();
                resultado.setText("Estimado "+nombrec+" su imc es de: "+String.format("%.2f",resultadoimc));
               resultado.setVisibility(View.VISIBLE);


            }
        });


    }
}