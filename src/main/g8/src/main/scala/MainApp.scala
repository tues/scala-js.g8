import scala.scalajs.js.JSApp

import org.scalajs.dom
import dom.{ document, window }

object MainApp extends JSApp {

  def main(): Unit = {
    println("Starting '$name$'...")

    val p = document.createElement("p")
    val text = document.createTextNode("Hello!")
    p.appendChild(text)
    document.body.appendChild(p)
  }

}
