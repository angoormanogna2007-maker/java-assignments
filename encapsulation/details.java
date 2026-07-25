package encapsulation ;

public class details {

    public static void main(String[] args){
        stu s1 = new stu();
        s1.setName("neha");
        s1.setRollno(38);
        s1.setMarks(80);
       
        System.out.println(s1.getName());
        System.out.println(s1.getRollno());
        System.out.println(s1.getMarks());
        s1.stuMarks(s1.getMarks());
 
    }
}
 
 

    

