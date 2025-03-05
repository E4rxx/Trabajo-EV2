package prog.trbe2.jsonstuff

import kotlinx.serialization.Serializable

@Serializable
data class Personal(
    val id: Int?,
    val nombre: String?,
    val apellidos: String?,
    val fecha_nacimiento: String?,
    val fecha_incorporacion: String?,
    val salario: Double?,
    val pais: String?,
    val rol: String?,
    val especialidad: String?,
    val posicion: String?,
    val dorsal: Int?,
    val altura: Double?,
    val peso: Double?,
    val goles: Int?,
    val partidos_jugados: Int?
)
