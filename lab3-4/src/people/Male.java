package people;

import enums.Jobs;
import enums.Towns;

import java.util.concurrent.ThreadLocalRandom;

public class Male extends Child{
    public Jobs job = Jobs.WARRIOR;
    public Male(String name, String surname, int age, Person father, Person mother){
        super(name, surname, age, ThreadLocalRandom.current().nextInt(1600, 1650), father, mother);
        this.job = Jobs.getJob();
    }

}
