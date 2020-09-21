import java.util.Scanner;
class Question06{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius r");
		int r = sc.nextInt();
		double a = 3.14 * (r*r);
		double p = 2 * (3.14) * r;
		System.out.println("area= "+a);
		System.out.println("perimeter= "+p);
		
	}
}