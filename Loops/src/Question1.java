import javax.swing.JOptionPane;

public class Question1 {
	
   public static void main(String[] args) {
	
	String user_input = JOptionPane.showInputDialog("Please Enter your grade");
	int user_grade = Integer.parseInt(user_input);
	
	if (user_grade >= 85 && user_grade <= 100)
	JOptionPane.showMessageDialog(null, "Your grade is A");
	
	else if(user_grade >= 75 && user_grade < 85)
		JOptionPane.showMessageDialog(null, "Your grade is B");
	
	else if(user_grade >= 50 && user_grade < 65)
		JOptionPane.showMessageDialog(null, "Your grade is C");
	 
	else if (user_grade >= 0 && user_grade < 50)
		JOptionPane.showMessageDialog(null, "Your grade is D");
	
	else
		JOptionPane.showMessageDialog(null, "Please enter valid grade");
}
}
