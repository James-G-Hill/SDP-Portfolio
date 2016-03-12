package parameterizedtypes

import com.atomicscala.AtomicTest._

object parameterizedtypes extends App {
  
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }
  
  def explicit[T](c1: T, c2: T, c3: T): Vector[T] = {
    Vector(c1, c2, c3)
  }
  
  def explicitList[T](v: Vector[T]): List[T] = {
    v.toList
  }
  
  def explicitSet[T](v: Vector[T]): Set[T] = {
    v.toSet
  }
  
  // Q.17
  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicit('a', 'b', 'c') is "Vector(a, b, c)"
  
  explicit(1.0, 2.0, 3.0) is Vector(1.0,2.0,3.0)
  
  // Q.18
  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
  
  // Q.19
  explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
  explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
  
  // Q.20
  var str = ""
  explicitSet(Vector(1, 2, 3, 2, 3, 4)).foreach({x => str = str + x + ","})
  str is "1,2,3,4,"
  
}