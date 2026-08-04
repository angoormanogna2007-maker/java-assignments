package oops;

public class Main {
    public static void main(String[] args){
        Vehicle C1 = new Car( "Blue" , 0 ,"Mahindra Thar");
        C1.display();
        C1.setSpeed(50);
        C1.display();
        C1.setSpeed(0);
        C1.display();

    }
}
