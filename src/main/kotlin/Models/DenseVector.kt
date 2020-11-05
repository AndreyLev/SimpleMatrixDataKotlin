package Models

import Interfaces.IVector

class DenseVector(val size: Int) : IVector {

    val vector = arrayOfNulls<Double>(size)

    override val DIM: Int
        get() = size


    override fun getValue(index: Int): Double? = vector[index]

    override fun setValue(index: Int, value: Double) {
        vector[index] = value
    }


}