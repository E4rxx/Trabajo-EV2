package prog.trbe2.xmlstuff
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.io.File


class XMLReadWrite(private val archivoXML: File) {
    fun mainReadXML(archivoXML: File) {
        existeXML(archivoXML)
        legibleXML(archivoXML)
    }
    fun analizadorXML(archivoXML: File) {
        val xmlMapper = XmlMapper()
        val lectorTextoXML = archivoXML.readText()
        val dtoXML = xmlMapper.readValue(lectorTextoXML, EquipoDTO::class.java)
        dtoXML.personal.forEach { println(it) }
    }
    fun existeXML(archivoXML: File): Boolean {
        var resultFind: Boolean = false
        print("🔄 Buscando el archivo XML ")
        when {
            archivoXML.exists() -> {
                println("✅ Archivo encontrado!")
                resultFind = true
            }
            !archivoXML.exists() -> {
                throw IllegalArgumentException("⚠️ Archivo no encontrado!")
                resultFind = false
            }
        }
        return resultFind
    }
    fun legibleXML(archivoXML: File): Boolean {
        var resultFind: Boolean = false
        print("🔄 Comprobando el archivo XML ")
        when {
            archivoXML.canRead() -> {
                println("✅ Archivo listo para usar!")
                resultFind = true
            }
            !archivoXML.canRead() -> {
                throw IllegalArgumentException("⚠️ Archivo no legible, bórralo y añade uno que sí lo sea")
                resultFind = false
            }
        }
        return resultFind
    }
}
