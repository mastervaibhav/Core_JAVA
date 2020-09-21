import java.util.Scanner;
class Question17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            int a = num%10;
            sum = (sum * 10)+ a;
            num = num/10;
        }
		
        System.out.println("Reverse number = "+sum);

    }
}