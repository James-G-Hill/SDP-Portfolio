package AbstractFactoryPattern

import AbstractParserFactory.XMLParser

trait AbstractParserFactory {
  
  def getParserInstance(parserType : String) : XMLParser
  
}