package inheritance;

public class Car extends vehicle{
        String model;
        String fuelType;

        Car(String brand,String color,String model,String fuelType){
            super(brand,color);
            this.model = model;
            this.fuelType = fuelType;
        }
        public void displayCar(){
            displayVehicle();
            System.out.println("model: " + model);
            System.out.println("fuelType: " + fuelType);
        }
    }


    


   