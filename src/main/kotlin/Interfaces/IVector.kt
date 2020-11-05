package Interfaces

interface IVector {

    val DIM : Int

    fun getValue(index: Int) : Double?;

    fun setValue(index: Int, value: Double);
}