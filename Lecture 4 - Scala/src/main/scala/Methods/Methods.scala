package Methods

object Methods {

  /**
   * Methods for the Scala exercises.
   *
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    // method 1
    def getSquare(num: Int) : Int = {
      return num * num
    }
    
    val a = getSquare(3)
    assert(a == 9)
    println(a)
    
    val b = getSquare(6)
    assert(b == 36)
    println(b)
    
    val c = getSquare(5)
    assert(c == 25)
    println(c)
    
    // method 2
    def isArg1GreaterThanArg2(num1: Double, num2: Double) : Boolean = {
      return num1 > num2
    }
    
    val t1 = isArg1GreaterThanArg2(4.1, 4.12)
    assert(t1 == false)
    println(t1)
    
    val t2 = isArg1GreaterThanArg2(2.1, 1.2)
    assert(t2 == true)
    println(t2)
    
    // method 3
    def manyTimesString(str: String, num: Int) : String = {
      return str * num
    }
    
    val m1 = manyTimesString("abc", 3)
    assert("abcabcabc" == m1, "Printed : " + m1)
    println(m1)
    
    val m2 = manyTimesString("123", 2)
    assert("123123" == m2, "Printed : " + m2)
    println(m2)
    
  }

}