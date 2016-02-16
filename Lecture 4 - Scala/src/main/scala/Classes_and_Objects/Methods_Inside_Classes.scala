package Classes_and_Objects

object Methods_Inside_Classes {

  /**
   * Methods inside some classes.
   *
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    // Test the sailboat
    val sailboat = new Sailboat
    val r1 = sailboat.raise()
    assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
    val r2 = sailboat.lower()
    assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
    
    // Test the motorboat
    val motorboat = new Motorboat
    val s1 = motorboat.on()
    assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
    val s2 = motorboat.off()
    assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
    
    // Test the flare
    val flare = new Flare
    val f1 = flare.light
    assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
    
    // Test the sailboat signal
    val sailboat2 = new Sailboat
    val signal = sailboat2.signal
    assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
    
    // Test the motorboat signal
    val motorboat2 = new Motorboat
    val signal2 = motorboat2.signal
    assert(signal2 == "Flare used!", "Expected Flare used! Got " + signal)
    
  }
  
  class Sailboat(){
    
    // raise the sails
    def raise() : String = {
      val s = "Sails raised"
      println(s)
      return s
    }
    
    // lower the sails
    def lower() : String = {
      val s = "Sails lowered"
      println(s)
      return s
    }
    
    def signal() : String = {
      val f = new Flare
      f.light
    }
    
  }
  
  class Motorboat(){
    
    // start motor
    def on() : String = {
      val s = "Motor on"
      println(s)
      return s
    }
    
    // stop motor
    def off() : String = {
      val s = "Motor off"
      println(s)
      return s
    }
    
    def signal() : String = {
      val f = new Flare
      f.light
    }
    
  }
  
  class Flare(){
    
    def light() : String = {
      val s = "Flare used!"
      println(s)
      return s
    }
    
  }
  
}