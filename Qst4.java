import java.util.Scanner;

public class Qst4{

public static void main(String []args)

{


int gallons;

double miles, price, far, cost;

Scanner input= new Scanner(System.in);

System.out.println("Enter number of gallons:");

gallons= input.nextInt();

System.out.println("Enter number of miles:");

miles= input.nextDouble();

System.out.println("Enter price:");

price= input.nextDouble();

far = gallons * miles;

cost = price * 250;

System.out.println("The car can travel " + far + " miles");

System.out.println("The cost of the car is " + cost + " in 250 miles");

}

}
