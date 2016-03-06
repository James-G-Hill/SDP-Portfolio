package Composite

object TestCompositePattern {

  def main(args: Array[String]): Unit = {
    
    val parentTag : HTMLTag = new HTMLParentElement("<html>")
    parentTag.setStartTag("<html>")
    parentTag.setEndTag("</html>")
    
    val p1 : HTMLTag = new HTMLParentElement("<body>")
    p1.setStartTag("<body>")
    p1.setEndTag("</body>")
    parentTag.addChildTag(p1)
    
    var child1 : HTMLTag = new HTMLElement("<P>")
    child1.setStartTag("<P>")
    child1.setEndTag("</P>")
    child1.setTagBody("Testing html tag library")
    p1.addChildTag(child1)
    
    child1 = new HTMLElement("<P>")
    child1.setStartTag("<P>")
    child1.setEndTag("</P>")
    child1.setTagBody("Paragraph 2")
    p1.addChildTag(child1)
    
    parentTag.generateHTML
    
  }

}