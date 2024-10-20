package Attacks;
import ru.ifmo.se.pokemon.*;

public class Rock_Slide extends PhysicalMove{
    public Rock_Slide() {
        super(Type.ROCK,75,90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "пытается напугать противника с помощью Rock Slide";
    }
}
