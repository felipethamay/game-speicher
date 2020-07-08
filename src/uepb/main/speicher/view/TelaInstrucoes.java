package uepb.main.speicher.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.TextArea;

public class TelaInstrucoes extends JFrame {

	private static final long serialVersionUID = -185830811503756920L;
	private JPanel contentPane;

	public TelaInstrucoes() {
		setTitle("Instru��es");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/view/Imagens/icone.png")));
		initialize();
		this.setLocationRelativeTo(null);
		setResizable(false);

	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TextArea textArea = new TextArea();
		textArea.setBounds(10, 0, 424, 262);
		contentPane.add(textArea);

		textArea.setEditable(false);
		textArea.setBackground(Color.WHITE);
		textArea.setText("Intru��es" + "\r\n" + "\r\n"
				+ "O jogo da mem�ria Speicher tem como foco maior o aux�lio aos alunos que necessitam adquirir conhecimentos acerca da Hist�ria da Computa��o. Tal assunto � temido pelos alunos da �rea da tecnologia da informa��o, devido principalmente ao excesso de teoria, onde tal modalidade n�o � de grande afeto por parte dos discentes da �rea das exatas. Por isso, com a simplicidade de um jogo da mem�ria, esperamos que o conte�do abstrato anteriormente citado seja adquirido com maior efici�ncia e divers�o poss�vel!"
				+ "\r\n" + "Abaixo, relacionamos as op��es e menus dispon�veis no jogo." + "\r\n" + "1.	Arquivo"
				+ "\r\n" + "    1.1.	 Iniciar Jogo / Iniciar um novo jogo" + "\r\n" + "    1.2.	 Sair - Sai do jogo"
				+ "\r\n" + "2.	Ajuda" + "\r\n"
				+ "    2.1.	 Instru��es: Disponibiliza ao usu�rio as instru��es do jogo, como se utilizar da melhor forma do mesmo."
				+ "\r\n"
				+ "Ao clicar no bot�o Iniciar, no canto inferior direito da tela do jogo (o qual executar� a mesma a��o que Arquivo > Iniciar), ser� apresentada a tela da sele��o do n�vel de dificuldade onde no jogo est�o dispon�veis os n�veis F�cil e Dif�cil, sendo:"
				+ "\r\n"
				+ "Computadores Novos: contendo 20 (vinte) pe�as, score no canto superior da tela (contabilizando os erros);"
				+ "\r\n"
				+ "Computadores Antigos: contendo 30 (trinta) pe�as, com score tamb�m no canto superior da tela, por�m a cada acerto s�o contabilizados 10 (dez) pontos positivos e a cada erro 5 (cinco) pontos s�o diminu�dos."
				+ "\r\n"
				+ "Abaixo relacionamos o conte�do que foi utilizado como base para as informa��es adicionais de cada par do jogo da mem�ria.");
		contentPane.add(textArea);
	}
}
