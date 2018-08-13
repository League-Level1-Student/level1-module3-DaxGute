import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ButtonTest implements ActionListener {
	JButton but1 = new JButton("hi");
	JButton but2 = new JButton("bye");
	public static void main(String[] args) {
		ButtonTest button = new ButtonTest();
		
	}
	public ButtonTest() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(but1);
		panel.add(but2);
		frame.pack();
		frame.setVisible(true);
		but1.setBackground(Color.cyan);
		but2.setBackground(Color.magenta);
		but1.setOpaque(true);
		but2.setOpaque(true);
		but1.addActionListener(this);
		but2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == but1) {
			System.out.println("but1"); 
		}else if (e.getSource() == but2) {
			System.out.println("but2");
		}
		
	}
}
