package army;

import enums.LivingStatuses;
import people.Male;
import people.Soldier;
import records.Rank;

import java.util.ArrayList;
import java.util.Arrays;

public class Shipping extends Army{
    public int sum;
    public String name;
    private Rank[] ranks_set = {new Rank("Seaman",1),new Rank("Cadet",2),
                                new Rank("Captain",3),new Rank("Admiral",4)};
    public ArrayList<Rank> ranks = new ArrayList<Rank>(Arrays.asList(ranks_set));
    public ArrayList<Soldier> mainCharacters = new ArrayList<Soldier>();
    public Shipping(String name, int sum){
        this.sum = sum;
        this.name = name;
    }
    @Override
    public void addRank(String name, int level){
        ranks.add(new Rank(name,level));
    }
    @Override
    public void battle(Shipping enemy){
        System.out.printf("Началось сражение между %s и %s\n", this.name,enemy.name);
        Shipping looser = enemy;
        if (this.sum < enemy.sum) {
            looser = this;
        }
        //System.out.println(looser.mainCharacters.toString());
        if (!(looser.mainCharacters.isEmpty())) {
            for (Soldier i : looser.mainCharacters) {
                LivingStatuses.setLivingStatus(LivingStatuses.DEAD, i);
            }
        }
        System.out.printf("Армия %s проиграла\n", looser.name);
    }
    public void addCharacter(Soldier character){
        this.mainCharacters.add(character);
        System.out.printf("%s теперь служит в армии\n", character.NAME);
    }
}
