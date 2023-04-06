package tutorial.app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.buttonOne)
        val editText : EditText = findViewById(R.id.EditTextID)
        btn.setOnClickListener {
            val input = editText.text.toString()
            // they work together
            Toast.makeText(it.context,input,Toast.LENGTH_SHORT).show()
            Snackbar.make(it,input,Snackbar.LENGTH_SHORT).show()
        }
    }
}


