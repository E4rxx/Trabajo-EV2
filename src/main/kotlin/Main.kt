package prog.trbe2
import prog.trbe2.xmlstuff.XMLReadWrite
import prog.trbe2.csvstuff.CSVReadWrite

fun main() {
    println("Hello, World!")
    val xmlReadWrite = XMLReadWrite()
    val csvReadWrite = CSVReadWrite()
    xmlReadWrite.mainReadXML(xmlReadWrite.archivoXML)
    csvReadWrite.mainReadCSV(csvReadWrite.archivoCSV)
    csvReadWrite.analizadorCSV(csvReadWrite.archivoCSV)
    xmlReadWrite.analizadorXML(xmlReadWrite.archivoXML)
}