package NamedDefaultArguments

import com.atomicscala.AtomicTest._

object PlanetClass extends App {
  
  val p = new Planet(name = "Mercury", description = "Small and hot planet", moons = 0)
  p.hasMoon is false
  
  val earth = new Planet(moons = 1, name = "Earth", description = "A hospitable planet")
  earth.hasMoon is true
  
}

class Planet(name: String, description: String, moons: Int) {
  def hasMoon: Boolean = {!(moons == 0)}
}