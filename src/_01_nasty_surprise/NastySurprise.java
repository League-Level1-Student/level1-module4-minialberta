package _01_nasty_surprise;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise {
	//work

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel trick= new JPanel();
		JButton trick1= new JButton();
		trick1.addMouseListener(null);
		trick.add(trick1);
		JPanel treat= new JPanel();
		JButton treat1=new JButton();
		treat1.addMouseListener(null);
		treat.add(treat1);
		f.add(trick);
		f.add(treat);
		f.pack();
		
	if (trick1.isEnabled()) {
		showPictureFromTheInternet("https://www.sciencemag.org/sites/default/files/styles/article_main_large/public/dogs_1280p_0.jpg?itok=cnRk0HYq");
		
	}else if (treat1.isEnabled()) {
		showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Clown_chili_peppers.jpg/220px-Clown_chili_peppers.jpg");
	}
	}
	

	private static void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

}
