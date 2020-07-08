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
		setTitle("Instruções");
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
		textArea.setText("Intruções" + "\r\n" + "\r\n"
				+ "O jogo da memória Speicher tem como foco maior o auxílio aos alunos que necessitam adquirir conhecimentos acerca da História da Computação. Tal assunto é temido pelos alunos da área da tecnologia da informação, devido principalmente ao excesso de teoria, onde tal modalidade não é de grande afeto por parte dos discentes da área das exatas. Por isso, com a simplicidade de um jogo da memória, esperamos que o conteúdo abstrato anteriormente citado seja adquirido com maior eficiência e diversão possível!"
				+ "\r\n" + "Abaixo, relacionamos as opções e menus disponíveis no jogo." + "\r\n" + "1.	Arquivo"
				+ "\r\n" + "    1.1.	 Iniciar Jogo / Iniciar um novo jogo" + "\r\n" + "    1.2.	 Sair - Sai do jogo"
				+ "\r\n" + "2.	Ajuda" + "\r\n"
				+ "    2.1.	 Instruções: Disponibiliza ao usuário as instruções do jogo, como se utilizar da melhor forma do mesmo."
				+ "\r\n"
				+ "Ao clicar no botão Iniciar, no canto inferior direito da tela do jogo (o qual executará a mesma ação que Arquivo > Iniciar), será apresentada a tela da seleção do nível de dificuldade onde no jogo estão disponíveis os níveis Fácil e Difícil, sendo:"
				+ "\r\n"
				+ "Computadores Novos: contendo 20 (vinte) peças, score no canto superior da tela (contabilizando os erros);"
				+ "\r\n"
				+ "Computadores Antigos: contendo 30 (trinta) peças, com score também no canto superior da tela, porém a cada acerto são contabilizados 10 (dez) pontos positivos e a cada erro 5 (cinco) pontos são diminuídos."
				+ "\r\n"
				+ "Abaixo relacionamos o conteúdo que foi utilizado como base para as informações adicionais de cada par do jogo da memória.");
		contentPane.add(textArea);
	}
}
