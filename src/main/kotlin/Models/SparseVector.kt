package Models

import Interfaces.IVector

class SparseVector(val size: Int) : IVector {

    val values = arrayOfNulls<Double>(size)

    override val DIM: Int
        get() = size

    override fun getValue(index: Int): Double? = values[index]

    override fun setValue(index: Int, value: Double) {
        values[index] = value
    }

}