

/**
 * Created by dev on 16/07/15.
 */
public class Car extends com.timbuchalka.Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
