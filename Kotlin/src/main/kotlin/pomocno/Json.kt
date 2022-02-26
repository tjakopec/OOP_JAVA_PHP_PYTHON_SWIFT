package pomocno

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import model.Mjesanje
import model.Partija
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.lang.reflect.Type

/**
 * @author Matija Skrletović
 **/

object Json {
    fun toJsonFile(filePath: String?, podaci: List<Partija>?) {
        try {
            val gsonBilder: GsonBuilder = GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                .serializeNulls()
                .setPrettyPrinting()
            val gson: Gson = gsonBilder.create()
            val jsonPodaci: String = gson.toJson(podaci)
            File("podaci.json").writeText(jsonPodaci)

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun fromJsonFile(filePath: String?): List<Partija>? {
        val listType: Type = object : TypeToken<ArrayList<Partija?>?>() {}.type
        try {
            val gsonBilder = GsonBuilder()
            gsonBilder.registerTypeAdapter(Partija::class.java, PartijaAdapter())
            gsonBilder.registerTypeAdapter(Mjesanje::class.java, MjesanjeAdapter())
            val gson: Gson = gsonBilder.create()
            return gson.fromJson<List<Partija>>(FileReader(filePath), listType)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
        return null
    }
}