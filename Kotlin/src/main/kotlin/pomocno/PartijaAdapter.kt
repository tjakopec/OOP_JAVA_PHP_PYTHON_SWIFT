package pomocno

import com.google.gson.*
import model.Partija
import java.lang.reflect.Type

/**
 * @author Matija Skrletović
 **/

class PartijaAdapter : JsonSerializer<Partija?>, JsonDeserializer<Partija?> {
    override fun serialize(
        src: Partija?,
        typeOfSrc: Type,
        context: JsonSerializationContext
    ): JsonElement? {
        return null
    }

    @Throws(JsonParseException::class)
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): Partija? {
        val jsonObject = json.asJsonObject
        val brojIgraca = jsonObject["igraci"].asJsonArray.size()
        return try {
            when (brojIgraca) {
                2 -> context.deserialize(json, Class.forName("PartijaDvaIgraca"))
                3 -> context.deserialize(json, Class.forName("PartijaTriIgraca"))
                4 -> context.deserialize(json, Class.forName("PartijaDvaPara"))
                else -> null
            }
        } catch (cnfe: ClassNotFoundException) {
            throw JsonParseException("Unknown element type: ", cnfe)
        }
    }
}