package pomocno

import com.google.gson.*
import model.Mjesanje
import java.lang.reflect.Type

/**
 * @author Matija Skrletović
 **/

class MjesanjeAdapter : JsonSerializer<Mjesanje?>, JsonDeserializer<Mjesanje> {
    override fun serialize(
        src: Mjesanje?,
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
    ): Mjesanje {
        val jsonObject = json.asJsonObject
        return try {
            if (jsonObject.has("bodovaTreciUnos")) {
                context.deserialize(json, Class.forName("MjesanjeTriUnosa"))
            } else {
                context.deserialize(json, Class.forName("MjesanjeDvaUnosa"))
            }
        } catch (cnfe: ClassNotFoundException) {
            throw JsonParseException("Unknown element type: ", cnfe)
        }
    }
}