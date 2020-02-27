package jakopec.pomocno;

import com.google.gson.*;
import jakopec.model.Mjesanje;

import java.lang.reflect.Type;

public class MjesanjeAdapter implements JsonSerializer<Mjesanje>, JsonDeserializer<Mjesanje> {
    @Override
    public JsonElement serialize(Mjesanje src, Type typeOfSrc, JsonSerializationContext context) {
       return null;
    }

    @Override
    public Mjesanje deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        try {
        if (jsonObject.has("bodovaTreciUnos")){
            return context.deserialize(json, Class.forName("jakopec.model.MjesanjeTriUnosa"));
        }else{
            return context.deserialize(json, Class.forName("jakopec.model.MjesanjeDvaUnosa"));
        }
        } catch (ClassNotFoundException cnfe) {
            throw new JsonParseException("Unknown element type: ", cnfe);
        }
    }
}
