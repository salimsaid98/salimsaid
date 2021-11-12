import java.util.Scanner;
public class Qst2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        System.out.println("enter your city");
        String city = input.nextLine();
        System.out.println("enter your collage");
        String colage = input.nextLine();
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("enter your profession");
        String pro = input.nextLine();
        System.out.println("enter your petname");
        String pet = input.nextLine();
        System.out.println("There once was a person name  :"+name+"who lived in  :"+city+"At the of :"+age+" ,"+name+"went to college at :"+colage+"."+name+"gradueted and went to work as an account. Then,"+name+"adopted a animal named "+pet+"They both lived happily ever after!");
        
       


        


    }
}