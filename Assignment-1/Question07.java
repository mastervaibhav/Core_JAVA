import java.util.Scanner;
class Question07{
        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Math");
        int a =sc.nextInt();

        System.out.println("Enter marks of Science");
        int b =sc.nextInt();

        System.out.println("Enter marks of English");
        int c =sc.nextInt();

        System.out.println("Enter marks of History");
        int d =sc.nextInt();

        System.out.println("Enter marks of Geography");
        int e =sc.nextInt();

        int f =a+b+c+d+e;
        System.out.println("sum of "+a+"sum of "+b+"sum of "+c+"sum of "+d+"sum of "+e+"is"+f);

        double p =(f/5.0);
        System.out.println("percentage is "+p+"%");
        }
}