package uepb.main.speicher.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class TelaNivelAntigo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1784118631321957411L;

	JFrame janela2;
	JMenuBar barra = new JMenuBar();
	JMenu menu = new JMenu("Opções");
	JMenuItem info = new JMenuItem("Informações");
	JMenuItem Novo = new JMenuItem("Novo Jogo");
	JLabel regra = new JLabel("JOGADAS: ");
	JTextField pont = new JTextField(3);

	private JPanel painelCabecalho = new JPanel();
	private JPanel painelFiguras = new JPanel();

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
	private JButton b21 = new JButton();
	private JButton b22 = new JButton();
	private JButton b23 = new JButton();
	private JButton b24 = new JButton();
	private JButton b25 = new JButton();
	private JButton b26 = new JButton();
	private JButton b27 = new JButton();
	private JButton b28 = new JButton();
	private JButton b29 = new JButton();
	private JButton b30 = new JButton();

	private JButton Botoes[] = { b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19,
			b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30 };

	private ImageIcon logo = new ImageIcon(getClass().getResource("/view/Imagens/fundocartas.jpg"));

	private ImageIcon icone = new ImageIcon(getClass().getResource("/view/Imagens/BabbageDifferenceEngine.jpg"));
	private ImageIcon icone2 = new ImageIcon(getClass().getResource("/view/Imagens/edsac2.jpg"));
	private ImageIcon icone3 = new ImageIcon(getClass().getResource("/view/Imagens/edvac.jpg"));
	private ImageIcon icone4 = new ImageIcon(getClass().getResource("/view/Imagens/eniac2.jpg"));
	private ImageIcon icone5 = new ImageIcon(getClass().getResource("/view/Imagens/ibm360.jpg"));
	private ImageIcon icone6 = new ImageIcon(getClass().getResource("/view/Imagens/ibm650.jpg"));
	private ImageIcon icone7 = new ImageIcon(getClass().getResource("/view/Imagens/Colossus.jpg"));
	private ImageIcon icone8 = new ImageIcon(getClass().getResource("/view/Imagens/IBM7030.jpg"));
	private ImageIcon icone9 = new ImageIcon(getClass().getResource("/view/Imagens/iibm7094.jpg"));
	private ImageIcon icone10 = new ImageIcon(getClass().getResource("/view/Imagens/leo.jpg"));
	private ImageIcon icone11 = new ImageIcon(getClass().getResource("/view/Imagens/pdp8.jpg"));
	private ImageIcon icone12 = new ImageIcon(getClass().getResource("/view/Imagens/trasistor.jpg"));
	private ImageIcon icone13 = new ImageIcon(getClass().getResource("/view/Imagens/univac.jpg"));
	private ImageIcon icone14 = new ImageIcon(getClass().getResource("/view/Imagens/valvula.jpg"));
	private ImageIcon icone15 = new ImageIcon(getClass().getResource("/view/Imagens/circ_int_Intel4004.jpg"));

	private Icon imagens[] = { icone, icone2, icone3, icone4, icone5, icone6, icone7, icone8, icone9, icone10, icone11,
			icone12, icone13, icone14, icone15, icone, icone2, icone3, icone4, icone5, icone6, icone7, icone8, icone9,
			icone10, icone11, icone12, icone13, icone14, icone15 };

	private Icon imagensFixas[] = { icone, icone2, icone3, icone4, icone5, icone6, icone7, icone8, icone9, icone10,
			icone11, icone12, icone13, icone14, icone15 };

	private String informacoes[] = {
			" - Máquina Diferencial de Babbage" + "\r\n" + "Fabricação: Por Charles Babbage, em 1822." + "\r\n"
					+ "Características: Tinha a capacidade de receber dados, processá-los," + "\r\n"
					+ "armazená-los e exibí-los. É considerada a primeira tentativa de se construir" + "\r\n"
					+ "uma máquina computacional automática e adaptável." + "\r\n"
					+ "Tinha como principal objetivo sanar os problemas advindos da automação" + "\r\n"
					+ "de processos da Revolução industrial principalmente logaritmos," + "\r\n"
					+ "composição de tabelas trigonométricas. Infelizmente por conta de falta de engenharia suficiente"
					+ "\r\n" + "e conflitos políticos (que evitaram possíveis subsídios)" + "\r\n"
					+ "a máquina nunca entrou em produção.",
			" - EDSAC 2: Eletronic Delay Storage Automatic Calculator" + "\r\n"
					+ "Fabricação: 1958 na Universidade de Cambridge  Inglaterra" + "\r\n"
					+ "Características: Foi o sucessor do EDSAC, tem como principal característica ser o primeiro computador a possuir unidade de controle micro programada"
					+ "\r\n"
					+ "e uma arquitetura 'bit slice', tendo estabelecido a micro programação como base para o projeto do computador.",
			" - EDVAC: Eletronic Discrete Variable Automatic Computer  Computador Eletrônico Automático de Variáveis Discretas"
					+ "\r\n"
					+ "Fabricação: Contrato assinado em 1946, sendo entregue ao laboratório militar em 1949, começando a operar até 1951."
					+ "\r\n"
					+ "Características: Foi um dos primeiros computadores eletrônicos, utilizando sistema binário e arquitetura Von Neumman."
					+ "\r\n"
					+ "Considerado um sucesso na história da computação EDVAC fisicamente possuía quase 6.000 tubos de vácuo e 12.000 diodos."
					+ "\r\n"
					+ "Consumidos 56 kilowatts de potência. Abrangendo 45,5 metros quadrados de espaço e pesava 7850 kg."
					+ "\r\n" + "A equipe operacional composta por trinta pessoas para cada turno oito horas." + "\r\n"
					+ "Em 1960, ele correu para mais de 20 horas por dia, com períodos sem erro de oito horas em média.",
			" - ENIAC: Eletronic Numeral Integrator and Computer  Integrador de Numerais e Computador Eletrônico"
					+ "\r\n" + "Criação: 1946 pela Eletronic Control Company" + "\r\n"
					+ "Características: Início de desenvolvimento em 1943 durante a II Guerra Mundial," + "\r\n"
					+ "visando cálculos de trajetórias táticas que necessitassem de conhecimento substancial em Matemática,"
					+ "\r\n"
					+ "tornando-se operacional após a guerra. Pesava mais de 30 toneladas, ocupava 270 m², realizava 5000 operações por segundo,"
					+ "\r\n"
					+ "possuindo 18000 válvulas de 160 Kw de potência, tinha que ser operado manualmente visto que não possuía sistema operacional."
					+ "\r\n"
					+ "Não operava na base binária, apenas na base de dez. Finalidade principal: cálculos balísticos.",
			" - IBM 360" + "\r\n" + "Fabricação: 7 de abril de 1964" + "\r\n"
					+ "Características: Totalmente transistorizado com capacidade de memória de 32K bytes." + "\r\n"
					+ "A memória era construída com toros de ferrite (óxido de ferro). É o primeiro computador IBM a utilizar 8 bit para codificação de caracteres"
					+ "\r\n"
					+ "e a palavra byte assume então o significado que ainda hoje tem. Com 8 bits era possível codificar 256 estados diferentes"
					+ "\r\n"
					+ "o que era suficiente para a codificação dos 10 algarismos, 52 letras (maiúsculas e minúscula) do alfabeto anglo-saxónico,"
					+ "\r\n"
					+ "o espaço, 27 símbolos e 166 caracteres especiais (incluíam-se símbolos matemáticos e gráficos)."
					+ "\r\n"
					+ "É o primeiro computador IBM que podia ser comandado a partir da digitação de caracteres numa máquina de escrever (Selectric typewriter console), visível na fotografia.",
			" - IBM 650" + "\r\n" + "Fabricação: Publicamente em dezembro de 1954 pela IBM" + "\r\n"
					+ "Características: As dimensões da CPU eram 1,5 m X 0,9 m X 1,8 m e a sua massa era de 892 Kg."
					+ "\r\n" + "As dimensões da unidade de alimentação eram idênticas, mas a sua massa era de 1.348 Kg."
					+ "\r\n"
					+ "O sistema necessitava de uma potência eléctrica instalada de 22 KVA. O IBM 650 dispunha de uma memória de tambor organizada em palavras de dez digitos decimais com sinal."
					+ "\r\n"
					+ "A memória base tinha uma capacidade de 2.000 palavras mas podiam chegar até 10.000 palavras."
					+ "\r\n"
					+ "O tambor dispunha de 200 cabeças de leitura/escrita em que cada conjunto de 5 cabeças lia ou escrevia 50 palavras."
					+ "\r\n"
					+ "No IBM 650 uma adição ou subtração era executada em 1,63 ms (milisegundos), uma multiplicação executava-se em 12,96 ms e uma divisão executava-se em 16,9 ms."
					+ "\r\n" + "O tempo de acesso aleatório no tambor magnético era de 2,496 ms.",
			" - Colossus" + "\r\n"
					+ "Foi um computador inglês projetado em Bletchley Park durante a Segunda Guerra Mundial pela equipe liderada por Alan Turing."
					+ "\r\n"
					+ "Seu principal objetivo era fazer a criptoanálise de códigos ultra-secretos utilizados pelos nazistas, criados com a máquina."
					+ "\r\n"
					+ "Lorenz SZ 40/42.Utilizando símbolos perfurados em fitas de papel, o equipamento processava a uma velocidade de 25 mil caracteres por segundo"
					+ "\r\n" + "e sua missão era quebrar códigos alemães ultrassecretos.",
			" - IBM 7030 (Stretch)" + "\r\n"
					+ "Fabricação: 1961, Laboratório Nacional de Los Alamos (Los Alamos, Novo México, EUA)" + "\r\n"
					+ "Características: Também conhecido como Stretch, como o primeiro supercomputador transistorizado, originalmente com o preço de US$ 13,5 milhões,"
					+ "\r\n"
					+ "executando até 1 milhão de operações por segundo. A memória principal era de 16K à 256K. Apesar do IBM 7030 não ter feito o sucesso esperado,"
					+ "\r\n"
					+ "serviu de base para futuros projetos de grande sucesso. Várias linguagens foram desenvolvidas para os computadores de segunda geração,"
					+ "\r\n"
					+ "como Fortran, Cobol e Algol. Assim, softwares já poderiam ser criados com mais facilidade.",
			" - IBM 7094" + "\r\n" + "Fabricação: meados de 1964 e 1968" + "\r\n"
					+ "Características: Um dos primeiros computadores que utilizaram-se totalmente de transistores , vendeu mais de 10.000 unidades,"
					+ "\r\n"
					+ "demonstrando mais uma vez a real necessidade da criação da indústria mundial de computadores."
					+ "\r\n"
					+ "Apresentava excelente relação preço X desempenho. Usava o sistema de programação, FORTRAN, que reduziu significativamente tempo execução para os utilizadores."
					+ "\r\n"
					+ "Em Outubro 1961 introduziu o IBM 7340 Hypertape Drive e o IBM 7640 Hypertape Control Unit, unidades de armazenamento de fita magnética."
					+ "\r\n"
					+ "O 7094 tinha como características uma velocidade de relógio de 500KHz, um memória de núcleo de 32K com palavras de 36 bits,"
					+ "\r\n"
					+ "O lançamento do 7090 e do 7094 marcou o fim das máquinas baseadas em válvulas e o início da hegemonia da IBM nos sistemas de computação científica durante a década de 1960.",
			" - LEO Computer  Lyons Eletronic Office" + "\r\n" + "Criação: Reino Unido, 1954 (Inspirado no EDSAC)."
					+ "\r\n"
					+ "Características: Feito para suprir das necessidades de automatização de trabalho em escritório."
					+ "\r\n"
					+ "Considerado o primeiro computador comercial do mundo, onde tal decisão partiu da J. Lyons,"
					+ "\r\n"
					+ "empresa de casas de chá de grande sucesso, com mais de mil funcionários. A empresa era conhecida por inovações. O LEO foi fruto de uma parceria entre a J. Lyons e a Universidade de Cambridge,"
					+ "\r\n"
					+ " tornando operacional no dia 9 de fevereiro de 1954, quando calculou a folha de pagamento de 1700 funcionários.",
			" - PDP-8" + "\r\n" + "Criação: 22 de março de 1965" + "\r\n"
					+ "Características: lançado pela empresa americana DEC - Digital Equipament Corporation, o primeiro considerado o primeiro minicomputador."
					+ "\r\n" + "vendeu mais de 50.000 sistemas, mais do que qualquer computador até essa data." + "\r\n"
					+ "Foi o primeiro computador amplamente vendido das séries de computadores da DEC (o PDP-5 não foi originalmente destinados a ser um computador de uso geral)."
					+ "\r\n"
					+ "O  modelo mais antigo PDP-8 (conhecido informalmente como Straight-8), usava diodos Diode-transistor logic,"
					+ "\r\n"
					+ "embalados em placas Flip Chip, e era do tamanho de um frigobar. O PDP-8 combinava baixo custo, simplicidade, capacidade de expansão e engenharia cuidadosa pelo valor pago."
					+ "\r\n"
					+ "A maior importância histórica é que o baixo custo e alto volume de vendas do PDP-8 fizeram ele um computador disponível para muitos usos novos e pessoas."
					+ "\r\n"
					+ "Seu significado contínuo é um exemplo histórico do valor da engenharia em um projeto de computador.",
			" - Transistor" + "\r\n" + "Criação: meados de 1948" + "\r\n"
					+ "Características: O termo provém de transfer resistor (resistor/resistência de transferência), como era conhecido pelos seus inventores."
					+ "\r\n"
					+ "Marcou o início da segunda geração de computadores, substituindo as válvulas, economizando espaço e consumo de energia elétrica."
					+ "\r\n"
					+ "Computadores transistorizados ocuparam o mercado entre 1950 e 1960. Apesar de terem vários componentes reduzidos ante os computadores com válvulas,"
					+ "\r\n" + "os computadores transistorizados continuavam grande e pesados.",
			" - UNIVAC  Universal Automatic Computer" + "\r\n"
					+ "Criação: primeiro exemplar entregue em 31 de março de 1951" + "\r\n"
					+ "Características: Considerado o primeiro computador comercial fabricado e comercializado nos Estados Uni-dos."
					+ "\r\n"
					+ "Era programado ajustando-se cerca de 6.000 chaves e conectando-se cabos a um painel. Projetado por J. Presper Eckert e John Mauchly,"
					+ "\r\n"
					+ "os inventores do ENIAC para uma empresa fundada por ambos, a Eckert-Mauchly Computer Corporation,"
					+ "\r\n" + "mas só ficou pronto após esta ser adquirida pela Remington e virar a divisão UNIVAC."
					+ "\r\n"
					+ "Companhias de peso eram seus principais donos como a General Electric a US Steel e a Metropolitan Life Insurance."
					+ "\r\n"
					+ "Projetado para custar US$159,000, o UNIVAC I foi vendido por um preço entre US$1,250,000 e $1,500,000."
					+ "\r\n"
					+ "No total, 46 unidades deste primeiro modelo foram fabricadas. Algumas unida-des estiveram em serviço por muitos anos."
					+ "\r\n"
					+ "A primeira unidade funcionou até 1963. Duas unidades da pró-pria Remington funcionaram até 1968 e outra unidade, de uma companhia de seguros do Tennessee, até 1970, com mais de treze anos de serviço."
					+ "\r\n"
					+ "Foi um dos primeiros computadores do Brasil, adquirido pelo IBGE em 1961 por US$ 2.976.350,00, incluídos acessórios e periféricos, para processar dados do censo.",
			" - Válvula" + "\r\n" + "Criação: Baseado na Lâmpada elétrica de Tomaz Edison de 1879." + "\r\n"
					+ "Características: Marcou o início da Era Eletrônica,  A partir das válvulas surgiram o rádio, a televisão e os computadores."
					+ "\r\n"
					+ "O ENIAC ( Electronic Numerical Integrator And Computer), o pai de todos os computadores, possuía 17.468 válvulas (além de 6.000 chaves manuais, através das quais ele era programado)"
					+ "\r\n"
					+ "e media cerca de 50 metros.. Às conhecidas desvantagens das válvulas (tamanho, consumo de energia etc.), logo juntou-se sua incapacidade de lidar com altas freqüências."
					+ "\r\n"
					+ "Marcou o início da primeira geração de computadores, juntamente aos circuitos eletrônicos, relés, capacitores entre outros.",
			" - Intel 4004" + "\r\n" + "Fabricação: pela Intel Corporation em 1971." + "\r\n"
					+ "Características: CPU de 4-bits, projetada inicialmente para calculadoras," + "\r\n"
					+ "servindo como passo inicial para a fabricação de melhores processadores" + "\r\n"
					+ "que criaram os então grandiosos processadores atuais." };

	private int ultimoBotaoClicado = -1;
	private int quantBotoesClicados = 0;
	private int bonus = 0;

	public TelaNivelAntigo() {
		initialize();
		janela2.setTitle("Speicehr - Jogo da Memoria");
		janela2.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/view/Imagens/icone.png")));
		janela2.setLocationRelativeTo(null);
		janela2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
	}

	public void initialize() {

		painelCabecalho.add(regra);
		painelCabecalho.add(pont);
		pont.setEditable(false);
		painelFiguras.setLayout(new GridLayout(5, 5, 3, 3));

		janela2 = new JFrame("Nivel 2");
		janela2.setLayout(new BorderLayout());
		janela2.add("North", painelCabecalho);
		janela2.add("Center", painelFiguras);

		janela2.setTitle("Memoranimal");
		janela2.setSize(790, 730);
		janela2.setLocation(470, 10);
		janela2.setResizable(false);
		menu.add(Novo);
		Novo.addActionListener(this);
		barra.add(menu);
		janela2.setJMenuBar(barra);

		montaTela();
	}

	private void montaTela() {

		for (int i = 0; i < Botoes.length; i++) {
			painelFiguras.add(Botoes[i]);
			Botoes[i].addActionListener(this);
		}
	}

	public void iniciar() {
		bonus = 0;
		pont.setText("" + bonus);
		ultimoBotaoClicado = -1;
		quantBotoesClicados = 0;

		embaralhaExibeTodos();

		Action acao = new AbstractAction() {

			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				escondeTodos();
			}
		};

		Timer t = new Timer(8000, acao);
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

				for (int j = 0; j < 15; j++) {
					if (imagens[i] == imagensFixas[j]) {
						JOptionPane.showMessageDialog(null, informacoes[j], "Informacoes sobre o objeto encontrado.",
								JOptionPane.INFORMATION_MESSAGE, imagensFixas[j]);
						break;
					}
				}

				if (quantBotoesClicados == 30) {
					int resposta = JOptionPane.showConfirmDialog(null,
							"FIM DE JOGO! \nVOCE FEZ " + bonus + " JOGADAS\nRepetir?", "Speicehr - Jogo da Memoria",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (resposta == JOptionPane.YES_OPTION) {
						iniciar();
					} else {
						janela2.setVisible(false);
					}
				}
			} else {

				exibe(i);

				Action acao = new AbstractAction() {

					private static final long serialVersionUID = 1L;

					public void actionPerformed(ActionEvent e) {
						esconde(ultimoBotaoClicado);
						esconde(i);
						ultimoBotaoClicado = -1;
						bonus += 1;
						pont.setText("" + bonus);
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