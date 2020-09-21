import java.util.Scanner;
class Question16{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter numner= ");
       int num = sc.nextInt();
       for (int i=1;i<=10;i++) {
           int a = (num*i);
           System.out.println(" " +a);
       }
    }
}