package Models

import Interfaces.IVector

class DenseMatrix(rowCount: Int, columnCount: Int)
    : SomeMatrix(rowCount, columnCount) {

     override fun create(size: Int): IVector = DenseVector(columnNumber)
}