package Attacks;
import ru.ifmo.se.pokemon.*;

public class Blaze_Kick extends PhysicalMove{
    public Blaze_Kick(){
        super(Type.FIRE,85,90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1){
            Effect.burn(pokemon);
        };
    }

    @Override
    protected String describe() {
        return "с помощью Blaze Kick атакует противника";
    }
}
