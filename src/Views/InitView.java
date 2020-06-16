package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.IniitController;
import Functions.FunctionsInitController;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class InitView extends JFrame {

	private FunctionsInitController functionInit;
	private CadastroLivroView cadastroView;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitView frame = new InitView();
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
	public InitView() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meus Livros");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(6, 73, 438, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(39, 183, 117, 29);
		contentPane.add(btnExibir);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(264, 183, 117, 29);
		contentPane.add(btnCadastrar);
		
		FunctionsInitController handle = new FunctionsInitController(cadastroView);
		
		handle.abrirExibirView();
		
		btnCadastrar.addActionListener((ActionListener) handle);
		btnExibir.addActionListener((ActionListener) handle);
	}
	
}
