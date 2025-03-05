package prog.trbe2.jsonstuff

import kotlinx.serialization.json.Json
import java.io.File

class JSONReadWrite(private val archivoJSON: File) {
    fun mainReadJSON(archivoJson: File) {
        existeJSON(archivoJSON)
        legibleJSON(archivoJSON)
    }
    fun existeJSON(archivoJSON: File): Boolean {
        var resultFind: Boolean = false
        print("🔄 Buscando el archivo JSON ")
        when {
            archivoJSON.exists() -> {
                println("✅ Archivo encontrado!")
                resultFind = true
            }
            !archivoJSON.exists() -> {
                throw IllegalArgumentException("⚠️ Archivo no encontrado!")
                resultFind = false
            }
        }
        return resultFind
    }
    fun legibleJSON(archivoJSON: File): Boolean {
        var resultFind: Boolean = false
        print("🔄 Comprobando el archivo JSON ")
        when {
            archivoJSON.canRead() -> {
                println("✅ Archivo listo para usar!")
                resultFind = true
            }
            !archivoJSON.canRead() -> {
                throw IllegalArgumentException("⚠️ Archivo no legible, bórralo y añade uno que sí lo sea")
                resultFind = false
            }
        }
        return resultFind
    }
    fun analizadorJSON(archivoJSON: File) {
        val json = Json { ignoreUnknownKeys = true }
        val personalList: List<Personal> = json.decodeFromString(archivoJSON.readText())
        personalList.forEach { personal ->
            println(formateadorJSON(personal))
        }
    }

    fun formateadorJSON(personal: Personal): String {
        return "Personal(id=${personal.id}, tipo=${personal.rol}, nombre=${personal.nombre}, apellidos=${personal.apellidos}, fechaNacimiento=${personal.fecha_nacimiento}, fechaIncorporacion=${personal.fecha_incorporacion}, salario=${personal.salario}, pais=${personal.pais}, especialidad=${personal.especialidad}, posicion=${personal.posicion}, dorsal=${personal.dorsal}, altura=${personal.altura}, peso=${personal.peso}, goles=${personal.goles}, partidosJugados=${personal.partidos_jugados})"
    }
}