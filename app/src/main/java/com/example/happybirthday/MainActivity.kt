package com.example.happybirthday

import android.content.Intent
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
        val name = Name.editableText.toString()
        val intent = Intent(this, selectCard::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name )
        startActivity(intent)

    }

}