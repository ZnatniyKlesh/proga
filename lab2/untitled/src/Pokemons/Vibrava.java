package Pokemons;
import Attacks.Bug_Buzz;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Trapinch{
    public Vibrava (String name, int lvl){
        super(name,lvl);

        this.addType(Type.DRAGON);
        this.setStats(50,70,50,50,50,70);

        this.addMove(new Bug_Buzz());
    }
}
