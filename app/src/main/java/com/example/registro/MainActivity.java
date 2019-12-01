package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cajaNumero;
    EditText cajaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaNumero = findViewById(R.id.cajaNum);
        cajaUsuario = findViewById(R.id.cajaU);
    }

    public void BotonGuargar(View view) {
        String contenido = cajaNumero.getText().toString();
        String contenidoU = cajaUsuario.getText().toString();
        if (contenidoU.isEmpty() && contenido.isEmpty())
            Toast.makeText(this, "Debe ingresar el nombre y no.control", Toast.LENGTH_SHORT).show();
        else {
            int numFinal = Integer.parseInt(contenido);
            if (numFinal <= 0)
                Toast.makeText(this, "Debe ingresar un numero de 8 digitos", Toast.LENGTH_SHORT).show();
            else if (numFinal > 100000000)
                Toast.makeText(this, "Debe ingresar un numero de 8 digitos", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Datos Guardados correctamente" , Toast.LENGTH_SHORT).show();
        }
    }

}
