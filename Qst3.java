import java.util.Scanner;
public class Qst3 {
    public static void main(String[] args) {
        float price =2500;
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number of perticipant");
    int number = input.nextInt();
    float revenue = price * number;
    System.out.println("Total revenue is  :"+revenue);
    }
}
