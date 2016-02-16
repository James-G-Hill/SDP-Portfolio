package Classes_and_Objects

object Creating_Classes {

  /**
   * An attempt to create some new classes.
   *
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    val hippo = new Hippo()
    val lion = new Lion()
    val tiger = new Tiger()
    val monkey = new Monkey()
    val giraffe = new Giraffe()
    
    println(hippo.toString)
    println(lion.toString)
    println(tiger.toString)
    println(monkey.toString)
    println(giraffe.toString)
    println()
    println(lion.toString)
    println(giraffe.toString)
    println(giraffe.toString)
    
  }
  
  class Hippo(){}
  
  class Lion(){}
  
  class Tiger(){}
  
  class Monkey(){}
  
  class Giraffe(){}

}
