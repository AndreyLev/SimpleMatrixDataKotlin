import Interfaces.IVector
import Models.SomeMatrix
import Models.SparseVector

class SparseMatrix(rowCount: Int, columnCount: Int)
    :SomeMatrix(rowCount, columnCount) {

    override fun create(size: Int): IVector = SparseVector(columnNumber)
}