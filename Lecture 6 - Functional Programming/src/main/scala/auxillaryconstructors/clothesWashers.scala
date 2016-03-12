package auxillaryconstructors

// Q.12 & Q.13 & Q.14
class ClothesWasher(modelName:String, capacity:Double) {  
  def this(modelName: String){this(modelName, 20.5)}
  def this(capacity: Double){this("M", capacity)}
}

class ClothesWasher2(modelName:String = "M", capacity:Double = 20.5)