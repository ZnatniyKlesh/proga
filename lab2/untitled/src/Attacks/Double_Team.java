package Attacks;
import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove{
    public Double_Team (){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION,1);
    }

    @Override
    protected String describe() {
        return "повышает уровень своей ловкости благодаря Double Team";
    }
}
