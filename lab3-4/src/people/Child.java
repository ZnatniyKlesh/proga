package people;

import enums.Towns;

public class Child extends Person{
    private Person father;
    private Person mother;
    protected int birthYear;
    public Child(String name, String surname, int age, int birthYear, Person father, Person mother){
        super(name, surname, age, 0);
        this.homeTown = mother.currentTown;
        this.father = father;
        this.mother = mother;
        this.birthYear = birthYear;
        System.out.printf("%s %s родился в городе %s в %s году\n", name, surname, mother.currentTown, birthYear);
    }
}
