package Bridge

trait Product {}

class CentralLocking(s : String) extends Product {
  override def toString : String = s
}

class GearLocking(s : String) extends Product {
  override def toString : String = s
}