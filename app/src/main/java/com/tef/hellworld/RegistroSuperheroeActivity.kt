package com.tef.hellworld

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RegistroSuperheroeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Método", "onCreate")


        setContentView(R.layout.activity_registro_superheroe)

        // var o val para crear objetos, val es estático, var es mutable
        // findViewById(R.id.registrar_button) con esto conecto el objeto con el recurso del layout

        val registrarButton: Button = findViewById(R.id.registrar_button)
        val nameEditText: EditText = findViewById(R.id.name_edit_text)
        val infoTextView: TextView = findViewById(R.id.info_text_view)
        val heightEditText: TextInputEditText = findViewById(R.id.height_edit_text)
        val maleRadioButton: RadioButton = findViewById(R.id.male_radio_button)
        val femaleRadioButton: RadioButton = findViewById(R.id.female_radio_button)
        val technologyCheckBox: CheckBox = findViewById(R.id.technology_check_box)
        val speedCheckBox: CheckBox = findViewById(R.id.speed_check_box)
        val moneyCheckBox: CheckBox = findViewById(R.id.money_check_box)
        val citySpinner: Spinner = findViewById(R.id.city_spinner)


        // método setOnClickListener para añadir funcionalidad al botón

        registrarButton.setOnClickListener {

            // .text es equivalente a getText()
            // con esto asigno el nombre a infoTextView
            Log.d("button", "clicked")

            if (heightEditText.text.toString() == "")
                heightEditText.error = "Digite estatura"

            if (nameEditText.text.isEmpty() || heightEditText.text.toString() == "")
            // var data : String? // Esto permite que la variable pueda tomar un valor nulo, null able
                Toast.makeText(this, "Debe digitar el nombre y la estatura", Toast.LENGTH_SHORT)
                    .show()
            else {

                val name: String = nameEditText.text.toString()
                val height: Float = heightEditText.text.toString().toFloat()
                var powers = ""
                val city = citySpinner.selectedItem.toString()

                val gender = if (maleRadioButton.isChecked)
                    getString(R.string.male)
                else
                    getString(R.string.female)

                if (technologyCheckBox.isChecked)
                    powers = getString(R.string.technology)
                if (speedCheckBox.isChecked)
                    powers = powers + " " + getString(R.string.speed)
                if (moneyCheckBox.isChecked)
                    powers = powers + " " + getString(R.string.money)


                // infoTextView.text = "Nombre: " + name + ", Estatura: " + height
                infoTextView.text =
                    getString(R.string.name_info, name, height, gender, powers, city)

                // val superhero = Superhero(name, height, powers, city, gender)
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("nombre", name)
                startActivity(intent)

            }
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d("Método", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Método", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Método", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Método", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Método", "onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Método", "onRestart")

    }
}