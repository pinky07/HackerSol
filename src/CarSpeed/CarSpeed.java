package CarSpeed;

import java.util.*;

class Car {
    public  void topSpeed() {
        System.out.println("Top speed of the vehicle is 100 kmph");
    }

    public  void topSpeed(int topSpeed) {
        System.out.println("Top speed of the vehicle is " + topSpeed + " kmph ");
    }

    public  void topSpeed(String vehicleName, int topSpeed) {
        System.out.println("Top speed of the vehicle " + vehicleName + " is " + topSpeed + " kmph ");
    }

    public void fuelType() {
        System.out.println("ParentChild.CarSpeed.Car fuel type is Petrol");
    }

    public static class SUV extends ParentChild.Car {
        public void fuelType() {
            System.out.println("SUV fuel type is Diesel");
        }
    }
}
    public class CarSpeed
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<2;i++) {
                String input = sc.nextLine();
                ParentChild.Car suv = new ParentChild.Car.SUV();
                if(input.equals("topSpeed")){
                    suv.topSpeed();
                }
                if(input.equals("fuelType")){
                    suv.fuelType();
                }
                ParentChild.Car car = new ParentChild.Car();
                if(input.equals("topSpeed")){
                    car.topSpeed();
                }
                if(input.equals("fuelType")){
                    car.fuelType();
                }
            }

        }
    }
