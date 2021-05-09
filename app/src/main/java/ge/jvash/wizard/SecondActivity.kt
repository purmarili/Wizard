package ge.jvash.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {

    private lateinit var ageEditText: EditText
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        ageEditText = findViewById(R.id.editTextNumber)
        button2 = findViewById(R.id.button2)

        val name = intent.extras?.getString("NAME")

        button2.setOnClickListener {

            val ageText = ageEditText.text.toString()

            if (ageText.isEmpty()) {
                return@setOnClickListener
            }

            val age = ageText.toInt()

            val i = Intent(this, ThirdActivity::class.java)
            i.putExtra("NAME", name)
            i.putExtra("AGE", age)

            startActivity(i)

        }

    }

}