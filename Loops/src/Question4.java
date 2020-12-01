import java.util.Scanner;

import javax.swing.JOptionPane;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] User_names = new String[10];
		System.out.println("Enter Name : ");
		for(int i=0; i<10; i++)  
		{  
			User_names[i]= sc.next();
		}
		
		System.out.println("Your Names : ");
		for(int i=0; i<10; i++)  
		{  
			System.out.println("Welcome" + " : " + User_names[i]);
		}
	}
}
