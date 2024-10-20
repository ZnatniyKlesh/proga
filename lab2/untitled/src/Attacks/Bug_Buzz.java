package Attacks;
import ru.ifmo.se.pokemon.*;

public class Bug_Buzz extends SpecialMove{
    public Bug_Buzz (){
        super(Type.BUG,90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "применяет Bug Buzz при атаке";
    }
}
