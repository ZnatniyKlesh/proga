package Attacks;
import ru.ifmo.se.pokemon.*;

public class Rock_Tomb extends PhysicalMove{
    public Rock_Tomb (){
        super(Type.ROCK,60,95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED,-1);
    }

    @Override
    protected String describe() {
        return "снижает скорость противника, применяя Rock Tomb";
    }
}
