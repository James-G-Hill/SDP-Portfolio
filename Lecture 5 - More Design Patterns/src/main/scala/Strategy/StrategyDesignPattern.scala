package Strategy

trait TextFormatter {
  
  def format(text : String): String
  
}

object TestStrategyDesignPattern {

  def main(args: Array[String]): Unit = {
    
    var formatter : TextFormatter = new CapTextFormatter
    var editor : TextEditor = new TextEditor(formatter)
    editor.publishText("Testing text in caps formatter.")
    formatter = new LowerTextFormatter
    editor = new TextEditor(formatter)
    editor.publishText("Testing text in lower formatter.")
    
  }

}

class TextEditor(formatter : TextFormatter) {
  
  def publishText(text : String) = {
    println(formatter.format(text))
  }
  
}

class CapTextFormatter extends TextFormatter {

  def format(text : String): String = {
    text.toUpperCase
  }

}
class LowerTextFormatter extends TextFormatter {

  def format(text : String): String = {
    text.toLowerCase
  }

}