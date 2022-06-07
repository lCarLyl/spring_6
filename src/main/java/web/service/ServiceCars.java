package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class ServiceCars {

    private final List<Car> car_list = new ArrayList<>();

    public ServiceCars() {
        for (int i = 0; i < 5; i++){
            createCar(i);
        }
    }

    public List<Car> getCarsList(int amount){
        return amount <= 5 ? car_list : car_list.subList(0, amount);
    }

    private void createCar(int series){
        Car car = new Car("Hello", "World", series);
        car_list.add(car);
    }
}
