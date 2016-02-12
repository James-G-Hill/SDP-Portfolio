package Expression

object Expressions {

  /**
   * An expression that evaluates the weather.
   *
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    var sky = "sunny"
    var temp = 81
    
    // Expression 1
    var weather = if(sky == "sunny" && temp > 80) true else false
    println("Expression 1 : " + weather)
    
    sky = "partly cloudy"
    
    // Expression 2
    weather = if((sky == "sunny" || sky == "partly cloudy") &&
                 temp > 80) true else false
    println("Expression 2 : " + weather)
    
    sky = "sunny"
    temp = 10
    
    // Expression 3
    weather = if((sky == "sunny" || sky == "partly cloudly") &&
                 (temp < 20 || temp > 80)) true else false
    println("Expression 3 : " + weather)
    
    var fahrenheit = 100.0
    
    // Expression 4
    var celsius = (fahrenheit - 32.0) * 5/9
    println("Expression 4: " + celsius)
    
    // Expression 5
    fahrenheit = (celsius * 9/5) + 32.0
    println("Expression 5: " + fahrenheit)
    
  }
  
}