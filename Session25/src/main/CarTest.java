package main;

import models.*;
import utils.MyFileHandler;

public class CarTest {
    public static void main(String[] args) {
        CarModelManager carModelManager = new CarModelManager("Session25/Cars");

        CarList list = carModelManager.getAllCars();
        System.out.println("All students:");
        System.out.println("------------------------------------------------------------");
        System.out.println(list);


    }
}
