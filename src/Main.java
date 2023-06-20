import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int Guess = 0;
        String trash ="";
        boolean done = false;
        do
        {
            System.out.print("Enter your guess : ");
            if(in.hasNextInt())
            {
                Guess = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid entry " + trash + "get an INterger between 1 and 10 incluive");
            }
        }while (!done);
        Random generator = new Random();
        int val = generator.nextInt(10);
        if(val > Guess)
        {
            System.out.println("The Guess was low " + Guess + " The random number " + val);
        }
        else if (val < Guess)
        {
            System.out.println("The Guess was high " + Guess + " The random number " + val);
        }
        else
        {
            System.out.println("on the money " + Guess + " The random number " + val);
        }

    }
}