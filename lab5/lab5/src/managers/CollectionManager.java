package managers;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import mainData.characters.HumanBeing;
import mainData.enums.Mood;
import mainData.enums.WeaponType;
import mainData.location.Coordinates;
import mainData.transport.Car;
import tools.Console;

/**Класс управления коллекцией*/
public class CollectionManager {
    private static final String date = DateTimeFormatter.ofPattern("dd.MM.yyyy, hh:mm:ss a").format(LocalDateTime.now());
    public static int elements_count = 0;
    private final TreeMap<Integer, HumanBeing> collection;
    public CollectionManager(TreeMap<Integer, HumanBeing> col){
        this.collection = col;
    }
    public TreeMap<Integer, HumanBeing> getter(){
        return this.collection;
    }
    public void clear_collection(){
        this.collection.clear();
    }
    public String get_all_info(){
        return "Дата инициализации: "+CollectionManager.date+"\nКол-во элементов в коллекции: "+CollectionManager.elements_count;
    }
    public void print_all(){
        for (HumanBeing obj : collection.values()){
            System.out.println(obj.toString());
        }
    }
    public void descending_print(){
        NavigableMap<Integer, HumanBeing> humans = this.collection.descendingMap();
        for (HumanBeing human : humans.values()){
            System.out.println(human.toString());
        }
    }
    public void descending_weapon_print(){
        ArrayList<WeaponType> weapons = new ArrayList<WeaponType>();
        for (HumanBeing human: collection.values()){
            weapons.add(human.getWeaponType());
        }
        weapons.sort(new Comparator<WeaponType>() {
            @Override
            public int compare(WeaponType w1, WeaponType w2) {
                return Integer.compare(w2.ordinal(), w1.ordinal());
            }
        });
        for (WeaponType weapon : weapons) {
            System.out.println(weapon);
        }
    }
    public void count_by_mood(Mood mood){
        int count = 0;
        for (HumanBeing human : collection.values()){
            if (human.getMood().equals(mood)){count++;}
        }
        System.out.println(count);
    }
    public HumanBeing create_human(Console console){
        System.out.print("Введите имя человека: ");
        String name = console.next();
        Integer x;
        long y;
        while (true) {
            System.out.print("Введите координату x: ");
            x = console.next_int();
            if (x<310){break;}
            else{System.out.println("Координата х не может быть больше 309!");}
        }
        while (true) {
            System.out.print("Введите координату y: ");
            y = console.next_int();
            if (y<25){break;}
            else{System.out.println("Координата y не может быть больше 24!");}
        }
        System.out.print("Человек является героем? (true/false): ");
        boolean hero = console.next_bool();
        System.out.print("Есть ли у человека зубочистка? (true/false): ");
        Boolean tooth = console.next_bool();
        System.out.print("Введите скорость атаки: ");
        int speed = console.next_int();
        System.out.print("Введите тип оружия (HAMMER, AXE, PISTOL, KNIFE): ");
        WeaponType weapon = console.next_weapon();
        System.out.print("Введите настроение персонажа (GLOOM, CALM, RAGE, FRENZY): ");
        Mood mood = console.next_mood();
        System.out.print("Машина персонажа крутая? (true/false): ");
        Boolean cool = console.next_bool();
        return new HumanBeing(name, new Coordinates(x,y), hero, tooth, speed, weapon, mood, new Car(cool));
    }
    public void insert(Integer key, Console console){
        if (collection.containsKey(key)){
            System.out.println("Данный ключ уже есть в коллекции!");
        } else {
            CollectionManager.elements_count++;
            collection.put(key, create_human(console));
        }
    }
    public void remove_if_greater(Integer key){
        for (Integer keys : collection.keySet()){
            if (keys > key){collection.remove(keys);}
        }
    }
    public void remove_key(Integer key){
        if (collection.containsKey(key)){
            collection.remove(key);}
        else {System.out.println("Данного ключа нет в коллекции!");}
    }
    public void remove_if_low(Integer key, Console console){
        try {
            HumanBeing noob = create_human(console);
            if (collection.get(key).compareTo(noob) < 0){
                collection.put(key, noob);
            }
        }
        catch (IllegalArgumentException e) {System.out.println("Ключ не найден");}
    }
    public void update_key(Integer key, Console console){
        if (collection.containsKey(key)){
            collection.put(key, create_human(console));
        } else {
            System.out.println("Данного ключа нет в коллекции!");
        }
    }
}