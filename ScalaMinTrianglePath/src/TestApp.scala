import scala.annotation.tailrec

object TestApp extends App {
  @tailrec
  def factorial(x: Int, accumulator: Int = 1): Int = {
    if (x == 1) accumulator else factorial(x - 1, accumulator * x)
  }
  print(factorial(5))
  

  
}