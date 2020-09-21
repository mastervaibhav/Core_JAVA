import java.util.Scanner;
class Question19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number =");
        int n = sc.nextInt();
         for(int i=12; i<=n    ;i=i+10){
             System.out.println(" "+i);
         }
    }
}