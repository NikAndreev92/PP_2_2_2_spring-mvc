package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class Dao implements DaoI {

    public static final List <Car> cars = new ArrayList<>();
    static {
        Car car1 = new Car("black", "A", 1);
        Car car2 = new Car("white", "B", 2);
        Car car3 = new Car("red", "C", 3);
        Car car4 = new Car("green", "D", 4);
        Car car5 = new Car("gray", "E", 5);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

    }
    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getFewCars(int count) {
        return cars.subList(0, count);
    }


}