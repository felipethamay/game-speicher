package uepb.main.speicher.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;

public class TelaNivelNovo extends JFrame implements ActionListener {

	private static final long serialVersionUID = -6772239863087699308L;

	JMenuBar barra = new JMenuBar();
	JMenu menu = new JMenu("Opções");
	JMenuItem info = new JMenuItem("Informações");
	JMenuItem Novo = new JMenuItem("Novo Jogo");

	JLabel pontos = new JLabel(" JOGADAS: ");
	JTextField pont = new JTextField(3);
	JPanel painelCabecalho = new JPanel();
	JPanel painelFiguras = new JPanel();
	JFrame janela;

	private JButton b1 = new JButton();
	private JButton b2 = new JButton();
	private JButton b3 = new JButton();
	private JButton b4 = new JButton();
	private JButton b5 = new JButton();
	private JButton b6 = new JButton();
	private JButton b7 = new JButton();
	private JButton b8 = new JButton();
	private JButton b9 = new JButton();
	private JButton b10 = new JButton();
	private JButton b11 = new JButton();
	private JButton b12 = new JButton();
	private JButton b13 = new JButton();
	private JButton b14 = new JButton();
	private JButton b15 = new JButton();
	private JButton b16 = new JButton();
	private JButton b17 = new JButton();
	private JButton b18 = new JButton();
	private JButton b19 = new JButton();
	private JButton b20 = new JButton();
	private JButton Botoes[] = { b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19,
			b20 };

	private ImageIcon logo = new ImageIcon(getClass().getResource("/view/Imagens/fundocartas.jpg"));

	private ImageIcon icone = new ImageIcon(getClass().getResource("/view/Imagens/multitouch.jpg"));
	private ImageIcon icone2 = new ImageIcon(getClass().getResource("/view/Imagens/notebook.jpg"));
	private ImageIcon icone3 = new ImageIcon(getClass().getResource("/view/Imagens/processadores.jpg"));
	private ImageIcon icone4 = new ImageIcon(getClass().getResource("/view/Imagens/surface.jpg"));
	private ImageIcon icone5 = new ImageIcon(getClass().getResource("/view/Imagens/tablet1.jpg"));
	private ImageIcon icone6 = new ImageIcon(getClass().getResource("/view/Imagens/ultrabook.jpg"));
	private ImageIcon icone7 = new ImageIcon(getClass().getResource("/view/Imagens/IBM7030.jpg"));
	private ImageIcon icone8 = new ImageIcon(getClass().getResource("/view/Imagens/mouse1.jpg"));
	private ImageIcon icone9 = new ImageIcon(getClass().getResource("/view/Imagens/osborne1.jpg"));
	private ImageIcon icone10 = new ImageIcon(getClass().getResource("/view/Imagens/altair8800.jpg"));

	private Icon imagens[] = { icone, icone2, icone3, icone4, icone5, icone6, icone7, icone8, icone9, icone10, icone,
			icone2, icone3, icone4, icone5, icone6, icone7, icone8, icone9, icone10 };

	private Icon imagensFixas[] = { icone, icone2, icone3, icone4, icone5, icone6, icone7, icone8, icone9, icone10 };

