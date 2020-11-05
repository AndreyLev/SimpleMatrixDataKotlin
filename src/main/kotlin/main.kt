import Models.DenseMatrix
import Models.MatrixStatistics
import Models.SomeMatrix
import Models.fillTheMatrix

fun DenseMatrix.print() {
    for (i in 0 until this.rowNumber) {
        for (j in 0 until this.columnNumber) {
            print("%5.2f ".format(this.getValue(i,j)))
        }
        println()
    }
}

fun SparseMatrix.print() {
    for (i in 0 until this.rowNumber) {
        for (j in 0 until this.columnNumber) {
            if (this.getValue(i,j) == 0.0) {
                print("%5s ".format(""))
            } else
                print("%5.2f ".format(this.getValue(i,j)))
        }
        println()
    }
}

fun SomeMatrix.printMatrixAndGetItsInfo(
        maxValue: Double = 15.0,
        nonValueElementsCount: Int = 20) {
    this.fillTheMatrix(maxValue,nonValueElementsCount)
    if (this is DenseMatrix) {
        this.print()
    } else if (this is SparseMatrix) {
        this.print()
    }
    val matrixStat = MatrixStatistics(this)
    println("Сумма всех элементов: ${matrixStat.elementsSum}")
    println("Среднее значение матрицы: ${matrixStat.averageValue}")
    println("Максимальное значение матрицы: ${matrixStat.maxValue}")
    println("Количество ненулевых элементов: ${matrixStat.nonValuesElementsCount}")
}

fun main(args: Array<String>) {

    val denseMatrix = DenseMatrix(5,5)
    denseMatrix.printMatrixAndGetItsInfo(30.0, 13)

    println()

    val sparseMatrix = SparseMatrix(5,7)
    sparseMatrix.printMatrixAndGetItsInfo(20.5, 17)
}