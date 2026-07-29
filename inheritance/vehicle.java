package inheritance;

public class vehicle {
    String brand;
    String color;
    public vehicle(String brand,String color){
        this.brand = brand;
        this.color = color;
    }
    public void displayVehicle(){
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
    }
    }
    class Car extends vehicle{
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


    

