package inheritance;

public class person {
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayperson(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
    