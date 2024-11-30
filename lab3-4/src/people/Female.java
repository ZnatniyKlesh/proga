package people;

import enums.Relative_statuses;
import enums.Towns;
import records.Rank;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Female extends Child{
    public Female(String name, String surname, int age, Person father, Person mother){
        super(name, surname, age, ThreadLocalRandom.current().nextInt(1600, 1650), father, mother);
    }
    public Child makeBaby(String name, String surname, int age, Male father){
        return new Child(name, surname, age, ThreadLocalRandom.current()
                .nextInt(this.birthYear+this.age, this.birthYear+this.age+6), father, this);
    }
    public Soldier makeBaby(String name, String surname, int age, Male father, Rank rank){
        return new Soldier(name, surname, age, father,this, rank);
    }
}
