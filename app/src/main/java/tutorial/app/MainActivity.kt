package tutorial.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title : TextView = findViewById(R.id.tv1)

        val btn : Button = findViewById(R.id.btnToSecondView)
        btn.setOnClickListener {
            val intent  = Intent(this@MainActivity,SecondA::class.java)
            val titleToPass = title.text
            intent.putExtra("titleToPass",titleToPass)
            startActivity(intent)

        }
    }
}


