package Builder

trait CarBuilder {
  
  def getCar : Car
  def build
  
}

class SedanCarBuilder extends CarBuilder {
  
  var car : Car = _
  
  def getCar : Car = car
  
  def build = {
    car = new Car("SEDAN")
    car.bodyStyle = "External dimensions: overall length (inches): 202.9," +
      "\noverall width (inches): 76.2, overall height (inches): 60.7," +
      "\nwheelbase (inches): 112.9, front track (inches): 65.3," +
      "\nrear track (inches): 65.5 and curb to curb turning circle (feet): 39.5"
    car.power = "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm"
    car.engine = "3.5L Duramax V 6 DOHC"
    car.breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution"
    car.seats = "Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats"
    car.windows = "Laminated side windows.Fixed rear window with defroster"
    car.fuelType = "Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range"
  }
  
}

class SportsCarBuilder extends CarBuilder {
  
  var car : Car = _
  
  def getCar : Car = car
  
  def build = {
    this.car = new Car("SPORTS")
    car.bodyStyle = "External dimensions: overall length (inches): 192.3," +
      "\noverall width (inches): 75.5, overall height (inches): 54.2," +
      "\nwheelbase (inches): 112.3, front track (inches): 63.7," +
      "\nrear track (inches): 64.1 and curb to curb turning circle (feet): 37.7"
    car.power = "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm"
    car.engine = "3.6L V 6 DOHC and variable valve timing"
    car.breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution.Stability control"
    car.seats = "Driver sports front seat with one power adjustments manual height," +
      "\nfront passenger seat sports front seat with one power adjustments"
    car.windows = "Front windows with one-touch on two windows"
    car.fuelType = "Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range"
  }
  
}