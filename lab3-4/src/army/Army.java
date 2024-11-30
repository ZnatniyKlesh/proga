package army;

import people.Male;
import people.Soldier;
import records.Rank;

import java.util.ArrayList;

public abstract class Army {
    public abstract void addRank(String name, int level);
    public abstract void battle(Shipping enemy);
    int sum;

    ArrayList<Rank> ranks;
    ArrayList<Soldier> mainCharacters;
    String name;
}
