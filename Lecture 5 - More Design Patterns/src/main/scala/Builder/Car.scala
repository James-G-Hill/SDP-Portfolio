package Builder

class Car(carType : String) {
  
  var bodyStyle : String = ""
  var power : String = ""
  var engine : String = ""
  var breaks : String = ""
  var seats : String = ""
  var windows : String = ""
  var fuelType : String = ""
  
  def getBodyStyle : String = return bodyStyle
  def setBodyStyle(bodyStyle : String) = this.bodyStyle = bodyStyle
  
  def getPower : String = return power
  def setPower(power : String) = this.power = power
  
  def getEngine : String = return engine
  def setEngine(engine : String) = this.engine = engine
  
  def getBreaks : String = return breaks
  def setBreaks(breaks : String) = this.breaks = breaks
  
  def getSeats : String = return seats
  def setSeats(seats : String) = this.seats = seats
  
  def getWindows : String = return windows
  def setWindows(windows : String) = this.windows = windows
  
  def getFuelType : String = return fuelType
  def setFuelType(fuelType : String) = this.fuelType = fuelType
  
  override def toString : String = {
    var s : String = ""
    s = s + "---------- " + carType + " ----------" +
      s + "\n Body: " + bodyStyle +
      s + "\n Power: " + power +
      s + "\n Engine: " + engine +
      s + "\n Breaks: " + breaks +
      s + "\n Seats: " + seats +
      s + "\n Windows: " + windows +
      s + "\n Fuel Type: " + fuelType
    s
  }
  
}