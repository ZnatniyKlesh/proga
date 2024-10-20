package Pokemons;
import Attacks.Blaze_Kick;
import ru.ifmo.se.pokemon.*;

public class Hitmonlee extends Tyrogue{
    public Hitmonlee(String name, int lvl){
        super(name,lvl);

        this.setStats(50,120,53,35,110,87);
        this.addMove(new Blaze_Kick());
    }
}
