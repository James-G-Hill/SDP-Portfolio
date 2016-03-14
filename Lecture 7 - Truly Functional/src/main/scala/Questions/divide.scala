package Questions

// Q6
object run extends App {
  
  val finite = divide(1, 2)
  if(finite.isInstanceOf[Finite]) {println("Finite(" + finite.asInstanceOf[Finite].x + ")")}
  println
  
  val infinite = divide(1, 0)
  if(infinite.isInstanceOf[Infinite]) {println("Infinite(" + infinite.asInstanceOf[Infinite].x + ")")}
  
}

object divide {
  
  def apply(x: Int, y: Int): DivisionResult = {
    
    if(y == 0){
      new Infinite(0)
    } else {
      new Finite(x / y)
    }
    
  }
  
}

sealed trait DivisionResult

case class Finite(x: Int) extends DivisionResult

case class Infinite(x: Int) extends DivisionResult