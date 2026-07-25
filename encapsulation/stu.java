package encapsulation;

public class stu {
    private String name;
    private int rollno;
    private int marks;

public String getName(){
    return name;
}
public int getRollno(){
    return rollno;
}
public int getMarks(){
    return marks;
}
 
public void setName(String name){
    this.name = name;
}
public void setRollno(int rollno){
    this.rollno = rollno;
}
public void setMarks(int marks){
    this.marks = marks;
}


public void stuMarks(int marks){
    if(marks >= 35){
        System.out.println("pass");
    } else {
        System.out.println("fail");
    }
}
}
 



    

