import java.util.Scanner;
class Question08{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount");
        int p = sc.nextInt();

        System.out.println("Enter rate of interest");
        double r = sc.nextDouble();

        System.out.println("Enter the time period");
        int n = sc.nextInt();

        double si = (p*n*r)/100;
        System.out.println("simple interest is ="+si);
    }
}