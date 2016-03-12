package functionsasobjects

import com.atomicscala.AtomicTest._

object functionobjects extends App {
  
  // Q.21
  val dogYears = (x: Int) => x * 7
  dogYears(10) is 70
  
  // Q.22
  var s: String = ""
  val v = Vector(1, 5, 7, 8)
  v.foreach({x => s = s + dogYears(x) + " "})
  s is "7 35 49 56 "
  
  // Q.23
  s = ""
  val numbers = Vector(1, 2, 5, 3, 7)
  numbers.foreach({x => s = s + (x * x) + " "})
  s is "1 4 25 9 49 "
  
}