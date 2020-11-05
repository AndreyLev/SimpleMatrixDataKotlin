package Models

import kotlin.random.Random

fun SomeMatrix.fillTheMatrix(maxValue: Double, nonValueElementsCount: Int) {
    val matrixSize = this.rowNumber * this.columnNumber
    var nonValueElmntsCount =
            if (nonValueElementsCount >= matrixSize) matrixSize
            else nonValueElementsCount

    var counter = 0
    var value: Double = 0.0
    for (i in 0 until this.rowNumber) {
        for (j in 0 until this.columnNumber) {
            if (counter >= nonValueElmntsCount)
                value = 0.0
            else
                value = maxValue * Random.nextDouble(0.0,1.0)
            this.setValue(i,j,value)
            counter++
        }
    }

    shuffleMatrix()
}

fun SomeMatrix.shuffleMatrix() {
    val matrixSize = this.rowNumber * this.columnNumber
    val matrixList : ArrayList<Double> = ArrayList<Double>(matrixSize)

    for (i in 0 until this.rowNumber) {
        for (j in 0 until this.columnNumber) {
            matrixList.add(this.getValue(i,j)!!)
        }
    }

    var j : Int
    for (i in matrixList.size-1 downTo 0) {
        j = Random.nextInt(i+1)
        var temp : Double
        temp = matrixList[j]
        matrixList[j] = matrixList[i]
        matrixList[i] = temp
    }

    var listCounter = 0
    for(i in 0 until this.rowNumber) {
        for (j in 0 until this.columnNumber) {
            this.setValue(i,j,matrixList[listCounter])
            listCounter++
        }
    }
}