import army.Army;
import army.Shipping;
import enums.LivingStatuses;
import enums.Towns;
import people.*;
import records.Rank;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //some shit

        // появление отца и матери
        Male john = new Male("John", "Kruzo",18,
                new Person("Greg", "Kreycner", 42,20000),
                new Person("Kate", "Kreycner", 38,15000));
        Female marry = new Female("Marry", "Kruzo",1,
                new Person("Peter", "Robinzon", 28,10000),
                new Person("Anna", "Robinzon", 55,5000));
        out.println();
        // блок, в котором отец взрослеет и зарабатывает состояние
        while (john.money < 5000) {
            if (john.earnMoney(500)){
                john.growUp(2);
            } else {
                john.rest();
                john.growUp(1);
            }
        }
        out.println();
        //блок, где родители переезжают в один город
        marry.growUp(33);
        marry.movedTo(Towns.YORK);
        john.movedTo(Towns.YORK);

        //СВАДЬБААА!!!!
        out.println();
        marry.marry(john);
        out.println();

        //блок, в котором рождаются три брата
        Soldier michel =  marry.makeBaby("Michel", "Kruzo", 1, john,new Rank("None",0));
        Child jack =  marry.makeBaby("Jack", "Kruzo", 1, john);
        Child robinzon =  marry.makeBaby("Robinzon", "Kruzo", 1, john);
        out.println();

        //блок, где создаются две воинствующие армии
        Shipping army1 = new Shipping("Army 1",1000);
        Shipping army2 = new Shipping("Army 2",1500);

        //Судьба первого брата, который служил
        michel.growUp(10);
        michel.earnMoney(1000);
        michel.growUp(15);
        army1.addCharacter(michel);
        michel.setRank(army1.ranks.get(2));
        army1.battle(army2);
        out.println(LivingStatuses.getLivingStatus(michel));
        out.println();

        //Судьба второго брата, который пропал
        jack.growUp(16);
        jack.earnMoney(570);
        jack.growUp(2);
        LivingStatuses.setLivingStatus(LivingStatuses.MISSING, jack);
        out.println(LivingStatuses.getLivingStatus(jack));
    }
}