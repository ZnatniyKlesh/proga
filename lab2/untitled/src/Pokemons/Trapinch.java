package Pokemons;
import Attacks.Double_Team;
import Attacks.Rock_Tomb;
import ru.ifmo.se.pokemon.*;

public class Trapinch extends Pokemon {
    public Trapinch (String name, int lvl){
        super(name,lvl);
        super.setType(Type.GROUND);

        super.setStats(45,100,45,45,45,10);
        super.addMove(new Double_Team());
        super.addMove(new Rock_Tomb());

    }
}
