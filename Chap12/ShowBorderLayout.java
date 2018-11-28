import javax.swing.*;
import java.awt.*;

public class ShowBorderLayout extends JFrame{
	public ShowBorderLayout(){
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add(new JButton("Button 1"), BorderLayout.WEST);
		p1.add(new JButton("Button 2"), BorderLayout.CENTER);
		p1.add(new JButton("Button 3"), BorderLayout.EAST);
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JButton("Button 4"), BorderLayout.WEST);
		p2.add(new JButton("Button 5"), BorderLayout.CENTER);
		p2.add(new JButton("Button 6"), BorderLayout.EAST);
		
		add(p1, BorderLayout.Center);
		add(p2, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){
		ShowBorderLayout frame = new ShowBorderLayout();
		frame.setTitle("Show Border Layout");
		frame.setSize(500, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
