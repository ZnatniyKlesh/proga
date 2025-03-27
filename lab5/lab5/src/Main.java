import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import interfaces.Command;
import mainData.characters.HumanBeing;
import mainData.enums.Mood;
import mainData.enums.WeaponType;
import mainData.location.Coordinates;
import mainData.transport.Car;
import managers.CollectionManager;
import managers.CommandsManager;
import tools.Console;
import tools.Json_parser;
import tools.Logger;

/**Главный класс для ввода команд и их выполнения*/
public class Main {
    public static void main(String[] args){
        Console console = new Console();
        TreeMap<Integer, HumanBeing> collection = new TreeMap<Integer, HumanBeing>();
        CollectionManager col_manager = new CollectionManager(collection);
        ArrayList<Map<String, String>> persons = Json_parser.parse_json("pop");
        for (Map<String, String> person : persons){
            try {
                CollectionManager.elements_count++;
                Integer id = Integer.valueOf(person.get("id"));
                String name = person.get("name");
                Coordinates coords = new Coordinates(Integer.valueOf(person.get("x")), Integer.parseInt(person.get("y")));
                String date = person.get("date");
                boolean hero = Boolean.parseBoolean(person.get("hero"));
                Boolean toothpick = Boolean.valueOf(person.get("toothpick"));
                int impactSpeed = Integer.parseInt(person.get("impactSpeed"));
                WeaponType weapon = WeaponType.valueOf(person.get("weapon"));
                Mood mood = Mood.valueOf(person.get("mood"));
                Car car = new Car(Boolean.valueOf(person.get("car")));
                collection.put(id, new HumanBeing(name, coords, date, hero, toothpick, impactSpeed, weapon, mood, car));
            } catch (Exception e) {
                System.out.println("Данные в файле введены некорректно!");
            }
        }
        Map<String, Command> commands = CommandsManager.get_new_commands(col_manager,console);
        while (true){
            System.out.print("> ");
            String str = console.next();
            String[] tokens = str.split(" ");
            try {Command command = commands.get(tokens[0]);
                if (tokens.length>1){
                    command.execute(tokens[1]);
                } else {command.execute();}
                Logger.log_command(tokens[0]);
            }
            catch (Exception e) {
                System.out.println("Команда не найдена! Для вывода списка всех существующих команд введите help");}
        }
    }
}
