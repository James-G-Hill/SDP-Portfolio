package AbstractParserFactory

import AbstractFactoryPattern.AbstractParserFactory

object ParserFactoryProducer {
  
  def getFactory(factory : String) : ParserFactory = {
    factory match {
      case "NYCFactory" => return new NYCFactory
      case "LondonFactory" => return new LondonFactory
    }
  }
  
}

trait ParserFactory extends AbstractParserFactory {
  
  def getParserInstance(parser : String) : XMLParser
  
}

class NYCFactory extends ParserFactory {
  
  def getParserInstance(parser : String) : XMLParser = {
    parser match {
      case "NYCOrder" => new NYCOrderXMLParser
      case "NYCError" => new NYCErrorXMLParser
      case "NYCFeedback" => new NYCFeedbackXMLParser
      case "NYCResponse" => new NYCResponseXMLParser
    }
  }
  
}

class LondonFactory extends ParserFactory {
  
  def getParserInstance(parser : String) : XMLParser = {
    parser match {
      case "LondonOrder" => new LondonOrderXMLParser
      case "LondonError" => new LondonErrorXMLParser
      case "LondonFeedback" => new LondonFeedbackXMLParser
      case "LondonResponse" => new LondonResponseXMLParser
    }
  }
  
}

trait XMLParser {
  val a : String
  def parse : String
}

class NYCOrderXMLParser extends XMLParser {
  val a = "NYC"
  def parse = {
    println(a + " Parsing order XML")
    "NYC Order XML Message"
  }
}
class NYCErrorXMLParser extends XMLParser {
  val a = "NYC"
  def parse = {
    println(a + " Parsing error XML")
    "NYC Error XML Message"
  }
}
class NYCFeedbackXMLParser extends XMLParser {
  val a = "NYC"
  def parse = {
    println(a + " Parsing feedback XML")
    "NYC Feedback XML Message"
  }
}
class NYCResponseXMLParser extends XMLParser {
  val a = "NYC"
  def parse = {
    println(a + " Parsing response XML")
    "NYC Response XML Message"
  }
}

class LondonOrderXMLParser extends XMLParser {
  val a = "London"
  def parse = {
    println(a + " Parsing order XML")
    "London Order XML Message"
  }
}
class LondonErrorXMLParser extends XMLParser {
  val a = "London"
  def parse = {
    println(a + " Parsing error XML")
    "London Error XML Message"
  }
}
class LondonFeedbackXMLParser extends XMLParser {
  val a = "London"
  def parse = {
    println(a + " Parsing feedback XML")
    "London Feedback XML Message"
  }
}
class LondonResponseXMLParser extends XMLParser {
  val a = "London"
  def parse = {
    println(a + " Parsing response XML")
    "London Response XML Message"
  }
}