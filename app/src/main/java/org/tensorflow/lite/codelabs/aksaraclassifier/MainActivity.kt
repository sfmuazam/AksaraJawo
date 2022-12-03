package org.tensorflow.lite.codelabs.aksaraclassifier

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var canvasButton: Button? = null
    private var camGalButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        canvasButton = findViewById(R.id.btnCanvas)
        camGalButton = findViewById(R.id.btnCamGal)

        canvasButton?.setOnClickListener{
            startActivity(Intent(this, CanvasActivity::class.java))
        }

        camGalButton?.setOnClickListener{
            startActivity(Intent(this, CamGalActivity::class.java))
        }
    }
}