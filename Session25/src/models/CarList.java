package models;

import java.util.ArrayList;

public class CarList {
    private ArrayList<Car> cars;

    public CarList()
    {
        cars = new ArrayList<>();
    }

    public int size()
    {
        return cars.size();
    }

    public int indexOfRegNumber(String regNumber)
    {
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getRegNumber().equals(regNumber))
            {
                return i;
            }
        }
        return -1;
    }
    public Car getCar(int index)
    {
        return cars.get(index);
    }

    public Car getCar(String regNumber)
    {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getRegNumber().equals(regNumber))
            {
                return cars.get(i);
            }
        }
        return null;
    }

    public void addCar(Car car)
    {
        if (indexOfRegNumber(car.getRegNumber()) == -1)
        {
            cars.add(car);
        }
    }

    public String toString()
    {
        String info = "";

        for (int i = 0; i < cars.size(); i++) {
            info += cars.get(i) + "\n";
        }
        return info;
    }
}
