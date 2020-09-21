class Question03C{
	public static void main(String args[]){
		int x = 2;
		int y = 3;
		int z = (x++) - (--y) - (--x) + (x++);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}
}