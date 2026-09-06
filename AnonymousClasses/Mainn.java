package AnonymousClasses;

public class Mainn {
    public static void main(String[]args){
        Animal animal = new Animal(){
            @Override 
            public void makeSound() {
                System.out.println("cats sys meow..");

            }
        };
        animal.makeSound();

    }
}
