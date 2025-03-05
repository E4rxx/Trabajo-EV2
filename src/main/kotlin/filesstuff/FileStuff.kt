package prog.trbe2.filestuff

import java.io.File

class BuscadorArchivos {
    private val currentDir = System.getProperty("user.dir")

    fun buscarArchivos(): Triple<File, File, File> {
        val archivoXML = File(currentDir, "personal.xml")
        val archivoCSV = File(currentDir, "personal.csv")
        val archivoJSON = File(currentDir, "personal.json")
        return Triple(archivoXML, archivoCSV, archivoJSON)
    }

    fun buscarArchivosXML(): File = File(currentDir, "personal.xml")
    fun buscarArchivosCSV(): File = File(currentDir, "personal.csv")
    fun findbuscarArchivosJSON(): File = File(currentDir, "personal.json")
}