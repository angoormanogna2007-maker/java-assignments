package AnonymousClasses;

public class Mainn1 {
    public static void main(String[]args){
        Calculator calc = new Calculator(){
            @Override 
            public void add(int a,int b) {
                System.out.println(" Sum is :" + (a+b));

            }
        };
        calc.add(10,20);

    }
}

    

