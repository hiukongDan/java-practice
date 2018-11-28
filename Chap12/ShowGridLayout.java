import javax.swing.*;
import java.awt.*;

public class ShowGridLayout extends JFrame{
	ShowGridLayout(){
		setLayout(new GridLayout(2, 0));
		JPanel p1 = new JPanel(new GridLayout(0, 3));
		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));
		
		JPanel p2 = new JPanel(new GridLayout(0, 3));
		p2.add(new JButton("Button 4"));
		p2.add(new JButton("Button 5"));
		p2.add(new JButton("Button 6"));
		
		add(p1);
		add(p2);
	}
	
	public static void main(String[] args){
		ShowGridLayout frame = new ShowGridLayout();
		frame.setTitle("Shoe grid layout");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
