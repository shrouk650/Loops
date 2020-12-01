import javax.swing.JOptionPane;

public class Question2 {

	public static void main(String[] args) {
		String user_grade = JOptionPane.showInputDialog("Please enter yout grade");
		
		switch (user_grade){
		
		case "A" :
		  JOptionPane.showMessageDialog(null, "This grade start from  85 till 100");
		  break;
		
		case "B" :
	      JOptionPane.showMessageDialog(null, "This grade start from 75 till 85");
	      break;
	    
		case "C" :
		    JOptionPane.showMessageDialog(null, "This grade start from 50 till 65");
		    break;
		    
		case "D" :
		    JOptionPane.showMessageDialog(null, "This grade start from 0 till 50");
		    break;
		    
		default:
		    JOptionPane.showMessageDialog(null, "This is not valid grade");
		    break;
		}
	}
}
