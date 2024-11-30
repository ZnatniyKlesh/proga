package people;

import records.Rank;

public class Soldier extends Male{
    public Rank rank;
    public Soldier(String name, String surname, int age, Person father, Person mother, Rank rank) {
        super(name, surname, age, father, mother);
        this.rank = rank;
    }
    public void setRank(Rank rank){
        this.rank = rank;
        System.out.printf("%s получил новое звание - %s\n", this.NAME, rank.name());
    }
}
