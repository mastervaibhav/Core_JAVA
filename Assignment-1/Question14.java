import java.util.Scanner;
class Question14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = sc.nextInt();
        
        if(a%4==0 && a%100!=0||a%400==0){
            System.out.println("given year is  leap year");
        }
        else{
               System.out.println("given year is not  leap year");
        }
    }
}