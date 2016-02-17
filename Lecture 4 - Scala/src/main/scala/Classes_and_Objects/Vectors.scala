package Classes_and_Objects

import com.atomicscala.AtomicTest._

object Vectors {

  /**
   * A class for practising with vectors.
   *
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    val vec1 = Vector("The", "dog", "visited", "the", "fire", "station")
    
    for(v <- vec1){
      println(v)
    }
    
    val sentence : String = vec1.mkString(" ")
    
    sentence.toString() is "The dog visited the fire station"
    println()
    
    val vec2 = Vector(1, 2, 3)
    val vec3 = Vector(1.1, 2.2, 3.3)
    
    println(vec2.sum)
    println(vec3.sum)
    println
    println(vec2.min)
    println(vec3.min)
    println
    println(vec2.max)
    println(vec3.max)
    
    val myVector1 = Vector(1, 2, 3, 4, 5, 6)
    val myVector2 = Vector(1, 2, 3, 4, 5, 6)
    myVector1 is myVector2
    
  }

}