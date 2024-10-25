import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int age = 21;//primitive type
        System.out.println("Hello world!");
        System.out.println(age);


        Date now =  new Date();//reference type
        System.out.println(now);

        int x = 12;
        if(x % 2 == 0){
            System.out.println("This is even no.");
        }
        else{
            System.out.println("This is odd no.");
        }

    }
}