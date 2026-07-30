package scanner;
    import java.util.Scanner;

 public class squaree{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number is : ");
         
        int num = scan.nextInt();
        int square = num*num;
        System.out.println("square of : " + num + " is : " + square);
    }
    
}

