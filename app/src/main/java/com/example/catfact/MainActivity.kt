package com.example.catfact

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Cat_Fact_Text: TextView = findViewById(R.id.Cat_Fact_Text)

        var CatFactsAPI = TextAdapter.getInstance().create(CatFactsAPI::class.java)

        val Button:Button=findViewById(R.id.Cat_Fact_Button)
        Button.setOnClickListener {

            GlobalScope.launch {
                val result = CatFactsAPI.getFact()
                if (result !=null)
                {

                    Cat_Fact_Text.text= result.body()!!.fact
                }
            }
        }

    }
}