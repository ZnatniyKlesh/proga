package tools;

import mainData.characters.HumanBeing;
import managers.CollectionManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Класс работы с Json-файлами*/
public abstract class Json_parser {
    public static ArrayList<Map<String,String>> parse_json(String path){
        StringBuilder text = new StringBuilder();
        System.out.println("Текущая рабочая директория: " + new File("").getAbsolutePath());
        try (FileInputStream fis = new FileInputStream("./meta/Data.json")){
            int chr;
            while ((chr = fis.read()) != -1){
                text.append((char)chr);
            }
        }catch (IOException e){System.out.println(e);}
        String fix_text = text.toString().replaceAll("(\\r\\n+|\\t+)", "");
        Pattern pattern = Pattern.compile("\\{\"id\": (\\d+),\"name\": \"(\\w+)\",\"coordinates\": (\\[\\d+,\\d+\\])," +
                "\"date\": \"([\\w.\\s:]+)\",\"hero\": \"(\\w+)\",\"toothpick\": \"(\\w+)\",\"impactSpeed\": (\\d+),\"weapon\": \"([A-Z]+)\","+
                "\"mood\": \"([A-Z]+)\",\"car\": \"(\\w+)\"\\}");
        Matcher matcher = pattern.matcher(fix_text);
        ArrayList<Map<String,String>> persons = new ArrayList<>();
        while (matcher.find()){
            Map<String,String> person = new HashMap<>();
            person.put("id", matcher.group(1));
            person.put("name", matcher.group(2));
            String x = matcher.group(3).replaceAll("\\[|\\]", "").split(",")[0];
            String y = matcher.group(3).replaceAll("\\[|\\]", "").split(",")[1];
            person.put("x", x);
            person.put("y", y);
            person.put("date", matcher.group(4));
            person.put("hero", matcher.group(5));
            person.put("toothpick", matcher.group(6));
            person.put("impactSpeed", matcher.group(7));
            person.put("weapon", matcher.group(8));
            person.put("mood", matcher.group(9));
            person.put("car", matcher.group(10));
            persons.add(person);
        }
        return persons;
    }
    public static String create_json (CollectionManager col_man){
        StringBuilder text = new StringBuilder();
        for (HumanBeing person : col_man.getter().values()){
            text.append("{\n");
            text.append("\t\"id\": ").append(person.getId()).append(",\n");
            text.append("\t\"name\": \"").append(person.getName()).append("\",\n");
            text.append("\t\"coordinates\": ").append("["+person.getCoordinates().getX()+","+person.getCoordinates().getY()+"]").append(",\n");
            text.append("\t\"date\": \"").append(person.getCreationDate()).append("\",\n");
            text.append("\t\"hero\": \"").append(person.isRealHero()).append("\",\n");
            text.append("\t\"toothpick\": \"").append(person.getHasToothpick()).append("\",\n");
            text.append("\t\"impactSpeed\": ").append(person.getImpactSpeed()).append(",\n");
            text.append("\t\"weapon\": \"").append(person.getWeaponType()).append("\",\n");
            text.append("\t\"mood\": \"").append(person.getMood()).append("\",\n");
            text.append("\t\"car\": \"").append(person.getCar().getCool()).append("\"\n},\n");
        }
        return text.toString();
    }
}
