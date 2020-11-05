package Models

import Interfaces.IMatrix

class MatrixStatistics(val matrix: IMatrix) {

    val elementsSum : Double
     get() {
         var sum : Double = 0.0
         for (i in 0 until matrix.rowNumber) {
             for (j in 0 until matrix.columnNumber) {
                 sum += matrix.getValue(i,j)!!
             }
         }
         return sum
     }

    val averageValue : Double
     get() {
        return elementsSum / nonValuesElementsCount
     }

    val maxValue : Double
        get() {
            var max : Double = 0.0
            for (i in 0 until matrix.rowNumber) {
                for (j in 0 until matrix.columnNumber) {
                    if (matrix.getValue(i,j)!! > max)
                        max = matrix.getValue(i,j)!!
                }
            }
            return max
        }

    val nonValuesElementsCount : Int
        get() {
            var nonValuesElementsCount : Int = 0
            for (i in 0 until matrix.rowNumber) {
                for (j in 0 until matrix.columnNumber) {
                    if (matrix.getValue(i,j)!! > 0)
                        nonValuesElementsCount++
                }
            }
            return nonValuesElementsCount
        }
}