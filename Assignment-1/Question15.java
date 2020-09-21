import java.util.Scanner;
class Question15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender M/F");
        char gender = sc.next().charAt(0);
        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("age ="+age);

        if(((gender=='M') && (age >=21)) || ((gender=='F') && (age >=18)))
        {
            System.out.println("Eligible for marriage");
        }
        else
        {
            System.out.println("Not eligible for marriage");
        }
    }
}