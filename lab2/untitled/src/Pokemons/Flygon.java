package Pokemons;

import Attacks.Screech;

public class Flygon extends Vibrava{
    public Flygon(String name,int lvl){
        super(name,lvl);

        this.setStats(80,100,80,80,80,100);
        this.addMove(new Screech());
    }
}
