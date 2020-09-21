import java.util.Scanner;;
class Question11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers before Swapping");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("first number is "+a);
        System.out.println("second number is "+b);
        System.out.println("After Swapping");
        int B = a+b;
        b = B-b;
        a = B-a;

        System.out.println("first number a= "+a);
        System.out.println("second number b= "+b);

        

    }
}