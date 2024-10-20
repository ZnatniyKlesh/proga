package Pokemons;
import Attacks.Rest;
import Attacks.Rock_Slide;
import Attacks.Swagger;
import ru.ifmo.se.pokemon.*;

public class Tyrogue extends Pokemon {
    public Tyrogue(String name, int lvl){
        super(name,lvl);

        super.addType(Type.FIGHTING);
        super.setStats(35,35,35,35,35,35);

        super.addMove(new Swagger());
        super.addMove(new Rock_Slide());
        super.addMove(new Rest());
    }

}
