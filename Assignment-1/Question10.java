import java.util.Scanner;
class Question10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of fahrenheit");
        double f = sc.nextDouble();
        double celsius = 5*(f-32)/9;
        System.out.println("Temperature in celsius ="+celsius);
    }
}