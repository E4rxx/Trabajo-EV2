package prog.trbe2

import prog.trbe2.xmlstuff.XMLReadWrite
import prog.trbe2.csvstuff.CSVReadWrite
import prog.trbe2.jsonstuff.JSONReadWrite
import prog.trbe2.filestuff.BuscadorArchivos

fun main() {
    val fileFinder = BuscadorArchivos()
    val (archivoXML, archivoCSV, archivoJSON) = fileFinder.buscarArchivos()

    val xmlReadWrite = XMLReadWrite(archivoXML)
    val csvReadWrite = CSVReadWrite(archivoCSV)
    val jsonReadWrite = JSONReadWrite(archivoJSON)

    xmlReadWrite.mainReadXML(archivoXML)
    csvReadWrite.mainReadCSV(archivoCSV)
    jsonReadWrite.mainReadJSON(archivoJSON)

    println("CSV")
    csvReadWrite.analizadorCSV(archivoCSV)
    println("JSON")
    jsonReadWrite.analizadorJSON(archivoJSON)
    println("XML")
    xmlReadWrite.analizadorXML(archivoXML)
}
