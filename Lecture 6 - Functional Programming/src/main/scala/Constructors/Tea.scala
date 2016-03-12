package Constructors

import com.atomicscala.AtomicTest._

object TeaTest extends App {
  
  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0
  
  val lemonZinger = new Tea(decaf = true, name = "Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger"
  lemonZinger.calories is 0
  
  val sweetGreen = new Tea(name = "Jasmine Green", sugar = true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  
  val teaLatte = new Tea(sugar = true, milk = true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
  
}

class Tea(name: String = "Earl Grey",
          decaf: Boolean = false,
          sugar: Boolean = false,
          milk: Boolean = false) {
  
  def describe: String = {
    var description = name
    if(milk){description = description + " + milk"}
    if(sugar){description = description + " + sugar"}
    description
  }
  
  def calories: Int = {
    var cals = 0
    if(milk){cals = cals + 100}
    if(sugar){cals = cals + 16}
    cals
  }
  
}