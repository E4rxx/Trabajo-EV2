package prog.trbe2.csvstuff

data class Personal(
    val id: Int,
    val tipo: String,
    val nombre: String,
    val apellidos: String,
    val fechaNacimiento: String,
    val fechaIncorporacion: String,
    val salario: Double,
    val pais: String,
    val especialidad: String?,
    val posicion: String?,
    val dorsal: Int?,
    val altura: Double?,
    val peso: Double?,
    val goles: Int?,
    val partidosJugados: Int?
)
