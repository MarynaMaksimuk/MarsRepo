
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numbers = {34,67,3,93,56,72,17,33};
		int largest = numbers[0];
		int small= numbers[0];
		int total=0;
		for(int num:numbers) {
			if (num>largest)
				largest=num;
			
				if (num<small) {
					small=num;
				}
				total+=num;
			}
			System.out.println("largest "+ largest);
			System.out.println("Smallest "+small);
			System.out.println("the sum of all numbers "+total);
		}}


