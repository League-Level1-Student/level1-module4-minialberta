package _04_chuckle_clicker;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
public static void main(String[] args) {
//step 5
}
JButton joke=new JButton();
JButton punchline= new JButton();
 void makeButtons() {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();

	joke.addActionListener(null);
	punchline.addActionListener(null);
	panel.add(joke);
	panel.add(punchline);
	frame.add(panel);

}}
