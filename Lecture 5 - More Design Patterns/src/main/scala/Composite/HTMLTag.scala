package Composite

abstract class HTMLTag {
  
  def getTagName : String
  def setStartTag(tag : String)
  def setEndTag(tag : String)
  
  def setTagBody(tagBody : String) : Unit = {
    throw new UnsupportedOperationException(
      "Current operation is not supported - for this object"
    )
  }
  
  def addChildTag(htmlTag : HTMLTag) : Unit = {
    throw new UnsupportedOperationException(
      "Current operation is not supported - for this object"
    )
  }
  
  def removeChildTag(htmlTag : HTMLTag) : Unit = {
    throw new UnsupportedOperationException(
      "Current operation is not supported - for this object"
    )
  }
  
  def getChildren : List[HTMLTag] = {
    throw new UnsupportedOperationException(
      "Current operation is not supported - for this object"
    )
  }
  
  def generateHTML = {}
  
}

class HTMLParentElement(var body : String) extends HTMLTag {
  
  var startTag : String = ""
  var endTag : String = ""
  
  var htmlList = List[HTMLTag]()
  
  override def getTagName : String = {body}
  override def setStartTag(tag : String) = {startTag = tag}
  override def setEndTag(tag : String) = {endTag = tag}
  
  override def setTagBody(tagBody : String) = {body = tagBody}
  
  override def addChildTag(htmlTag : HTMLTag) : Unit = {
    htmlList = htmlTag :: htmlList
  }
  
  override def generateHTML = {
    println(startTag)
    for(list <- htmlList){
      list.generateHTML
    }
    println(endTag)
  }
  
}

class HTMLElement(var body : String) extends HTMLTag {
  
  var startTag : String = ""
  var endTag : String = ""
  
  override def getTagName : String = {body}
  override def setStartTag(tag : String) = {startTag = tag}
  override def setEndTag(tag : String) = {endTag = tag}
  
  override def setTagBody(tagBody : String) = {body = tagBody}
  
  override def generateHTML = {println(startTag + body + endTag)}
  
}