
import java.util.Scanner;


public class FizzBuzz {
    public static void main(String args[]){

        //take input as number
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

        if( number % 3 == 0 && number % 5 == 0){
            System.out.println("Fizz Buzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if ( number % 3 == 0) {
            System.out.println("buzz");
        }
        else {
            System.out.println(number) ;
        }


    }
}
