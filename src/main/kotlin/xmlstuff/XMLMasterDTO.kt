package prog.trbe2.xmlstuff

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class EquipoDTO(
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "personal")
    val personal: List<Personal>
)
