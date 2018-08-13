import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	char currentLetter = generateRandomLetter();
	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.setup();
	}
	
		char generateRandomLetter() {
		      Random r = new Random();
		      return (char) (r.nextInt(26) + 'a');
		}
		public void setup() {
			JFrame frame = new JFrame("typing: yah");
			frame.setSize(720, 480);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();
			frame.add(panel);
			frame.setVisible(true);
			JLabel l = new JLabel("" + currentLetter);
			l.setFont(l.getFont().deriveFont(28.0f));
			l.setHorizontalAlignment(JLabel.CENTER);
	
			

		}
	}

