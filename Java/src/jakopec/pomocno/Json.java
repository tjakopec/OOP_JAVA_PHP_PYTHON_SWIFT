package jakopec.pomocno;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import jakopec.model.Mjesanje;
import jakopec.model.Partija;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Json {

    public static void toJsonFile(String filePath, List<Partija> podaci){
        try {
            GsonBuilder gsonBilder = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .serializeNulls()
                    .setPrettyPrinting();
            Gson gson = gsonBilder.create();
            //System.out.println(podaci.size());
            System.out.println(gson.toJson(podaci));
            gson.toJson(podaci, new FileWriter(filePath)); // NE ZAPISUJE MI U FILE
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Partija> fromJsonFile(String filePath){
        Type listType = new TypeToken<ArrayList<Partija>>(){}.getType();
        try {
            GsonBuilder gsonBilder = new GsonBuilder();
            gsonBilder.registerTypeAdapter(Partija.class, new PartijaAdapter());
            gsonBilder.registerTypeAdapter(Mjesanje.class, new MjesanjeAdapter());
            Gson gson = gsonBilder.create();
            return gson.fromJson(new FileReader(filePath), listType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
