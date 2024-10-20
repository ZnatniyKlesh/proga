package Pokemons;
import Attacks.Calm_Mind;
import Attacks.Charge_Beam;
import Attacks.Confusion;
import Attacks.Dream_Eater;
import ru.ifmo.se.pokemon.*;

public class Solrock extends Pokemon{
    public Solrock(String name, int lvl){
        super(name,lvl);

        super.addType(Type.ROCK);
        super.addType(Type.PSYCHIC);

        super.setStats(90,95,85,55,65,70);

        super.addMove(new Calm_Mind());
        super.addMove(new Confusion());
        super.addMove(new Charge_Beam());
        super.addMove(new Dream_Eater());
    }
}
