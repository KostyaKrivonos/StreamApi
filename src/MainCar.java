
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алёшечка
 */
public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car(Brand.BMW, Color.BLACK, "vh3465am", new Date(2000-1900, 12, 04), 
                new Engine(123456, 200, 3.0), new Person(25, "Petya"), 10000.0);
        Car car2 = new Car(Brand.FORD, Color.GREEN, "vh7777vm", new Date(2011-1900, 04, 12), 
                new Engine(456789, 100, 2.0), new Person(20, "Vova"), 15000.0);
        Car car3 = new Car(Brand.HONDA, Color.GREEN, "vh4587vm", new Date(2014-1900, 05, 25), 
                new Engine(987654, 90, 2.2), new Person(30, "Vasya"), 6000.0);
        Car car4 = new Car(Brand.VOLVO, Color.GREEN, "vh5656am", new Date(1999-1900, 12, 04), 
                new Engine(654321, 180, 2.8), new Person(30, "Sasha"), 8000.0);
        Car car5 = new Car(Brand.FORD, Color.GREEN, "vh1212vm", new Date(2011-1900, 04, 12), 
                new Engine(456789, 120, 2.0), new Person(40, "Lyoha"),20000.0);
        Car car6 = new Car(Brand.HONDA, Color.BLUE, "vh3635vm", new Date(2014-1900, 05, 25), 
                new Engine(987654, 110, 2.2), new Person(30, "Goga"), 10000.0);
        Car car7 = new Car(Brand.FORD, Color.RED, "vh4444vm", new Date(2011-1900, 04, 12), 
                new Engine(456789, 100, 2.0), new Person(25, "Petya"), 7000.0);
        Car car8 = new Car(Brand.HONDA, Color.BLUE, "vh8888vm", new Date(2014-1900, 05, 25), 
                new Engine(987654, 150, 2.2), new Person(30, "Sasha"), 15000.0);
        Car [] cars = {car1, car2, car3, car4, car5, car6, car7, car8};
        
        
        
//        Stream <Car> st1 = Arrays.stream(cars);
//        Consumer<Car> c = (t)->t.setPrice(20);
//        st1.peek(c);
        //st1.forEach((t) -> System.out.println(t +""));
        //Stream <Car> st2 = Arrays.stream(cars);
//        Arrays.stream(cars)
//                .distinct()
//                .forEach((t) -> System.out.println(t + ""));
//        Predicate <Car> p = (t) -> t.getEngine().getVolume() > 2.0;
//        Arrays.stream(cars)
//                .filter(p)
//                .forEach((t) -> System.out.println(t+""));
//        Arrays.stream(cars)
//                .filter((t) -> t.getOwner().getName().equals("Petya"))
//                .forEach((t) -> System.out.println(t+""));
//        Arrays.stream(cars)
//                .filter((t) -> t.getDate().after(new Date(2011-1900, 12, 31)))
//                .forEach((t) -> System.out.println(t+""));
//        Arrays.stream(cars).filter((t) -> t.getDate().after(new Date(1999-1900, 01, 31)) 
//                && t.getDate().before(new Date(2011-1900, 12, 31)))
//                .forEach((t) -> System.out.println(t+""));
//        Arrays.stream(cars).filter((t) -> t.getNumber().startsWith("vh3"))
//                .forEach((t) -> System.out.println(t+""));
        
        List <Car> carList = Arrays.stream(cars).collect(Collectors.toList());
//        CarControler.findCarByColorAndYear(carList, "green", new Date(2015-1900, 12, 31))
//                .forEach((t) -> System.out.println(t + ""));
//        CarControler.findOwnerCarEngine(carList)
//                .forEach((t) -> System.out.println(t+""));
        //System.out.println(CarControler.totalSumCarsByNameAndPrice(carList, "Sa", 15000.0));
//        System.out.println(CarControler.findCarOlderTenYear(carList));
//        CarControler.findCarByprice(carList)
//                .forEach((t) -> System.out.println(t + ""));
//        CarControler.findOwnerByAge(carList)
//                .forEach((t) -> System.out.println(t +""));
//        CarControler.findEngineByPower(carList)
//                .forEach((t) -> System.out.println(t +""));
//        System.out.println(CarControler.findCarByPower(carList)); 
        System.out.println(CarControler.findCarByColorAndMinPower(carList, "green"));
//        carList.forEach((t) -> System.out.println(t+""));
//        CarControler.findCarByColorAndMinPower(carList, "green")
//                .forEach((t) -> System.out.println(t+""));
    }
}
