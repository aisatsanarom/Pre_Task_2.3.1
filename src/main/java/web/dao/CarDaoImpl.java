package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car ("volvo","red",2000));
        cars.add(new Car ("bmw","black",2010));
        cars.add(new Car ("kia","green",2005));
        cars.add(new Car ("opel","yellow",2015));
        cars.add(new Car ("lada","white",2020));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
