import java.util.Scanner;

public class Qst5{

public static void main(String []args)

{

int eggs, dozen, left, gross;

Scanner input= new Scanner(System.in);

System.out.println("How many eggs you have:"); eggs= input.nextInt();

dozen = eggs / 12;

left = eggs % 12;

gross = eggs / 144;

System.out.println("Your number of eggs is " + gross + " gross, " + dozen+" dozen, and " + left + " left over");
}

}