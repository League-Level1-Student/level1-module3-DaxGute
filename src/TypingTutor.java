import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	private char currentLetter = generateRandomLetter();
	private JLabel l;
	private final int NUM_LETTERS_IN_ALPHABET = 26;
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.setup();
	}
	
		char generateRandomLetter() {
		      Random r = new Random();
		      return (char) (r.nextInt(NUM_LETTERS_IN_ALPHABET) + 'a');
		}
		public void setup() {
			JFrame frame = new JFrame("typing: yah");
			frame.setSize(720, 480);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();
			frame.add(panel);
			frame.setVisible(true);
			l = new JLabel("" + currentLetter);
			panel.add(l);
			l.setFont(l.getFont().deriveFont(28.0f));
			l.setHorizontalAlignment(JLabel.CENTER);
			l.setOpaque(true);
			frame.addKeyListener(this);
			
			
 
		}

		@Override
		public void keyTyped(KeyEvent e) {
						
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		
			System.out.print("you typed " + e.getKeyChar() );
			if (e.getKeyChar() == currentLetter) {
				System.out.println(" correct ");
				currentLetter = generateRandomLetter();
				l.setText("" + currentLetter);
				l.setBackground(Color.GREEN);
			}else {
				System.out.println(" Incorrect");
				currentLetter = generateRandomLetter();
				l.setText("" + currentLetter);
				
				l.setBackground(Color.RED);
				
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

