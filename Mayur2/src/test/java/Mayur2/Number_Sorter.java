package Mayur2;

public class Number_Sorter {

	
	public static int Numbers(int a, int b)  {
		
		int lowest;
		
		if (a<b) {
			lowest = a;
			
		}
		
		else if (b<a) {
			lowest = b;
		}
		else {
			lowest = 0;
		} 
		
	return lowest;
		
	}
}
