package observer_pattern;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class dec implements subject ,ActionListener {
	JFrame b;
    JTextField  t;
	public dec(){
		b = new JFrame();
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setSize(300, 300);
		b.setTitle("Decimal Window");
		Container c = b.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.yellow);
		JLabel j = new JLabel();
		j.setText("Input:");
		j.setBounds(5,90,200,30);
		c.add(j);
		t = new JTextField();
		t.setBounds(40,90,190,30);
		t.setBackground(Color.WHITE);
		c.add(t);
		JButton btn = new JButton("Update");
		btn.setBounds(80,120,100,30);
		btn.setBackground(Color.orange);
		c.add(btn);
		btn.addActionListener(this);
		b.setVisible(true);
		c.setLayout(null);
		b.setLayout(null);
	}
	ArrayList<observer> ob = new ArrayList<>();
	@Override
	public void addd(observer o) {
		// TODO Auto-generated method stub
		ob.add(o);
		
	}

	@Override
	public void removee(observer o) {
		// TODO Auto-generated method stub
		ob.remove(o);
		
	}

	@Override
	public void notifyy(String x) {
		// TODO Auto-generated method stub
		for (observer k : ob) {
			k.update(x);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Update")) {
			String data = t.getText();
			this.notifyy(data);
		}
		
	}

}
