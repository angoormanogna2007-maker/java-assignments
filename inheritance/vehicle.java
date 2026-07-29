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
    