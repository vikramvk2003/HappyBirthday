package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
    }

    fun CreateBirthdayCard(view: View)
    {
        val Name = Name.text
        Toast.makeText(this, "$Name",Toast.LENGTH_LONG).show()
    }

}