import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class ShowSwingFeatures extends JFrame{
	public ShowSwingFeatures(){
		setLayout(new GridLayout(2, 3));
		
		JLabel blackLabel = new JLabel("black");
		JLabel blueLabel = new JLabel("blue");
		JLabel cyanLabel = new JLabel("cyan");
		JLabel greenLabel = new JLabel("green");
		JLabel magentaLabel = new JLabel("magenta");
		JLabel orangeLabel = new JLabel("orange");
		
		Border lineBorder = new LineBorder(Color.YELLOW, 3);
		Font boldFont = new Font("TimesRoman", Font.BOLD, 20);
		
		blackLabel.setForeground(Color.BLACK);
		blueLabel.setForeground(Color.BLUE);
		cyanLabel.setForeground(Color.CYAN);
		greenLabel.setForeground(Color.GREEN);
		magentaLabel.setForeground(Color.MAGENTA);
		orangeLabel.setForeground(Color.ORANGE);
		
		blackLabel.setBorder(lineBorder);
		blackLabel.setFont(boldFont);
		
		blueLabel.setBorder(lineBorder);
		blueLabel.setFont(boldFont);
		
		cyanLabel.setBorder(lineBorder);
		cyanLabel.setFont(boldFont);
		
		greenLabel.setBorder(lineBorder);
		greenLabel.setFont(boldFont);
		
		magentaLabel.setBorder(lineBorder);
		magentaLabel.setFont(boldFont);
		
		orangeLabel.setBorder(lineBorder);
		orangeLabel.setFont(boldFont);
		
		add(blackLabel);
		add(blueLabel);
		add(cyanLabel);
		add(greenLabel);
		add(magentaLabel);
		add(orangeLabel);
	}
	
	public static void main(String[] args){
		ShowSwingFeatures frame = new ShowSwingFeatures();
		frame.setTitle("Show swing features");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
