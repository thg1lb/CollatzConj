import java.util.Scanner;


public class Collatz
{

    public static void main(String[] args) 
    {
        //opening scanner
        Scanner in = new Scanner(System.in);

        //user input
        System.out.print("Please enter a whole number >> ");
        int num = in.nextInt();

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