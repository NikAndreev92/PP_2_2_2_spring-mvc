package web.dao;

import web.models.Car;

import java.util.List;

public interface DaoI {
    public List<Car> getCars();

    public List<Car> getFewCars(int count);

}
