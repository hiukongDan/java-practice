import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ShowLabels extends JFrame{
	public ShowLabels(){
		setLayout(new GridLayout(4, 1));
		Border lineBorder = new LineBorder(Color.BLACK, 2);
		JLabel l1 = new JLabel("Department of Computer Science");
		l1.setBorder(lineBorder);
		JLabel l2 = new JLabel("School of Computer");
		l2.setBorder(lineBorder);
		JLabel l3 = new JLabel("Armstrong Stlantic State University");
		l3.setBorder(lineBorder);
		JLabel l4 = new JLabel("Tel:(912)921-6440");
		l4.setBorder(lineBorder);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	}
	
	public static void main(String[] args){
		ShowLabels frame = new ShowLabels();
		frame.setTitle("Show labels");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
