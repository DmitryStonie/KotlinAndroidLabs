package com.example.lab1

class Valute(_id: String, _numCode: String, _charCode: String, _nominal: Int, _name: String, _value: Double, _previous: Double) {
    private val id: String = _id
    private val numCode: String = _numCode
    private  val nominal: Int = _nominal
    val charCode: String = _charCode
    val name: String = _name
    val value: Double = _value
    private val previous: Double = _previous

}