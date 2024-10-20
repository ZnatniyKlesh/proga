package Attacks;
import ru.ifmo.se.pokemon.*;

public class Dream_Eater extends SpecialMove{
    public Dream_Eater(){
        super(Type.PSYCHIC,100,100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition() == Status.SLEEP) {
            super.applyOppDamage(pokemon, v);
        }
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, (int)-(pokemon.getHP()*0.5));
    }

    @Override
    protected String describe() {
        return "использует Dream Eater на противнике";
    }
}
