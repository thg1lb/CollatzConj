import java.lang.Math;
import java.util.Random;


public class Collatz
{
    //defining variables
    public static int ogNumber = 1;
    public static int num = ogNumber;

    public static void main(String[] args) {

        //checks if number is even
        while(num != 1){
            if(num % 2 == 0){
                num = num/2;
                System.out.println(num);
            }

            //or odd
            else {
                num = num*3 + 1;
                System.out.println(num);
            }
        }
    }
}