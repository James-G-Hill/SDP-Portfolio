package Builder

object TestBuilderPattern {

  def main(args: Array[String]): Unit = {
    
    var carBuilder : CarBuilder = new SedanCarBuilder
    var director : CarDirector = new CarDirector(carBuilder)
    director.build
    var car : Car = carBuilder.getCar
    println(car.toString)
    
    carBuilder = new SportsCarBuilder
    director = new CarDirector(carBuilder)
    director.build
    car = carBuilder.getCar
    println(car.toString)
  }

}

class CarDirector(carBuilder : CarBuilder) {
  
  def build = {
    carBuilder.build
  }
  
}