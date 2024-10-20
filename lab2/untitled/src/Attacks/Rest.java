package Attacks;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP,(int) (pokemon.getHP()-pokemon.getStat(Stat.HP)));
        Effect.sleep(pokemon);
    }

    @Override
    protected String describe() {
        return "решает отдохнуть и восстановить силы с помощью Rest";
    }
}
