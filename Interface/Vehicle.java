package Interface;

interface Vehicle {
    void start();
    void stop();
    
}
class Car implements Vehicle{

    public void start()
    {
        System.out.println("car is started");
    }

    public void stop()
    {
        System.out.println("car is stopped");
    }
}
class Main{
    public static void main(String[] args){
        Car c1 = new Car();
        c1.start();
        c1.stop();

    }
}

