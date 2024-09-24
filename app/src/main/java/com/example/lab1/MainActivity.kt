package com.example.lab1

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

//    lateinit var countries: Array<String>
//    lateinit var binding: ActivityMainBinding
//    var mainHandler: Handler = Handler()


    lateinit var valutes: ArrayList<Valute>
    lateinit var valutesList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        valutes = ArrayList<Valute>()
        setInitialData()
        // получаем элемент ListView
        valutesList = findViewById<ListView>(R.id.valutesList)

        // создаем адаптер
        val stateAdapter = StateAdapter(this, R.layout.valute_item, valutes)

        // устанавливаем адаптер
        valutesList.setAdapter(stateAdapter)

        // слушатель выбора в списке
        val itemListener =
            OnItemClickListener { parent, v, position, id -> // получаем выбранный пункт
                val selectedValute: Valute = parent.getItemAtPosition(position) as Valute
                Toast.makeText(
                    applicationContext, "Был выбран пункт " + selectedValute.name,
                    Toast.LENGTH_SHORT
                ).show()
            }
        valutesList.setOnItemClickListener(itemListener)

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        fetchData().start()
//
//
//        countries = arrayOf("USD", "EUR", "RUB", "AUD", "AED")
//
//        val spinner = findViewById<Spinner>(R.id.spinner_top)
//        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, countries)
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinner.adapter = adapter;


//        val itemSelectedListener: AdapterView.OnItemSelectedListener =
//            object : AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(
//                    parent: AdapterView<*>,
//                    view: View,
//                    position: Int,
//                    id: Long
//                ) {
//                    // Получаем выбранный объект
//
//                    val item = parent.getItemAtPosition(position) as String
//                    //можно менять валюта
//                }
//
//                override fun onNothingSelected(parent: AdapterView<*>?) {
//                }
//            }
//        spinner.onItemSelectedListener = itemSelectedListener
    }

//    inner class fetchData : Thread() {
//        var data: String = ""
//        var moneyList: ArrayList<String> = ArrayList<String>()
//
//        override fun run() {
//
//             try {
//                 val url: URL = URL("https://www.cbr-xml-daily.ru/daily_json.js")
//                 val httpURLConnection: URLConnection? = url.openConnection();
//                 val inputStream: InputStream = httpURLConnection!!.getInputStream()
//                 val bufferedReader: BufferedReader = BufferedReader(InputStreamReader(inputStream))
//                 var line: String? = bufferedReader.readLine()
//
//                 while (line != null){
//                     data = data + line
//                     line = bufferedReader.readLine()
//                 }
//                 if(!data.isEmpty()){
//                     val jsonObject = JSONObject(data)
//                     val valute = jsonObject.getJSONObject("Valute")
//                     val abobe = valute.names()
//
//                 }
//
//             } catch (e: MalformedURLException){
//                 e.printStackTrace()
//             } catch (e: IOException){
//                 e.printStackTrace()
//             } catch (e: JSONException){
//                 e.printStackTrace()
//             }
//         }
//
//    }
    private fun setInitialData() {
        valutes.add(Valute("1123", "fds", "USD", 1, "Американский доллар", 110.00, 90.00))
        valutes.add(Valute("1123", "fds", "USD", 1, "Америкfdsский доллар", 100.00, 90.00))
        valutes.add(Valute("1123", "fds", "USD", 1, "Америкаdsffский доллар", 30.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Американский доллар", 110.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкfdsский доллар", 100.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкаdsffский доллар", 30.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Американский доллар", 110.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкfdsский доллар", 100.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкаdsffский доллар", 30.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Американский доллар", 110.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкfdsский доллар", 100.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкаdsffский доллар", 30.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Американский доллар", 110.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкfdsский доллар", 100.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкаdsffский доллар", 30.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Американский доллар", 110.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкfdsский доллар", 100.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкаdsffский доллар", 30.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Американский доллар", 110.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкfdsский доллар", 100.00, 90.00))
    valutes.add(Valute("1123", "fds", "USD", 1, "Америкаdsffский доллар", 30.00, 90.00))
    }
}