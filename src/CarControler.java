
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Алёшечка
 */
public class CarControler {
    //розшукати всі зелені кари з роком випуску до 2015 р
    public static List<Car> findCarByColorAndYear(List <Car> listCar, String color, Date date){
        
        return listCar.stream()
               .filter((t) -> t.getColor().equals(Color.valueOf(color.toUpperCase())) && t.getDate().before(date))
               .collect(Collectors.toList());         
    }
    //Вивести власникыв автомобілей з двигунами більшими за 2,0 л без дублікатов
    public static List<Person> findOwnerCarEngine(List<Car> listCar){
        return listCar.stream()
                .filter((t) -> t.getEngine().getVolume() > 2.0)
                .map((t) -> t.getOwner())
                .distinct()
                .collect(Collectors.toList());
    }
    // Визначити загальну вартість автомобілей, імена власників яких починаються на "Sa" та вартість яких не перевищує 15000
    public static double totalSumCarsByNameAndPrice(List<Car> listCar, String name, double price){
        return listCar.stream()
                .filter((t) -> t.getOwner().getName().startsWith(name) && t.getPrice() <= 15000.0)
                .map((t) -> t.getPrice())
                .reduce((t, c) -> t.doubleValue() + c.doubleValue())
                .get();
    }
    // Визначитм кількість різних авто, старших 10 років
    public static long findCarOlderTenYear(List<Car> listCar){
        return listCar.stream()
                .distinct()
                .filter((t) -> (new Date().getTime() - t.getDate().getTime())/(365L*24L*60L*60L*1000L) > 10)
                .count();                
    }
    
    // Зменшити вартість автомобідей, старших 2 років на 10% та показати ці авто в хеш сеті
    public static Set<Car> findCarByprice(List<Car> listCar){
        return listCar.stream()
                .filter((t) -> (new Date().getTime() - t.getDate().getTime())/(365L*24L*60L*60L*1000L) > 2)
                .peek((t) -> t.setPrice(t.getPrice() - t.getPrice()*0.1))
                .collect(Collectors.toSet());
    }
    
    //Переглянути власників авто, старших 40 років в полядку убування їх прізвищ
    public static List<String> findOwnerByAge (List<Car> listCar){
        return listCar.stream()
                .filter((t) -> t.getOwner().getAge() < 40)
                .distinct()
                .map((t) -> t.getOwner().getName())
                .sorted()
                .collect(Collectors.toList());
    }
    //Вивести список двигунів в порядку убування потужностей
    public static List<Engine> findEngineByPower(List<Car> listCar){
        return listCar.stream()
                .map((t) -> t.getEngine())
                .sorted((t, c) -> Integer.compare(c.getPower(), t.getPower()))
                .collect(Collectors.toList());                
    }
    // Знайти автомобіль з самим потужним двигуном
    public static Car findCarByPower(List<Car> listCar){
        return listCar.stream()               
                .max((t, c) -> Integer.max(t.getEngine().getPower(), c.getEngine().getPower()))
                .get();               
    }
    //Вивести прізвище власника зеленого авто із замим слабеньким двигуном
    public static String findCarByColorAndMinPower(List<Car> listCar, String color){
        return listCar.stream()
                .filter((t) -> t.getColor().equals(Color.valueOf(color.toUpperCase())))
                .min((t, c) -> Integer.min(t.getEngine().getPower(), c.getEngine().getPower()))
//                .map((t) -> t.getOwner().getName())
                .get().getOwner().getName();
    }
}
