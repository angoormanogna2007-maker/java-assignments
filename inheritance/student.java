package inheritance;

public class student extends person{
        int rollNo;
        String course; 

        student(String name,int age,int rollNo,String course){
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


 
    

