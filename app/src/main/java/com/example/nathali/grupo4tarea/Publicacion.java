package com.example.nathali.grupo4tarea;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Publicacion extends AppCompatActivity {

    private String nombre;
    private String facultad;
    private String materia;
    private String Calificacion;
    private String mostrar;
    private LinearLayout fondo;
    private TextView Pub;
    private ToggleButton color;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_publicacion);
        fondo = (LinearLayout) findViewById(R.id.fondo);
        Pub = (TextView) findViewById(R.id.txtPublica);
        String nomb = getIntent().getStringExtra("nombre");
        facultad = getIntent().getStringExtra("facultad");
        String Cal = getIntent().getStringExtra("Calificacion");
        color = (ToggleButton) findViewById(R.id.tgbColor);
        String most = getIntent().getStringExtra("Mostrar");
        //System.out.print(most);
        nombre = nomb;


        Calificacion = Cal;

        mostrar = most;
        System.out.println("public"+most);
        // setcolor(color);
        // publicacion(nombre, materia, Calificacion, color, mostrar, Pub);

        if(most.equals("si")){
            Pub.setText("Nombre: " + nombre + " Facultad: " +facultad + " Calificacion: " +Calificacion);
        }
        else
            Pub.setText("Nombre: " + nombre + " Facultad: " +facultad + " Calificacion: " +" Revisar Sidweb");

        this.color.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    fondo.setBackgroundColor(Color.BLUE);
                } else {
                    // The toggle is disabled
                    fondo.setBackgroundColor(Color.WHITE);
                }
            }
        });

    }

}
