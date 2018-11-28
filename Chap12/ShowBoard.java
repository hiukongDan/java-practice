import javax.swing.*;
import java.awt.*;

public class ShowBoard extends JFrame{
	public ShowBoard(){
		setLayout(new GridLayout(8, 8));
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				JButton bt = new JButton();
				// set white button
				if ((i + j) % 2 == 0)
					bt.setBackground(Color.WHITE);
				else
					bt.setBackground(Color.BLACK);
					
				add(bt);
			}
		}
	}
	
	public static void main(String[] args){
		ShowBoard frame = new ShowBoard();
		frame.setTitle("Show chess board");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