	private String informacoes[] = { " - Notebook (LapTop) - Computador Portátil" + "\r\n"
			+ "Criação: Primeira ideia, meados  de 1970;" + "\r\n"
			+ "Característica: Um laptop (no Brasil, também é chamado de notebook) ou computador portátil (em Portugal, abreviado frequentemente para portátil) "
			+ "\r\n"
			+ "é um computador portátil, leve, proje-tado para ser transportado e utilizado em diferentes lugares com facilidade."
			+ "\r\n"
			+ "Geralmente um laptop contém tela de LCD (cristal líquido), teclado, mouse (geralmente um touchpad, área onde se desliza o dedo),"
			+ "\r\n" + "unidade de disco rígido, portas para conectividade via rede local ou fax/modem," + "\r\n"
			+ "gravadores de CD/DVD. Os mais modernos não possuem mais a entrada para discos flexíveis (disquetes),"
			+ "\r\n"
			+ "e, havendo necessidade de utilizar um desses dispositivos, conecta-se um adaptador a uma das portas USB.; "
			+ "\r\n"
			+ "A expressão laptop deriva da aglutinação dos termos em inglês lap (colo) e top (em cima) significando computador portátil, "
			+ "\r\n" + "em contrapartida aos desktop (em cima da mesa).",
			" - Processadores PENTIUM" + "\r\n" + "Criação: de 1993 à 1999" + "\r\n"
					+ "Características: O Pentium é a quinta geração da arquitetura x86 de microprocessadores criada pela Intel, em 22 de Março de 1993."
					+ "\r\n"
					+ "Foi o sucessor da linha 486. Ele seria originalmente denominado 80586, ou i586, mas como números não podem ser registrados"
					+ "\r\n"
					+ "o nome foi alterado para Pentium (presumivelmente pelo fato da raiz grega 'pent-' significar 'cinco')."
					+ "\r\n"
					+ "O termo i586, entretanto, é usado em programação para se referir a todos os primeiros processadores Pentium (e aos similares fabricados pelos competidores da Intel).",
			" - Tablet - TabletPC" + "\r\n" + "�?pice a partir de 2010" + "\r\n"
					+ "Características: Basicamente é um dispositivo pessoal em formato de prancheta que pode ser usado para acesso à Internet,"
					+ "\r\n"
					+ "organização pessoal e entretenimento. Apresenta uma tela sensível ao toque que é o dispositivo de entrada principal."
					+ "\r\n" + "A ponta dos dedos ou uma caneta aciona suas funcionalidades." + "\r\n"
					+ "É um novo conceito: não deve ser igualado a um computador completo ou um smartphone," + "\r\n"
					+ "embora possua funcionalidades de ambos.",
			" - La Pascaline - A Pascalina" + "\r\n" + "Criação: meados de 1642, por Blaise Pascal" + "\r\n"
					+ "Características: Motivado pela necessidade do pai (que era contador) em fazer cálculos mais avançados,"
					+ "\r\n"
					+ "Pascal com seu conhecimento em física e matemática criou uma 'calculadora' baseada em um sistema de engrenagens."
					+ "\r\n"
					+ "A mesma foi projetada para realizar as 4 operações, porém fielmente eram feitas apenas a adição e a subtração,"
					+ "\r\n" + "onde a multiplicação e a divisão eram feitas por meio de repetição.",
			" - Apple II" + "\r\n" + "Criação: Final da década de 1970" + "\r\n"
					+ "Características: Processador MOS Technology 6502, com clock de 1MHZ, 4KB de Memória RAM,"
					+ "\r\n" + "interface para cassetes de áudio, ROM com interpretador BASIC." + "\r\n"
					+ "Controlador de vídeo com apenas letras maiúsculas (24 linhas x 40 colunas de caracteres)."
					+ "\r\n" + "Gravação de programas e arquivos por meio de fitas cassetes.",
			" - Disquete" + "\r\n" + "Criação: 8'' em 1971, 5'' em 1976, 3 ½'' em 1984.." + "\r\n"
					+ "Características: Conhecido em inglês como floppy-disk (disco flexível) é um disco de mídia magnética remo-vível,"
					+ "\r\n"
					+ "para armazenamento de dados. Os disquetes possuem a mesma estrutura de um disco rígido sendo todos periféricos de entrada e saida,"
					+ "\r\n" + "tendo como diferenças o fato dos disquetes poderem ser removíveis" + "\r\n"
					+ "e o fato dos disquetes serem compostos de um único disco magnético.",
			" - IBM 7030 (Stretch)" + "\r\n"
					+ "Fabricação: 1961, Laboratório Nacional de Los Alamos (Los Alamos, Novo México, EUA)" + "\r\n"
					+ "Características: Também conhecido como Stretch, como o primeiro supercomputador transistorizado,"
					+ "\r\n"
					+ "originalmente com o preço de US$ 13,5 milhões, executando até 1 milhão de operações por segundo."
					+ "\r\n"
					+ "A memória principal era de 16K à 256K. Apesar do IBM 7030 não ter feito o sucesso esperado,"
					+ "\r\n"
					+ "serviu de base para futuros projetos de grande sucesso. Várias linguagens foram desenvolvidas para os computadores de segunda geração,"
					+ "\r\n"
					+ "como Fortran, Cobol e Algol. Assim, softwares já poderiam ser criados com mais facilidade.",
			" - Mouse" + "\r\n" + "Criação: 9 de dezembro de 1968, por Douglas Engelbart (patente nº 3.541.541 em 1970)"
					+ "\r\n"
					+ "Características: Inicialmente em uma caixa de madeira com apenas um botão era chamado de Indicador de posição XY para um sistema com display."
					+ "\r\n"
					+ "É um periférico de entrada que, historicamente, se juntou ao teclado como auxiliar no processo de entrada de dados, especialmente em programas com interface gráfica."
					+ "\r\n"
					+ "O mouse funciona como um apontador sobre a tela do computador e disponibiliza normalmente quatro tipos de operações:"
					+ "\r\n" + "movimento, clique, duplo clique e arrastar e largar (drag and drop)." + "\r\n"
					+ "Existem modelos com um, dois, três ou mais botões cuja funcionalidade depende do ambiente de trabalho e do programa que está a ser utilizado.",
			" - OSBORNE I" + "\r\n" + "Criação: início da década de 80." + "\r\n"
					+ "Características: Considerado o primeiro computador portátil e bem sucedido do mundo," + "\r\n"
					+ "pesando aproximadamente 10,7kg, utilizando um sistema operacional famoso na época o SO CP/M 2.2, tinha um monitor de vídeo de 5."
					+ "\r\n"
					+ "Possuía CPU Zilog Z80, Memória RAM de 64KB e ROM de 4KB, teclado mecânico de 69 teclas e teclado numérico reduzido,"
					+ "\r\n"
					+ "alto falante interno porta IEEE-488 configurável como porta paralela, porta RS232 de 300 ou 1200 bauds,"
					+ "\r\n" + "para uso com modem externo ou impressora serial, 2 acionadores de disquete de 5 1/4,"
					+ "\r\n" + "face simples, densidade simples, 91 KiB cada (densidade dupla disponível: 182 KiB).",
			" - MITS Altair 8800" + "\r\n" + "Criação: 1975" + "\r\n"
					+ "Características: Reconhecido como passo inicial para o computador pessoal, tendo sua linguagem de programação (Altair BASIC),"
					+ "\r\n"
					+ "conduzir a fundação da Microsoft. Era vendido como um kit através da revista estadunidense Popular Eletronics."
					+ "\r\n"
					+ "Contava com processador CPU Intel 8080 além de (na versão inicial) 4 placas empilhadas e interconectadas (a máquina completa não cabia em uma só placa-mãe)."
					+ "\r\n"
					+ "Na versão melhorada foi reduzida a um plano de fundo, onde servia apenas de conexão para os cartões (CPU, memórias e etc.)."
					+ "\r\n"
					+ "Os dispositivos de E/S eram switches e luzes. Como armazenamento poderia também se utilizar de fita de papel,"
					+ "\r\n" + "cartões adicionais RAM e uma interface RS-232 para conectar o próprio terminal.", };

