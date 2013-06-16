import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer

class Triangle {
  val rows: ArrayBuffer[Array[Node]] = ArrayBuffer.empty

  def addRow(row: Array[Node]) {

    if (rows.length == 0) {
      rows.append(row)
      return
    }
    
    val prevRow = rows.last
    rows.append(row)

    for (i <- 0 to prevRow.length - 1) {
      prevRow(i).leftChild = row(i)
      prevRow(i).rightChild = row(i + 1)
    }
  }

  def printMinPath() {

    //Call setCost on every node, starting at the bottom of the triangle
    rows.reverse.foreach(_.foreach(_.setCost()))
    
 

    var currentNode = rows(0)(0)

    //Start at the root node and walk down the lowest cost path
    do {
      print(currentNode.cost + " + ")
      currentNode = currentNode.lowestCostChild
    } while (currentNode.lowestCostChild != null)
    println(currentNode.cost + " = " + rows(0)(0).totalCost)
  }
}
