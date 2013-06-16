import java.io.FileWriter
import java.util.Random

object TriangleGen extends App {

  var file = new java.io.File("./triangle.txt")
   var fw = new FileWriter(file)
   var random = new Random
   var lineNum = 0
  for (lineNum <- 0 to 10000) {
    var posNum = 0
    for(posNum <- 0 to lineNum) {
      fw.write(random.nextInt(100).toString + " ")

    }
    println(lineNum)
    fw.write("\n");
    fw.flush();
  }
  println(file.getCanonicalPath())
  fw.close()
  
}