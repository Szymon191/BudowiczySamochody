package director;

import builder.Builder;
import product.engine.Engine;

public class Director {

    public void makeMazdaRX7(Builder builder){
        builder.reset();
        builder.setColor("black");
        builder.setDoors(2);
        builder.setSits(5);
        builder.setWeight(1260);
        Engine engine = new Engine();
        engine.setCapacity(1300);
        engine.setPower(400);
        engine.setType("wankl");
        engine.setTypeOfFuel("petrol");
    }

    public void makeBmwM8(Builder builder)
    {
        builder.reset();
        builder.setColor("white");
        builder.setDoors(2);
        builder.setSits(5);
        builder.setWeight(1893);
        Engine engine = new Engine();
        engine.setCapacity(4400);
        engine.setPower(600);
        engine.setType("wankl");
        engine.setTypeOfFuel("petrol");

    }
}
