import java.util.Scanner;
public class Qst6 {
    public static void main(String[] args) {
        float performance ,base_salary, x; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Performance level");
        performance = input.nextInt();
        System.out.println("Enter base salary");
        base_salary = input.nextInt();
       if(performance>=90){
           System.out.println("salary is  :"+((base_salary*0.03)+(base_salary)));
       }else{
        System.out.println("salary is  :"+base_salary);
       }

    }
}
