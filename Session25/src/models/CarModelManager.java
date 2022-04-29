package models;
import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CarModelManager {
    private String fileName;

    public CarModelManager(String fileName)
    {
        this.fileName = fileName;
    }

    public CarList getAllCars()
    {
        CarList allCars = new CarList();

        try {
            allCars = (CarList) MyFileHandler.readFromBinaryFile(fileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch (IOException e)
        {
            System.out.println("IO Error reading file");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class Not Found");
        }
        return allCars;
    }

    public void addCar(Car car)
    {
        CarList cars = getAllCars();
        cars.addCar(car);
        try {
            MyFileHandler.writeToBinaryFile(fileName, cars);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch (IOException e)
        {
            System.out.println("IO Error reading file");
        }
    }

    public void addCars(CarList cars)
    {
        try {
            MyFileHandler.writeToBinaryFile(fileName, cars);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch (IOException e)
        {
            System.out.println("IO Error reading file");
        }
    }

    public void deleteCar(Car car)
    {
        CarList cars = getAllCars();
        CarList newList = new CarList();

        for (int i = 0; i < cars.size(); i++) {
            if (!(cars.getCar(i).equals(car)))
            {
                newList.addCar(cars.getCar(i));
            }
        }
        try {
            MyFileHandler.writeToBinaryFile(fileName, newList);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch (IOException e)
        {
            System.out.println("IO Error reading file");
        }
    }

    public void deleteCarByRegNumber(String regNumber)
    {
        CarList cars = getAllCars();
        CarList newList = new CarList();

        for (int i = 0; i < cars.size(); i++) {
            if (!(cars.getCar(i).getRegNumber().equals(regNumber)))
            {
                newList.addCar(cars.getCar(i));
            }
        }
        try {
            MyFileHandler.writeToBinaryFile(fileName,newList);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch (IOException e)
        {
            System.out.println("IO Error reading file");
        }
    }
}
