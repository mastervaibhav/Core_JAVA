import java.util.Scanner;
class Question20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower number= ");
        int num1 = sc.nextInt();
        System.out.println("Enter upper number= ");
        int num2 = sc.nextInt();
        
        while(num1 < num2)
        {
            boolean flag = false;

            for( int i=2;i<num1/2;i++)
            {
                if(num1%i==0)
                {
                    flag=true;
                    break;
                }
            }
            if (!flag && num1!=0 && num1!=1)
            System.out.println(num1+" ");
            ++num1;
        }
    }
}