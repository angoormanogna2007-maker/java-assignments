package inheritance;

public class person {
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayperson(){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
    class Student extends person{
        int rollNo;
        String course; 

        Student(String name,int age,int rollNo,String course){
        super(name,age);
        this.rollNo = rollNo;
        this.course = course;
    }
     void displayStudent(){
        displayperson();
        System.out.println("rollNo:" + rollNo);
        System.out.println("course:" + course);
    }
    }


