import java.util.Scanner;
class Question18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number =");
        int num = sc.nextInt();
        boolean check = false;

        for(int i=2; i<num/2; ++i){
          
            if (num%i==0)
            {
                    check = true;
                    break;
             }

        }
        if (!check){
            System.out.println("given number is prime number");

        }
        else{
            System.out.println("given number is not prime number");
        }
    }
    
}