package mainData.characters;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import mainData.enums.WeaponType;
import mainData.enums.Mood;
import mainData.transport.Car;
import mainData.location.Coordinates;

/**Главный класс объектов коллекции*/
public class HumanBeing implements Comparable<HumanBeing>{
    private static Long counterId = 0L;
    private Long id = 1L; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private String creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private boolean realHero;
    private Boolean hasToothpick; //Поле не может быть null
    private int impactSpeed;
    private WeaponType weaponType; //Поле не может быть null
    private Mood mood; //Поле не может быть null
    private Car car; //Поле не может быть null

    public HumanBeing(String name, Coordinates coordinates, boolean realHero, Boolean hasToothpick, int impactSpeed, WeaponType weaponType, Mood mood, Car car) {
        this.id = counterId++;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = DateTimeFormatter.ofPattern("dd.MM.yyyy, hh:mm:ss a").format(LocalDateTime.now());
        this.realHero = realHero;
        this.hasToothpick = hasToothpick;
        this.impactSpeed = impactSpeed;
        this.weaponType = weaponType;
        this.mood = mood;
        this.car = car;
    }
    public HumanBeing(String name, Coordinates coordinates,String date, boolean realHero, Boolean hasToothpick, int impactSpeed, WeaponType weaponType, Mood mood, Car car) {
        this.id = counterId++;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = date;
        this.realHero = realHero;
        this.hasToothpick = hasToothpick;
        this.impactSpeed = impactSpeed;
        this.weaponType = weaponType;
        this.mood = mood;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public boolean isRealHero() {
        return realHero;
    }

    public Boolean getHasToothpick() {
        return hasToothpick;
    }

    public int getImpactSpeed() {
        return impactSpeed;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public Mood getMood() {
        return mood;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public int compareTo(HumanBeing o) {
        if (this.coordinates.getX()+this.coordinates.getY() > o.coordinates.getX()+o.coordinates.getY()){return 1;}
        else if (this.coordinates.getX()+this.coordinates.getY() < o.coordinates.getX()+o.coordinates.getY()){return -1;}
        return 0;
    }

    @Override
    public String toString() {
        String id = "\nID: "+this.id;
        String name = "\nИмя: "+this.name;
        String coords = "\nКоординаты x и y: "+this.coordinates.getX()+" "+this.coordinates.getY();
        String date = "\nДата создания: "+this.creationDate;
        String hero = "\nПерсонаж герой?: "+this.realHero;
        String weapon = "\nОружие: "+this.weaponType;
        String mood = "\nНастроение: "+this.mood;
        return id+name+coords+date+hero+weapon+mood;
    }
}
