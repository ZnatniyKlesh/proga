package mainData.location;

/**Класс для координат*/
public class Coordinates {
    private Integer x; //Максимальное значение поля: 309, Поле не может быть null
    private long y; //Максимальное значение поля: 24

    public Coordinates(Integer x, long y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
