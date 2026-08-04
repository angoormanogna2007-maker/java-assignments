package oops;
//abstraction
 abstract class Vehicle {
    private int speed;
    private String color;

     //constuctor
     Vehicle(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

//getters and setters encapsulation
public String getColor(){
    return color;
} 
public int getSpeed(){
    return speed;
}  
public void setSpeed(int s){
    if(s >= 0) {
        this.speed =s;
    } else {
        System.out.println("speed cannot be nwgative");
    }
}

abstract void display(); //abstract method
 }
//inheritance
class Car extends Vehicle{
    private  String model;

 Car(String color, int speed, String model){
    super(color,speed);
    this.model = model; 
} 
//polymorphism
@Override
 void display(){
    if(getSpeed() == 0){
        System.out.println(getColor() + " " + model + " started");
    } else {
        System.out.println("stop car first");
    }
    }
}