	private int ultimoBotaoClicado = -1;
	private int quantBotoesClicados = 0;
	private int quant_erros = 0;

	public TelaNivelNovo() {
		initialize();
		janela.setTitle("Speicher - Jogo da Memoria");
		janela.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/view/Imagens/icone.png")));
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
	}

	public void initialize() {

		painelCabecalho.add(pontos);
		painelCabecalho.add(pont);
		pont.setEditable(false);

		janela = new JFrame();
		janela.setLayout(new BorderLayout());
		painelFiguras.setLayout(new GridLayout(4, 5, 3, 3));
		janela.add("North", painelCabecalho);
		janela.add("Center", painelFiguras);

		janela.setSize(650, 600);
		janela.setLocation(470, 10);
		janela.setResizable(false);

		menu.add(Novo);
		Novo.addActionListener(this);
		barra.add(menu);
		janela.setJMenuBar(barra);

		montaTela();
	}

	private void montaTela() {

		for (int i = 0; i < Botoes.length; i++) {
			painelFiguras.add(Botoes[i]);
			Botoes[i].addActionListener(this);
		}
	}

	public void iniciar() {
		quant_erros = 0;
		ultimoBotaoClicado = -1;
		quantBotoesClicados = 0;

		pont.setText("" + quant_erros);

		embaralhaExibeTodos();

		Action acao = new AbstractAction() {

			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				escondeTodos();
			}
		};

		Timer t = new Timer(5000, acao);
		t.setRepeats(false);
		t.start();
	}

	private void embaralhaExibeTodos() {

		Collections.shuffle(Arrays.asList(imagens));
		for (int i = 0; i < Botoes.length; i++) {
			Botoes[i].setIcon(imagens[i]);
		}
	}

	private void escondeTodos() {
		for (int i = 0; i < Botoes.length; i++) {
			Botoes[i].setIcon(logo);
		}
	}

	private void exibe(int i) {
		Botoes[i].setIcon(imagens[i]);
	}

	private void esconde(int i) {
		Botoes[i].setIcon(logo);
	}

	private void fazJogada(final int i) {

		if (quantBotoesClicados == Botoes.length) {
			ultimoBotaoClicado = -1;
			quantBotoesClicados = 0;
		}

		if (Botoes[i].getIcon() != logo) {
			return;
		}

		if (ultimoBotaoClicado == -1) {
			exibe(i);
			ultimoBotaoClicado = i;
		} else {
			if (imagens[ultimoBotaoClicado] == imagens[i]) {
				exibe(i);
				quantBotoesClicados += 2;
				ultimoBotaoClicado = -1;
				for (int j = 0; j < 10; j++) {
					if (imagens[i] == imagensFixas[j]) {
						JOptionPane.showMessageDialog(null, informacoes[j], "Informacoes sobre o objeto encontrado.",
								JOptionPane.INFORMATION_MESSAGE, imagensFixas[j]);
						break;
					}
				}

				if (quantBotoesClicados == 20) {
					int resposta = JOptionPane.showConfirmDialog(null,
							"FIM DE JOGO! \nVOCE FEZ " + quant_erros + " JOGADAS\nRepetir?",
							"Speicehr - Jogo da Memoria", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

					if (resposta == JOptionPane.YES_OPTION) {
						iniciar();
					} else {
						janela.setVisible(false);
					}

				}
			} else {

				exibe(i);
				Action acao = new AbstractAction() {

					private static final long serialVersionUID = 5412851698986956697L;

					public void actionPerformed(ActionEvent e) {
						esconde(ultimoBotaoClicado);
						esconde(i);
						ultimoBotaoClicado = -1;
						quant_erros += 1;
						pont.setText("" + quant_erros);
					}
				};

				Timer t = new Timer(200, acao);
				t.setRepeats(false);
				t.start();
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < Botoes.length; i++) {
			if (e.getSource() == Botoes[i]) {
				fazJogada(i);
			}
		}
		if (e.getSource() == Novo) {
			iniciar();
		}
	}
}