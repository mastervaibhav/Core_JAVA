import java.util.Scanner;
class Question12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary= ");
        int a = sc.nextInt();
        if(a<10000){
        double hra = 0.1 * a;
        double da = 0.9 * a;
        double gs = a+hra+da;
        System.out.println("Gross salary is ="+gs);
        }
        else{
            int hra = 2000;
            double da = 0.98 * a;
            double gs = a+hra+da;
              System.out.println("Gross salary is ="+gs);
        }
        
    }
}