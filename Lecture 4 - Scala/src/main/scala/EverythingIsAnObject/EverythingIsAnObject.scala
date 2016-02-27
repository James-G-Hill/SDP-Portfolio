package EverythingIsAnObject

import MyPackage._
import com.atomicscala.AtomicTest._

object EverythingIsAnObject {
  
  /**
   * Scala Day 1 - Exercises (Part 2)
   *
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    // Q1
    val a1 = 42
    println("value of a1 = " + a1)
    println("type of a1 = " + a1.getClass)
    val b1 = true
    println("value of b1 = " + b1)
    println("type of b1 = " + b1.getClass)
    val c1 = 123L
    println("value of c1 = " + c1)
    println("type of c1 = " + c1.getClass)
    val d1 = 42.0
    println("value of d1 = " + d1)
    println("type of d1 = " + d1.getClass)
    
    // Q2
    val a2 = 'a'
    println("value of a2 = " + a2)
    println("type of a2 = " + a2.getClass)
    val b2 = "a"
    println("value of b2 = " + b2)
    println("type of b2 = " + b2.getClass)
    
    // Q3
    val a3 = "Hello world!"
    println("value of a3 = " + a3)
    println("type of a3 = " + a3.getClass)
    val b3 = println("Hello world!")
    println("value of b3 = " + b3)
    println("type of b3 = " + b3.getClass)
    
    // Q4
    // That is not a valid literal.
    
    // Q5.a
    val a5a = 1
    val b5a = 2
    def Q5a = {if(a5a > b5a) "alien" else "predator"}
    println("value of Q5a = " + Q5a)
    println("type of Q5a = " + Q5a.getClass)
    
    // Q5.b
    val a5b = 1
    val b5b = 2
    def Q5b = {if(a5b > b5b) "alien" else 2001}
    println("value of Q5b = " + Q5b)
    println("type of Q5b = " + Q5b.getClass)
    
    // Q5.c
    def Q5c = {if(true) "hello"}
    println("value of Q5c = " + Q5c)
    println("type of Q5c = " + Q5c.getClass)
    
    // Q6
    def Q6a = {1 + 2 + 3}
    println("value of Q6a = " + Q6a)
    println("type of Q6a = " + Q6a.getClass)
    
    def Q6b = {6}
    println("value of Q6b = " + Q6b)
    println("type of Q6b = " + Q6b.getClass)
    
    // Q7
    println("Q7 squared: " + calc.square(2))
    println("Q7 cubed: " + calc.cube(2))
    
    // Q8
    val a8 : Int = 2
    println("Q8 squared: " + calc2.square(a8))
    println("Q8 cubed: " + calc2.cube(a8))
    
    // Q9
    // The output is :
    // 
    // b
    // a
    // c
    // a
    // a
    // res0: String = 3c31
    // 
    // The type is : String
    // The value is : 3c31
    
    // Q10
    val a10 = Alien.greet(Person)
    println("value of a10 = " + a10)
    println("type of a10 = " + a10.getClass)
    println
    
    // Q11
    //
    // Methods are expressions because they evaluate to a value.
    
    // Q12
    val a12 = Class1
    println(a12.toString)
    val b12 = Class2
    println(b12.toString)
    val c12 = Class3
    println(c12.toString)
    println
    
    // Q13
    val r1 = Range(0, 10)
    r1 is Range(0, 10)
    val r2 = Range(0, 10).inclusive
    r2 is Range(0, 10).inclusive
    println
    
    // Q14
    var total: Int = 0
    for(i <- Range(0, 10).inclusive){
      total = total + i
    }
    total is 55
    println
    
    // Q15
    val totalEvens = Range(0, 10, 2).inclusive.sum
    totalEvens is 30
    println
    
    // Q16
    var evens, odds = 0
    for(i <- Range(0, 10).inclusive){
      if(i % 2 == 0)
        evens += i
      else
        odds += i
    }
    evens is 30
    odds is 25
    
    // Q17
    var sentence = ""
    val vec = Vector("The", "dog", "visited", "the", "firehouse")
    for(i <- vec){
      println(i)
      sentence = sentence + i + " "
    }
    sentence.toString() is "The dog visited the firehouse "
    println(sentence.replace("firehouse ", "firehouse!"))
    
    // Q18
    for(i <- sentence.split(" ")) print((i + " ").toString.reverse)
    println
    
    // Q19
    for(i <- sentence.split(" ").reverseIterator) print(i + " ")
    println
    
    // Q20
    // a
    val a20i = Vector(2, 3, 1)
    println(a20i.min)
    println(a20i.max)
    println(a20i.sum)
    val a20d = Vector(2.5, 3.5, 1.5)
    println(a20d.min)
    println(a20d.max)
    println(a20d.sum)
    println
    
    // b
    val b20 = Vector("a", "b", "c")
    println(b20.min)
    println(b20.max)
    // println(b20.sum) won't work
    println
    
    // c
    println(Range(0, 10).inclusive.sum is 55)
    println
    
    // Q21
    val a21 = List("c", "a", "b")
    println(a21)
    println(a21.reverse)
    println(a21.sorted)
    println
    val b21 = Set("c", "a", "b")
    println(b21)
    // println(b21.reverse) // can't reverse a set of strings
    // println(b21.sorted) // can't sort a set of strings
    println
    
    // Q22
    isPalindrome("mum") is true
    isPalindrome("dad") is true
    isPalindrome("street") is false
    println
    
    // Q23
    forecast(100) is "Sunny"
    forecast(80) is "Mostly Sunny"
    forecast(50) is "Partly Sunny"
    forecast(20) is "Mostly Cloudy"
    forecast(0) is "Cloudy"
    forecast(15) is "Unknown"
    println
    
    // Q24
    class SimpleTime(val hours:Int, val minutes:Int)
    val t = new SimpleTime(hours=5, minutes=30)
    t.hours is 5
    t.minutes is 30
    println
    
    // Q25
    class SimpleTime2(val hours:Int, val minutes:Int = 0)
    val t2 = new SimpleTime2(hours=10)
    t2.hours is 10
    t2.minutes is 0
    println
    
    // Q26
    class Planet(val moons:Int = 0, val name:String, val description:String){
      def hasMoon: Boolean = {moons > 0}
    }
    val p = new Planet(name = "Mercury", description = "small & hot", moons = 0)
    p.hasMoon is false
    println
    
    // Q27
    // a
    case class Person2(first:String, last:String, email:String)
    val p2 = Person2("Jane", "Smile", "jane@smile.com")
    p2.first is "Jane"
    p2.last is "Smile"
    p2.email is "jane@smile.com"
    val p3 = Person2("Ron", "House", "ron@house.com")
    val p4 = Person2("Sally", "Dove", "sally@dove.com")
    val people = Vector(p2, p3, p4)
    people(0) is "Person2(Jane,Smile,jane@smile.com)"
    people(1) is "Person2(Ron,House,ron@house.com)"
    people(2) is "Person2(Sally,Dove,sally@dove.com)"
    println
    
    // Q28
    case class Name(firstName:String, lastName:String)
    val m = Map("sally@taylor.com" -> Name("Sally","Taylor"))
    m("sally@taylor.com") is Name("Sally", "Taylor")
    println
    
    // Q29
    val m2 = Map("sally@taylor.com" -> Name("Sally","Taylor"),
    "jiminy@cricket.com" -> Name("Jiminy","Cricket"))
    m2("jiminy@cricket.com") is Name("Jiminy","Cricket")
    m2("sally@taylor.com") is Name("Sally","Taylor")
    println
    
    // Q30
    val a30 = Set("English", "French", "Spanish", "German", "Chinese")
    class Languages(var langs:Set[String])
    val lan = new Languages(a30)
    for(i <- lan.langs) println(i)
    println
    // a
    lan.langs = lan.langs + "Turkish"
    for(i <- lan.langs) println(i)
    println
    // b
    lan.langs = lan.langs + "French"
    for(i <- lan.langs) println(i)
    println
    // c
    lan.langs = lan.langs - "Spanish"
    for(i <- lan.langs) println(i)
    println
    // d
    val m3 = Map(
      "sally@taylor.com" -> Name("Sally","Taylor"),
      "jiminy@cricket.com" -> Name("Jiminy","Cricket"),
      "mary@smith.com" -> Name("Mary","Smith"))
    val m4 = m3-"jiminy@cricket.com"
    println(m4.toString())
    
  }
  
  def isPalindrome(a : String) : Boolean = {
    a == a.reverse
  }
  
  def forecast(a : Int) : String = {
    a match{
      case 0 => "Cloudy"
      case 20 => "Mostly Cloudy"
      case 50 => "Partly Sunny"
      case 80 => "Mostly Sunny"
      case 100 => "Sunny"
      case _ => "Unknown"
    }
  }
  
}

object calc {
  
  def square(d:Double) = {
    d * d
  }
  
  def cube(d:Double) = {
    d * square(d)
  }
  
}

object calc2 {
  
  def square[N](d : N)(implicit numeric: Numeric[N]) : N = {
    numeric.times(d, d)
  }
  
  def cube[N](d : N)(implicit numeric: Numeric[N]) : N = {
    numeric.times(d, square(d))
  }
  
}

object Person {
  val firstName = "James"
  val lastName = "Hill"
}

object Alien {
  def greet(p : Person.type) = {
    "Hello " + p.firstName
  }
}