package Ex1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;


@SuppressWarnings("serial")
public class InterfaceFatorial extends JPanel implements ActionListener {
	JLabel label1;
	JTextArea answer;
	

	JTextField entry;
	JButton b1;
	BoxLayout layout;
	static JFrame frame;
	public InterfaceFatorial() {

		JPanel linha1 = new JPanel();
		linha1.setLayout(new BoxLayout(linha1, BoxLayout.X_AXIS));
		linha1.setMaximumSize(new Dimension(Short.MAX_VALUE, 50));
		linha1.setAlignmentX(CENTER_ALIGNMENT);
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(linha1);
		
		linha1.add(Box.createRigidArea(new Dimension(10, 0)));
		label1 = new JLabel("Digite o número desejado:");
		linha1.add(label1);
		linha1.add(Box.createRigidArea(new Dimension(10, 0)));
		

		entry = new JTextField();
		entry.setColumns(20);
		linha1.add(entry);
		linha1.add(Box.createRigidArea(new Dimension(10, 0)));
		
		add(Box.createRigidArea(new Dimension(0, 10)));

		b1 = new JButton("Calcular!");
		b1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		b1.setActionCommand("calculate factorial");
		add(b1);
		
		add(Box.createRigidArea(new Dimension(0, 10)));
		
		answer = new JTextArea();
		answer.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
		answer.setLineWrap(true);
		answer.setEditable(false);
		answer.setBackground(getBackground());
		add(answer);
		
		add(Box.createRigidArea(new Dimension(0, 10)));

		b1.addActionListener(this);
		b1.setDefaultCapable(true);
		
	}

	public static InterfaceFatorial createAndShowWindow() {

		frame = new JFrame("Fatorial");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {

UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			// Not supported. Ignore
		} 
		InterfaceFatorial fatorial = new InterfaceFatorial();
		
		frame.setContentPane(fatorial);
		frame.getRootPane().setDefaultButton(fatorial.b1);
		frame.pack();
		frame.setVisible(true);
		
		return fatorial;
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("calculate factorial")) {
			try {
				int x = Integer.parseInt(entry.getText());
				BigInteger result = Fatorial.fatorial(x);
				answer.setText(result.toString());
				frame.pack();
			} catch (UnsupportedOperationException n) {
				answer.setText((n.getMessage()));
				
			} catch (NumberFormatException n) {
				if (entry.getText().length() > 0)
					answer.setText(("Digite apenas números"));
				else
					answer.setText("Digite algum número");
			}
		}

	}

	public static void main(String args[]) {
		createAndShowWindow();
		
	}
	
	public String getAnswerText() {
		return answer.getText();
	}
}