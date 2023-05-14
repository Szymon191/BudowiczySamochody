package builder;

import product.CarManual;
import product.engine.Engine;

public class ManualBuilder implements Builder {

    private CarManual carManual;
    @Override
    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public void setEngine(Engine engine) {
        String content = carManual.getContent() + "engine: "+engine;
        carManual.setContent(content);
    }

    @Override
    public void setDoors(int number) {
        String content = carManual.getContent() + "doors: "+number;
        carManual.setContent(content);
    }

    @Override
    public void setWeight(int weight) {
        String content = carManual.getContent() + "weight: "+weight;
        carManual.setContent(content);
    }

    @Override
    public void setColor(String color) {
        String content = carManual.getContent() + "color: "+color;
        carManual.setContent(content);
    }

    @Override
    public void setSits(int sits) {
        String content = carManual.getContent() + "sits: "+sits;
        carManual.setContent(content);
    }

    public CarManual getResult(){
        return carManual;
    }
}
