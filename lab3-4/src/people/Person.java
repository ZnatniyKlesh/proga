package people;

import enums.LivingStatuses;
import enums.Relative_statuses;
import enums.Towns;
import interfaces.Growable;
import interfaces.Marriable;

import java.util.concurrent.ThreadLocalRandom;

public class Person implements Marriable, Growable {
    public final String NAME;
    protected int age = 18;
    public Relative_statuses relative_status = Relative_statuses.SINGLE;
    public int money;
    public Towns homeTown = Towns.getRandomTown();
    public Towns currentTown = homeTown;
    private double energy = 600;
    private int maxEnergy = 600;
    public LivingStatuses living_status = LivingStatuses.ALIVE;

    public Person(String name, String surname, int age, int money){
        this.NAME = name+" "+surname;
        this.money = money;
        this.age = age;
        //System.out.printf("%s Changed\n", this.NAME);
    }

    @Override
    public String toString() {
        return "Name: %s\nAge: %s\nMoney: %s\nEnergy: %s\nMax Energy: %s\nRelative Status: %s"
                .formatted(this.NAME, this.age, this.money, this.energy, this.maxEnergy,
                        this.relative_status);
    }
    @Override
    public boolean equals(Object obj1) {
        Person obj = (Person) obj1;
        return (this.NAME.equals(obj.NAME) && this.age == obj.age);
    }
    @Override
    public int hashCode() {
        return this.age + this.NAME.hashCode();
    }

    public void marry(Person fiance){
        if (Relative_statuses.getRelative_status(this).equals("Married") ||
                Relative_statuses.getRelative_status(fiance).equals("Married")) {
            System.out.println("Эти люди не могут быть женатыми!\n");
        }
        else {
            this.relative_status = Relative_statuses.MARRIED;
            fiance.relative_status = Relative_statuses.MARRIED;
            System.out.printf("%s и %s только что поженились!\n", this.NAME, fiance.NAME);
        }
    };
    public void growUp(int years) {
        this.age += years;
        this.maxEnergy -= 10*years;
        if (this.energy > this.maxEnergy) {
            this.energy = this.maxEnergy;
        }
        System.out.printf("%s вырос, теперь ему %s\n", this.NAME, this.age);
    }
    public boolean earnMoney(int sum) {
        if (this.energy - sum*0.01 >= 0) {
            this.money += sum;
            this.energy -= sum * 0.01;
            System.out.printf("%s заработал %s денег, но потратил %s единиц энергии. У него осталось %s энергии\n",
                    this.NAME, sum, sum * 0.01, this.energy);
            return true;
        } else{
            System.out.printf("%s не хватит сил для такой работы!\n", this.NAME);
            return false;
        }
    };
    public void rest(){
        this.energy = this.maxEnergy;
        System.out.printf("%s отдохнул и теперь он полон сил!\n", this.NAME);
    }
    public void movedTo(Towns new_town){
        this.currentTown = new_town;
        System.out.printf("%s переехал в %s\n", this.NAME, this.currentTown);
    }
}
