import java.util.Scanner;
class Question09{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days =");
        int days = sc.nextInt();
        double years = days/365;
         
         days = days % 365;
         System.out.println("Number of years ="+years);

            
            int month = days/30;
            
                System.out.println("no of months = "+month);
                
                days = days % 30;

                int weeks = days/7;
                System.out.println("no of weeks = "+weeks);

                days = days % 7;
                
                int day = days;
                System.out.println("no of days = "+day);
    }
}