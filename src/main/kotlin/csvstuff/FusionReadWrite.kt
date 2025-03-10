package prog.trbe2.csvstuff

import java.io.File

class FusionReadWrite(val archivoFusion: File) {
    //la funcion principal de esta clase
    //esto busca el archivo fusionado
    // y si no lo encuentra lo crea
    fun mainReadFusion(archivoFusion: File): File {
        existeFusion(archivoFusion)
        return archivoFusion
    }

    //esto comprueba si esta o no
    private fun existeFusion(archivoFusion: File): Boolean {
        var resultFind: Boolean = false
        print("🔄 Buscando el archivo CSV ")
        when {
            archivoFusion.exists() -> {
                println("⚠️ Archivo encontrado. Se borrará y creara uno desde cero")
                archivoFusion.delete()
                resultFind = true
            }
            !archivoFusion.exists() -> {
                println("✅️ Archivo no encontrado!")
                crearFusion(archivoFusion)
                resultFind = false
            }
        }
        return resultFind
    }

    //crear archivo fusionado
    private fun crearFusion(archivoFusion: File) {
        print("🔄 Creando archivo fusionado ")
        if (archivoFusion.createNewFile()) {
            println("✅ Archivo creado!")
        } else {
            throw IllegalArgumentException("⚠️ Error al crear el archivo de fusión")
        }
    }
}