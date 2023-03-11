package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.Dao;
import web.models.Car;


import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private Dao dao;

    @Autowired
    public CarServiceImp(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> carsList(int count) {
        if (count > 5) {
            return dao.getCars();
        } else {
            return dao.getFewCars(count);
        }
    }

    @Override
    public List<Car> carsList() {
        return dao.getCars();
    }


}