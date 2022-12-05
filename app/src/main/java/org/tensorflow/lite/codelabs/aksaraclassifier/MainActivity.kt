package org.tensorflow.lite.codelabs.aksaraclassifier

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun canva(view: View?) {
        startActivity(Intent(this, CanvasActivity::class.java))
    }
    fun camera(view: View?) {
        startActivity(Intent(this, CamGalActivity::class.java))
    }
}