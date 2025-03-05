package prog.trbe2
import prog.trbe2.xmlstuff.XMLReadWrite

fun main() {
    println("Hello, World!")
    val xmlReadWrite = XMLReadWrite()
    xmlReadWrite.mainReadXML(xmlReadWrite.archivoXML)
    xmlReadWrite.analizadorXML(xmlReadWrite.archivoXML)
}