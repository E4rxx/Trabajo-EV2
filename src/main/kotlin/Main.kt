package prog.trbe2

import prog.trbe2.DisplayStuff.DisplayCLass
import prog.trbe2.filestuff.FileFusioner


fun main() {
    println("Hello, world!")
    val display = DisplayCLass()
    val fileFusioner = FileFusioner()

    println()
    println("CSV")
    display.displayCSV()
    println()
    println("JSON")
    display.displayJSON()
    println()
    println("XML")
    display.displayXML()
    println()
    println("Fusion")
    fileFusioner.mainFileFusioner()
}