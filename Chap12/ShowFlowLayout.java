import javax.swing.*;
import java.awt.*;
class ShowFlowLayout extends JFrame{
	public ShowFlowLayout(){
		setLayout(new FlowLayout(FlowLayout.LEFT));
	
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));
	
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JButton("Button 4"));
		p2.add(new JButton("Button 5"));
		p2.add(new JButton("Button 6"));
	
		add(p1);
		add(p2);
	}

	public static void main(String[] args){
		ShowFlowLayout frame = new ShowFlowLayout();
		frame.setTitle("Show button");
		frame.setSize(600, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
