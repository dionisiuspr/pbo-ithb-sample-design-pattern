/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Date;

/**
 *
 * @author hanschristian
 */
public class MainBuilder {

    public static void main(String[] args) {
        // Conventional Pattern
        Car car1 = new Car();
        Car car2 = new Car("VW", new Date(), "Budi", 10000, true);
        Car car3 = new Car("VW", new Date());

        // Car car7 = new Car();
        // car7.setBrand("VW");
        // car7.owner = "Budi";
        
        // Builder Pattern
        Car c4 = new Car.Builder()
                .ownedBy("Budi")
                .isNewCar(false)
                .withPrice(50000)
                .setBuyDate(new Date())
                .build();
        
        // Same with above
        Car.Builder builder = new Car.Builder();
        builder.ownedBy("Heru");
        builder.isNewCar(true);
        Car c6 = builder.build();

        Car c5 = new Car.Builder()
                .ownedBy("Budi")
                .setBuyDate(new Date())
                .build();
        
//        Calendar = new Calendar.Builder()
//                .color("blue")
//                .size(120)
//                .font("Font.ComicSans")
//                .type("Gregorian")
//                .build();
    }
}
