package william.campos.actividadnavegationlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1- mandar a llamar a los elementos
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        //2- Programar el botòn
        btnRegistrar.setOnClickListener {

            //Navegaciòn emtre pantallas con Intent
            val Registrar = Intent(this, MainActivity::class.java)
            startActivity(Registrar)



        }
    }

}