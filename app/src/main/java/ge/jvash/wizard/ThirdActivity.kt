package ge.jvash.wizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ThirdActivity : AppCompatActivity() {

    private lateinit var surNameEditText: EditText
    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        surNameEditText = findViewById(R.id.editTextSurname)
        finishButton = findViewById(R.id.button3)

        val name = intent.extras?.getString("NAME")
        val age = intent.extras?.getInt("AGE")

        finishButton.setOnClickListener {

            val surName = surNameEditText.text.toString()

            if (surName.isEmpty()) {
                return@setOnClickListener
            }

            val i = Intent(this, FinishActivity::class.java)
            i.putExtra("NAME", name)
            i.putExtra("AGE", age)
            i.putExtra("SURNAME", surName)

            startActivity(i)

        }

    }

}