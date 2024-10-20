package Attacks;
import ru.ifmo.se.pokemon.*;


public class Confusion extends SpecialMove{
    public Confusion () {
        super(Type.PSYCHIC, 50, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            pokemon.confuse();
        }
    }

    @Override
    protected String describe() {
        return "пытается сбить с толку противника с помощью Confusion";
    }
}
