package Bridge

trait Car {
  
  def produceProduct
  def assemble
  def printDetails
  
}

class BigWheel(p : Product, s : String) extends Car {
  
  def produceProduct = {
    println("Producing " + p.toString)
    println("Modifying product " + p.toString + " according to " + s)
  }
  
  def assemble = {
    println("Assembling " + p.toString + " for " + s)
  }
  
  def printDetails = {
    println("Car: " + s + ", Product: " + p.toString)
  }
  
}

class Motoren(p : Product, s : String) extends Car {
  
  def produceProduct = {
    println("Producing " + p.toString)
    println("Modifying product " + p.toString + " according to " + s)
  }
  
  def assemble = {
    println("Assembling " + p.toString + " for " + s)
  }
  
  def printDetails = {
    println("Car: " + s + ", Product: " + p.toString)
  }
  
}