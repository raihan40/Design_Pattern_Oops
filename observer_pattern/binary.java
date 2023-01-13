package observer_pattern;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class binary implements observer {
	JFrame b;
	JTextField j;
	public binary() {
		b = new JFrame();
		b.setVisible(true);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setSize(300, 300);
		b.setTitle("Binary Window");
		b.setResizable(false);
		Container c = b.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		j = new JTextField();
		j.setBackground(Color.YELLOW);
		c.add(j);
		j.setBounds(30,90,200,30);
	}
	@Override
	public void update(String x) {
		// TODO Auto-generated method stub
		
		j.setText("The result is: "+Integer.toBinaryString((Integer.parseInt(x))));
		}

}

