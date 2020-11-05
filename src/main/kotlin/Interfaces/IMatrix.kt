package Interfaces

interface IMatrix {

    val rowNumber : Int

    val columnNumber : Int

    fun getValue(rowIndex: Int, columnIndex: Int) : Double?

    fun setValue(rowIndex: Int, columnIndex: Int, value: Double)
}