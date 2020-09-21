import java.util.Scanner;
class Question21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements= ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        int sum = 0;

        for(int i=0;i<n;i++)
        {
                arr[i]=sc.nextInt();
                sum = sum+arr[i];
                System.out.println("elements =" +arr[i]);
        }
        System.out.println("sum =" +sum);

        double avg = sum/n;
        System.out.println("Average =" +avg);
    }
}