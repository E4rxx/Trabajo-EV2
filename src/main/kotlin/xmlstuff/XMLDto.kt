package prog.trbe2.xmlstuff

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Personal(
    @JacksonXmlProperty(localName = "id") val id: Int,
    @JacksonXmlProperty(localName = "tipo") val tipo: String,
    @JacksonXmlProperty(localName = "nombre") val nombre: String,
    @JacksonXmlProperty(localName = "apellidos") val apellidos: String,
    @JacksonXmlProperty(localName = "fechaNacimiento") val fechaNacimiento: String,
    @JacksonXmlProperty(localName = "fechaIncorporacion") val fechaIncorporacion: String,
    @JacksonXmlProperty(localName = "salario") val salario: Double,
    @JacksonXmlProperty(localName = "pais") val pais: String,
    @JacksonXmlProperty(localName = "especialidad") val especialidad: String?,
    @JacksonXmlProperty(localName = "posicion") val posicion: String?,
    @JacksonXmlProperty(localName = "dorsal") val dorsal: Int?,
    @JacksonXmlProperty(localName = "altura") val altura: Double?,
    @JacksonXmlProperty(localName = "peso") val peso: Double?,
    @JacksonXmlProperty(localName = "goles") val goles: Int?,
    @JacksonXmlProperty(localName = "partidosJugados") val partidosJugados: Int?
)