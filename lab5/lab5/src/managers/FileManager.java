package managers;

import tools.Json_parser;

import java.io.FileOutputStream;
import java.io.IOException;

/**Класс управления файлами*/
public abstract class FileManager {
    public static void save_collection(CollectionManager col_man){
        String text = Json_parser.create_json(col_man);
        try (FileOutputStream fos = new FileOutputStream("./meta/save.json")){
            byte[] bytes = text.getBytes();
            fos.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении коллекции");
        }
    }
}
