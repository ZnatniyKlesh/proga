package Attacks;
import ru.ifmo.se.pokemon.*;

public class Charge_Beam extends SpecialMove{
    public Charge_Beam() {
        super(Type.ELECTRIC,50,90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= 0.7) {
            pokemon.setMod(Stat.SPECIAL_ATTACK,1);
        }
    }

    @Override
    protected String describe() {
        return "применяет Charge Beam на противника";
    }
}

