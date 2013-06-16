import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

object MinPath extends App {

  override def main(args: Array[String]) {
    
    
    val curTime = System.currentTimeMillis();
    var triangle: Triangle = new Triangle
    var rows: ListBuffer[Array[Node]] = ListBuffer.empty
    //Read in the triangle from a file
    io.Source.fromFile("triangle10000.txt").getLines
      .foreach(line =>
        triangle.addRow(
          //convert each number in the line into a Node
          (line split (" ") map (nodeCost => new Node(nodeCost.toInt))).toArray)
        )

    triangle.printMinPath
    println(System.currentTimeMillis() - curTime)
    
            val mb:Int = 1024*1024;
         
        //Getting the runtime reference from system
        val runtime:Runtime = Runtime.getRuntime();
         
        System.out.println("##### Heap utilization statistics [MB] #####");
         
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() / mb);
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
  }
}