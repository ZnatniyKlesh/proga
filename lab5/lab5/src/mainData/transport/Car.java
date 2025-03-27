package mainData.transport;

/**Класс для создания машины человека*/
public class Car {
    private Boolean cool; //Поле может быть null

    public Car(Boolean cool) {
        this.cool = cool;
    }

    public Boolean getCool() {
        return cool;
    }
}
