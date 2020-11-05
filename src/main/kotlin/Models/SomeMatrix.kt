package Models

import Interfaces.IMatrix
import Interfaces.IVector

abstract class SomeMatrix : IMatrix {

    override val rowNumber: Int
    override val columnNumber: Int

    private var matrix : Array<IVector?>

    constructor(rowCount: Int, columnCount: Int) {
        rowNumber = rowCount
        columnNumber = columnCount
        matrix = arrayOfNulls<IVector>(rowCount)
        for (index in matrix.indices) {
            matrix[index] = create(columnCount)
        }
    }

    abstract fun create(size: Int) : IVector

    override fun getValue(rowIndex: Int, columnIndex: Int): Double? {
        return matrix[rowIndex]?.getValue(columnIndex)
    }

    override fun setValue(rowIndex: Int, columnIndex: Int, value: Double) {
        matrix[rowIndex]?.setValue(columnIndex, value)
    }


}