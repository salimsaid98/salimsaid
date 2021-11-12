import java.util.Scanner;
public class Qst7 {
    public static void main(String[] args) 
    {
    int num1,num2,x,y,z,HCF,LCM;
    Scanner input = new Scanner(System.in);
            System.out.print("enter first number");
            num1= input.nextInt();
            System.out.print("enter second number");
            num2= input.nextInt();
                    x = num1;
                    y=num2;
                        while (y!=0) {
                            z=y;
                            y = x%y;
                            x=z;
                        }
                        HCF = x;
                        LCM =(num1*num2)/HCF;
                System.out.println("HCF of input number is  :"+HCF);
                System.out.println("LCM of input number is  :"+LCM);
    }
}
