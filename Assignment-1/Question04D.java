class Question04D{
	public static void main(String args[]){
		boolean x = true;
		boolean y = false;
		boolean z = x && y || !(x||y);
		System.out.println("value of z="+z);
	}
}