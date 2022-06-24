package com.example.wearable1

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.wearable1.databinding.ActivityMainBinding

class MainActivity : Activity() {

    //se encarga de ver cuantos elementos hay en la intetfaz y los enlaza en automatico.
    private lateinit var binding: ActivityMainBinding
    //En el método onCreate() , ejecutas la lógica de arranque básica de la aplicación que debe ocurrir una sola
    // vez en toda la vida de la actividad.
    override fun onCreate(savedInstanceState: Bundle?) {
        // alcanza la clase Activity (clase principal de cualquier actividad) para cargar el savedInstanceState,
        // ya que por defecto, las actividades se destruyen y se recrean cuando el usuario desliza el teclado G1.
        super.onCreate(savedInstanceState)

        //View Binding es un nuevo mecanismo de acceder a las vistas en el XML de Apps Usando el método inflate.
        binding = ActivityMainBinding.inflate(layoutInflater)
        //SetContentView se utiliza para llenar la ventana con la interfaz de usuario que se proporciona desde el archivo de diseño.
        setContentView(binding.root)
        binding.btnOk.setOnClickListener {
            Toast.makeText(this, "Aceptar", Toast.LENGTH_SHORT).show()
        }

        binding.btnCancel.setOnClickListener {//accion click del boton
            Toast.makeText(this, "Adios", Toast.LENGTH_SHORT).show() //mensaje
            System.exit(0) //cerrar la app
        }


    }
}