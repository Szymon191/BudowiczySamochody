import builder.CarBuilder;
import builder.ManualBuilder;
import director.Director;
import product.Car;
import product.CarManual;
/*
TODO:
* dodać jeszcze jeden samochód
* w main stworzyć dwa samochody oraz dwie instrukcje obsługi
* wysłać na teamsach link do gita

 */
public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();


        director.makeBmwM8(builder);
        Car car1 = builder.getResult();
        director.makeBmwM8(manualBuilder);
        CarManual manualBmwM8 = manualBuilder.getResult();


        director.makeMazdaRX7(builder);
        Car car2 = builder.getResult();
        director.makeMazdaRX7(manualBuilder);
        CarManual manualMazdaRX7 = manualBuilder.getResult();



        System.out.println(car1.toString());
        System.out.println(manualBmwM8.getContent());


        System.out.println(car2.toString());
        System.out.println(manualMazdaRX7.getContent());
    }
}