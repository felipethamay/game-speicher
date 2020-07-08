package uepb.main.speicher.view;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class TelaInicio extends JFrame {

	private static final long serialVersionUID = -5887006140178858701L;
	private JPanel contentPane;

	public static void main(String[] args) {
		TelaInicio frame = new TelaInicio();
		frame.setVisible(true);
	}

	public TelaInicio() {
		setTitle("Speicher - Jogo da Memoria");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/view/Imagens/icone.png")));
		initialize();
		this.setLocationRelativeTo(null);
		setResizable(false);
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnIniciar = new JButton("");
		btnIniciar.setBounds(347, 405, 120, 120);
		contentPane.add(btnIniciar);
		btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Imagens/iniciar.jpg")));

		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaEscolha t1Inicial = new TelaEscolha();
				t1Inicial.setVisible(true);
			}
		});

		JLabel lblImage = new JLabel("image");
		lblImage.setBounds(0, 0, 900, 576);
		lblImage.setIcon(new ImageIcon(getClass().getResource("/view/Imagens/capa.jpg")));
		contentPane.add(lblImage);

		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);

		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);

		JMenu menuAjuda = new JMenu("Ajuda");
		menuBar.add(menuAjuda);

		JMenuItem mntmInstrues = new JMenuItem("Instruções");
		menuAjuda.add(mntmInstrues);
		mntmInstrues.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				TelaInstrucoes t1 = new TelaInstrucoes();
				t1.setVisible(true);
			}
		});

		JMenuItem menuItemIniciar = new JMenuItem("Iniciar");
		menuArquivo.add(menuItemIniciar);
		menuItemIniciar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				TelaEscolha t1Inicial = new TelaEscolha();
				t1Inicial.setVisible(true);
			}
		});

		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuArquivo.add(menuItemSair);
		menuItemSair.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
