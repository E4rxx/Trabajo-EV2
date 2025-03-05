package prog.trbe2.csvstuff

import java.io.File
import prog.trbe2.csvstuff.Personal

class CSVReadWrite {
    val archivoCSV = File("src/main/resources/personal.csv")
    fun mainReadCSV(archivoCSV: File) {
        existeCSV(archivoCSV)
        legibleCSV(archivoCSV)
    }
    fun existeCSV(archivoCSV: File): Boolean {
        var resultFind: Boolean = false
        print("🔄 Buscando el archivo CSV ")
        when {
            archivoCSV.exists() -> {
                println("✅ Archivo encontrado!")
                resultFind = true
            }
            !archivoCSV.exists() -> {
                throw IllegalArgumentException("⚠️ Archivo no encontrado!")
                resultFind = false
            }
        }
        return resultFind
    }
    fun legibleCSV(archivoCSV: File): Boolean {
        var resultFind: Boolean = false
        print("🔄 Comprobando el archivo CSV ")
        when {
            archivoCSV.canRead() -> {
                println("✅ Archivo listo para usar!")
                resultFind = true
            }
            !archivoCSV.canRead() -> {
                throw IllegalArgumentException("⚠️ Archivo no legible, bórralo y añade uno que sí lo sea")
                resultFind = false
            }
        }
        return resultFind
    }
    fun analizadorCSV(archivoCSV: File) {
        val lectorTextoCSV = archivoCSV.readLines().drop(1)
        val personalList = lectorTextoCSV.map { convertirLineaACSV(it) }
        personalList.forEach { println(it) }
    }

    fun convertirLineaACSV(linea: String): Personal {
        val campos = linea.split(",")
        return Personal(
            id = campos[0].toInt(),
            nombre = campos[1],
            apellidos = campos[2],
            fechaNacimiento = campos[3],
            fechaIncorporacion = campos[4],
            salario = campos[5].toDouble(),
            pais = campos[6],
            tipo = campos[7],
            especialidad = campos[8].ifEmpty { null },
            posicion = campos[9].ifEmpty { null },
            dorsal = campos[10].toIntOrNull(),
            altura = campos[11].toDoubleOrNull(),
            peso = campos[12].toDoubleOrNull(),
            goles = campos[13].toIntOrNull(),
            partidosJugados = campos[14].toIntOrNull()
        )
    }
}