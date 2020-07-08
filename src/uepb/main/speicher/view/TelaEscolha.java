package uepb.main.speicher.view;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaEscolha extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1078470575011269476L;

	JLabel tpo;
	ImageIcon topo;
	JPanel painel_topo, painel_centro;
	JButton b1, b2;

	TelaNivelNovo nivel1;
	TelaNivelAntigo nivel2;

	public TelaEscolha() {
		initialize();
		setTitle("Speicher - Jogo da Memoria");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/view/Imagens/icone.png")));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
	}

	public void initialize() {

		tpo = new JLabel();
		painel_topo = new JPanel();
		painel_centro = new JPanel();
		getContentPane().setLayout(null);

		b1 = new JButton("");
		b1.setBounds(143, 384, 108, 89);
		b1.addActionListener(this);
		b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Imagens/novos.jpg")));

		b2 = new JButton("");
		b2.setBounds(555, 380, 108, 89);
		b2.addActionListener(this);
		painel_centro.add(b2);
		painel_centro.add(b1);
		b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Imagens/antigos.jpg")));

		JLabel lblImage = new JLabel("image");
		lblImage.setBounds(0, -39, 800, 600);
		lblImage.setIcon(new ImageIcon(getClass().getResource("/view/Imagens/desafio.jpg")));
		painel_centro.add(lblImage);

		setBounds(100, 100, 812, 595);
		getContentPane().setLayout(new BorderLayout());

		setResizable(false);
		tpo.setIcon(topo);
		painel_topo.add(tpo);
		painel_centro.setLayout(null);

		getContentPane().add("North", painel_topo);
		getContentPane().add("Center", painel_centro);
		setLocation(0, 10);
		nivel1 = new TelaNivelNovo();
		nivel2 = new TelaNivelAntigo();
		setVisible(true);
	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			nivel1.janela.show();
			nivel2.janela2.hide();
			nivel1.iniciar();
		}

		if (e.getSource() == b2) {
			nivel1.janela.hide();
			nivel2.janela2.show();
			nivel2.iniciar();
		}
		setVisible(false);
	}
}
