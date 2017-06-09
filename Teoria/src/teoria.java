import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;

public class teoria extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teoria frame = new teoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public teoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 313);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEtiqueta = new JLabel("Etiqueta");
		contentPane.add(lblEtiqueta, BorderLayout.NORTH);
		
		JButton click = new JButton("Click");
		click.setForeground(Color.BLACK);
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEtiqueta.setText("Hola que tal");
			}
		});
		contentPane.add(click, BorderLayout.SOUTH);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(81, 89, 81, 91);
		desktopPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
	}
}
