import java.util.Scanner;
public class Qst8 {
       public static void main(String[] args) {
        int year,day,remainminute,minutes;

        Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of the minutes :");
     minutes = input.nextInt();

        //number of minutes per year
        year = minutes/525600;
        day = minutes/1440;
        remainminute = day%525600;
        System.out.println(minutes+"minutes is "+year+"  year and "+remainminute+"days");


    }
}
