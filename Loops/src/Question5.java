import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		 
		int sum = 0;
		double Average =0;
		Scanner sc = new Scanner(System.in);
		int[] User_numbers = new int[5];
		System.out.println("Enter numbers : ");
		for(int i=0; i<5; i++)  
		{  
			User_numbers[i]= sc.nextInt();
			sum += User_numbers[i];
		}
		Average = sum / 5;
		System.out.println("The total is : " + " " + sum);
		System.out.println("The Average is : " + " " + Average);
		
	}
}
