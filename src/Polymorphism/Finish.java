package Polymorphism;

import Polymorphism.Vehicle.Car;
import Polymorphism.Vehicle.Sportscar;

public class Finish{
    public static void main(String[] args) {
        Vehicle V3 = new Vehicle();
        V3.Startengine();

        Vehicle V2 = new Car();
        V2.Startengine();

        Vehicle V4 = new Sportscar();
        V4.Startengine();
    }
}