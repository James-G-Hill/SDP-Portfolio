package Questions

import com.atomicscala.AtomicTest._

object traitsandinheritance extends App {
  
  // Q5.a
  val c = new Circle(Red(), 2)
  println("Sides : " + c.sides)
  println("Perimeter : " + c.perimeter)
  println("Area : " + c.area)
  println
  
  val r = new Rectangle(Pink(), 4, 2)
  println("Sides : " + r.sides)
  println("Perimeter : " + r.perimeter)
  println("Area : " + r.area)
  println
  
  val s = new Square(Yellow(), 4)
  println("Sides : " + s.sides)
  println("Perimeter : " + s.perimeter)
  println("Area : " + s.area)
  println
  
  // Q5.c
  Draw(Circle(Red(), 10))
  Draw(Rectangle(Pink(), 3, 4))
  Draw(Square(Yellow(), 5))
  println
  Draw(Circle(Custom(100, 100, 100), 5))
  Draw(Rectangle(Custom(20, 20, 20), 2, 9))
  
}

object Draw {
  
  def apply(shape: Shape) {
    
    shape match {
      case _: Circle => 
        println("A " + getColour(shape) + " " + shape.getClass.getSimpleName + " of radius " + 
                shape.asInstanceOf[Circle].radius + "cm")
      case _: Rectangle => 
        println("A " + getColour(shape) + " " + shape.getClass.getSimpleName + " of width " + 
                shape.asInstanceOf[Rectangle].side1 + "cm and height "
              + shape.asInstanceOf[Rectangle].side2 + "cm")
      case _: Square => 
        println("A " + getColour(shape) + " " + shape.getClass.getSimpleName + " of width " + 
                shape.asInstanceOf[Square].side + "cm")
      case _ =>
        println("Not a valid shape.")
    }
    
  }
  
  def getColour(shape: Shape): String = {
    
    if(shape.c.isInstanceOf[Custom]){
      shape.c.lightOrDark
    } else {
      shape.c.getClass.getSimpleName
    }
  }
  
}

sealed trait Shape {
  
  def sides: Int
  def perimeter: Double
  def area: Double
  val c: Colour

}

case class Circle(c: Colour, radius: Double) extends Shape {
  def sides = 1
  def perimeter = 2 * math.Pi * radius
  def area = math.Pi * (radius * radius)
  val col = c
}

// Q5.b
abstract class Rectangular extends Shape {
  def sides = 4
}

case class Rectangle(c: Colour, side1: Double, side2: Double) extends Rectangular {
  def perimeter = (side1 * 2) + (side2 * 2)
  def area = side1 * side2
  val col = c
}

case class Square(c: Colour, side: Double) extends Rectangular {
  def perimeter = side * sides
  def area = side * side
  val col = c
}

// Q.5.d.i
sealed trait Colour {
  
  val R: Int
  val G: Int
  val B: Int
  
  // Q.5.d.iv
  def lightOrDark: String = {
    if(R > 50 || G > 50 || B > 50) "light" else "dark"
  }
  
}

// Q.5.d.ii
case class Red() extends Colour {
  val R = 100
  val G = 0
  val B = 0
}

case class Yellow() extends Colour {
  val R = 0
  val G = 100
  val B = 100
}

case class Pink() extends Colour {
  val R = 50
  val G = 0
  val B = 0
}

// Q.5.d.iii
case class Custom(R: Int, G: Int, B: Int) extends Colour {}