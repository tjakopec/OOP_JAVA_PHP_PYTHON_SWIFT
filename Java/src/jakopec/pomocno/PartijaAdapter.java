package jakopec.pomocno;

import com.google.gson.*;
import jakopec.model.Partija;

import java.lang.reflect.Type;

public class PartijaAdapter implements JsonSerializer<Partija>, JsonDeserializer<Partija> {
    @Override
    public JsonElement serialize(Partija src, Type typeOfSrc, JsonSerializationContext context) {
       return null;
    }

    @Override
    public Partija deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        int brojIgraca = jsonObject.get("igraci").getAsJsonArray().size();
        try {
        switch (brojIgraca){
            case 2:
                return context.deserialize(json, Class.forName("jakopec.model.PartijaDvaIgraca"));
            case 3:
                return context.deserialize(json, Class.forName("jakopec.model.PartijaTriIgraca"));
            case 4:
                return context.deserialize(json, Class.forName("jakopec.model.PartijaDvaPara"));
            default:
                return null;
        }
        } catch (ClassNotFoundException cnfe) {
            throw new JsonParseException("Unknown element type: ", cnfe);
        }
    }
}
