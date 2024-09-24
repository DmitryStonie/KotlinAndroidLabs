package com.example.lab1

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    //lateinit var binding: ActivityMainBinding
    lateinit var valutes: ArrayList<Valute>
    //lateinit var mainHandler: Handler
    lateinit var valuteAdapter: ValuteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        valutes = ArrayList<Valute>()

        valuteAdapter = ValuteAdapter(this, R.layout.valute_item, valutes)
        val valutesList = findViewById<ListView>(R.id.valutes_list)
        valutesList.adapter = valuteAdapter

        val model = ViewModelProvider(this).get(MyViewModel::class.java)
        model.getValue().observe(this) { value: ArrayList<Valute> ->
            value.forEach { valutes.add(it) }
            valuteAdapter.notifyDataSetChanged()
        }
        model.execute()
    }

}