package Classes_and_Objects

object Classes_and_Objects {

  /**
   * Testing some objects.
   *
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    // Range objects
    
    val ran1 = 1 to 10
    println("Step of ran1 = " + ran1.step)
    
    val ran2 = 1 to 10 by 2
    println("Step of ran2 = " + ran2.step)
    
    var s1 = "Sally"
    val s2 = "Sally"
    if(s1.equals(s2))
      println("s1 and s2 are equal")
    else
      println("s1 and s2 are not equal")
    
  }

}