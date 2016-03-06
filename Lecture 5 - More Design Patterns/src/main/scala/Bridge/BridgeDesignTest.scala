package Bridge

object BridgeDesignTest {

  def main(args: Array[String]): Unit = {
    
    var product1 : Product = new CentralLocking("Central Locking System")
    var product2 : Product = new GearLocking("Gear Locking System")
    var car : Car = new BigWheel(product1, "BigWheel xz model")
    
    car.produceProduct
    car.assemble
    car.printDetails
    
    println
    
    car = new BigWheel(product2, "BigWheel xz model")
    
    car.produceProduct
    car.assemble
    car.printDetails
    
    println
    
    car = new Motoren(product1, "Motoren lm model")
    
    car.produceProduct
    car.assemble
    car.printDetails
    
    println
    
    car = new Motoren(product2, "Motoren lm model")
    
    car.produceProduct
    car.assemble
    car.printDetails
    
  }

}