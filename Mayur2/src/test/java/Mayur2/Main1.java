package Mayur2;

public class Main1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number_Sorter NS = new Number_Sorter();
		
		
		int val1 = NS.Numbers(88,88);
		
		if (val1 == 0) {
			System.out.println("Both numbers are the same");
		}
		else {
			System.out.println("The lowest number is :" + val1);
		}
		
	
	}
	
}
