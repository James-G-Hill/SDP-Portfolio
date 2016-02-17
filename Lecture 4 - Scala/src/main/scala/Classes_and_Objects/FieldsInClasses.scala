package Classes_and_Objects

import com.atomicscala.AtomicTest._

object FieldsInClasses {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    // Part 1
//    val cup = new Cup
//    cup.add(45) is 45
//    cup.add(-15) is 30
//    cup.add(-50) is -20
    
    // Part 2
//    val cup = new Cup
//    cup.add(45) is 45
//    cup.add(-55) is 0
//    cup.add(10) is 10
//    cup.add(-9) is 1
//    cup.add(-2) is 0
    
    // Part 3
//    val cup = new Cup
//    cup.percentFull = 56
//    cup.percentFull is 56
    
    // Part 4
    val cup = new Cup
    cup.set(56)
    cup.get() is 56
    
  }
  
  class Cup {
    var percentFull = 0
    val max = 100
    val min = 0
    
    def add(increase:Int) : Int = {
      percentFull += increase
      if(percentFull > max){
        percentFull = max
      } else if(percentFull < 0){
        percentFull = min
      }
      percentFull
    }
    
    def set(i:Int) : Int = {
      percentFull = i
      percentFull
    }
    
    def get() : Int = {
      percentFull
    }
    
  }

}