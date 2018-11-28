import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class DisplayTicTacToeBoard extends JFrame{
	private ImageIcon x = new ImageIcon("pics/x.gif");
	private ImageIcon o = new ImageIcon("pics/o.gif");
	
	public DisplayTicTacToeBoard(){
		setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++){
			int a = (int)(Math.random() * 3);
			switch (a){
				case 1: add(new JLabel(x)); break;
				case 2: add(new JLabel(o)); break;
				case 0: add(new JLabel()); break;
				default: break;
			}
		}
	}
	
	public static void main(String[] args){
		DisplayTicTacToeBoard frame = new DisplayTicTacToeBoard();
		frame.setTitle("Display Tictactoe board");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
