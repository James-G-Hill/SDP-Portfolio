package classargs

import com.atomicscala.AtomicTest._

// Q.3 & Q.4 & Q.5
object TestClassArgs extends App {
  
  def squareThem(them: Int*): Int = {
    var sum = 0
    for(t <- them){sum = sum + (t * t)}
    sum
  }
  
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
  
  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4
  
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3
  
  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21
  
}

class Family(name: String*) {
  def familySize() = name.size
}

class FlexibleFamily(parent1: String, parent2: String, children: String*) {
  def familySize() = 2 + children.size
}