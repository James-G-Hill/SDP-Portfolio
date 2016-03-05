package AbstractFactoryPattern

import AbstractParserFactory._

object TestAbstractFactoryPattern {
  
  def main(args: Array[String]): Unit = {
    
    var parserFactory : AbstractParserFactory = ParserFactoryProducer.getFactory("NYCFactory")
    var parser : XMLParser = parserFactory.getParserInstance("NYCOrder")
    var msg : String = ""
    msg = parser.parse
    println(msg)
    
    println("************************")    
    
    parserFactory = ParserFactoryProducer.getFactory("LondonFactory")
    parser = parserFactory.getParserInstance("LondonFeedback")
    msg = parser.parse
    println(msg)
    
  }

}