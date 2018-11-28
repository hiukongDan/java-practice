import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class ShowIcon extends JFrame{
	private ImageIcon ukIcon = new ImageIcon("pics/british-flag.png");
	private ImageIcon myIcon = new ImageIcon("pics/malaysian-flag.png");
	private ImageIcon nwIcon = new ImageIcon("pics/norway-flag.png");
	private ImageIcon frIcon = new ImageIcon("pics/france-flag.png");
	
	public ShowIcon(){
		setLayout(new GridLayout(2, 2, 3, 3));
		
		Border lineBorder = new LineBorder(Color.BLACK, 2);
		JLabel ukLabel = new JLabel(ukIcon);
		ukLabel.setBorder(lineBorder);
		JLabel myLabel = new JLabel(myIcon);
		myLabel.setBorder(lineBorder);
		JLabel nwLabel = new JLabel(nwIcon);
		nwLabel.setBorder(lineBorder);
		JLabel frLabel = new JLabel(frIcon);
		frLabel.setBorder(lineBorder);
		
		add(ukLabel);
		add(myLabel);
		add(nwLabel);
		add(frLabel);
	}
	
	public static void main(String[] args){
		ShowIcon frame = new ShowIcon();
		frame.setTitle("Show icon");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
