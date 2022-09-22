package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Calculos {

	private JFrame frame;
	private JTextField textField;
	
	double soma;
	double menos;
	double resultado;
	String operacao;
	String resposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculos window = new Calculos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 310, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBackground(new Color(39, 105, 51));
		textField.setBounds(10, 11, 272, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton tec6 = new JButton("6");
		tec6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec6.getText();
				textField.setText(number);
			}
		});
		tec6.setBounds(68, 115, 48, 31);
		frame.getContentPane().add(tec6);
		
		JButton tec1 = new JButton("1");
		tec1.setForeground(new Color(64, 0, 64));
		tec1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec1.getText();
				textField.setText(number);
			}
		});
		tec1.setBounds(68, 73, 48, 31);
		frame.getContentPane().add(tec1);
		
		JButton tec4 = new JButton("4");
		tec4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec4.getText();
				textField.setText(number);
			}
		});
		tec4.setBounds(234, 73, 48, 31);
		frame.getContentPane().add(tec4);
		
		JButton tec2 = new JButton("2");
		tec2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec2.getText();
				textField.setText(number);
			}
		});
		tec2.setBounds(125, 73, 48, 31);
		frame.getContentPane().add(tec2);
		
		JButton tec7 = new JButton("7");
		tec7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec7.getText();
				textField.setText(number);
			}
		});
		tec7.setBounds(126, 115, 48, 31);
		frame.getContentPane().add(tec7);
		
		JButton tec8 = new JButton("8");
		tec8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec8.getText();
				textField.setText(number);
			}
		});
		tec8.setBounds(184, 115, 48, 31);
		frame.getContentPane().add(tec8);
		
		JButton tec0 = new JButton("0");
		tec0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec0.getText();
				textField.setText(number);
			}
		});
		tec0.setBounds(10, 73, 48, 31);
		frame.getContentPane().add(tec0);
		
		JButton del = new JButton("apagar");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		del.setBounds(184, 199, 98, 31);
		frame.getContentPane().add(del);
		
		JButton tec5 = new JButton("5");
		tec5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec5.getText();
				textField.setText(number);
			}
		});
		tec5.setBounds(10, 115, 48, 31);
		frame.getContentPane().add(tec5);
		
		JButton tec9 = new JButton("9");
		tec9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec9.getText();
				textField.setText(number);
			}
		});
		tec9.setBounds(234, 115, 48, 31);
		frame.getContentPane().add(tec9);
		
		JButton tec10 = new JButton("10");
		tec10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec10.getText();
				textField.setText(number);
			}
		});
		tec10.setBounds(10, 157, 48, 31);
		frame.getContentPane().add(tec10);
		
		JButton tecporcen = new JButton("%");
		tecporcen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma=Double.parseDouble(textField.getText());
				textField.setText("");
				operacao="%";
			}
		});
		tecporcen.setBounds(68, 157, 48, 31);
		frame.getContentPane().add(tecporcen);
		
		JButton afas = new JButton("\uF0E7");
		afas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String afas=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					afas=str.toString();
					textField.setText(afas);
				}
			}
		});
		afas.setFont(new Font("Wingdings", Font.BOLD, 18));
		afas.setBounds(78, 245, 141, 34);
		frame.getContentPane().add(afas);
		
		JButton tecmais = new JButton("+");
		tecmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma=Double.parseDouble(textField.getText());
				textField.setText("-");
				operacao="-";
			}
		});
		tecmais.setBounds(125, 157, 48, 31);
		frame.getContentPane().add(tecmais);
		
		JButton tecponto = new JButton(".");
		tecponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tecponto.getText();
				textField.setText(number);
				
			}
		});
		tecponto.setBounds(10, 199, 48, 31);
		frame.getContentPane().add(tecponto);
		
		JButton tecmenos = new JButton("-");
		tecmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma=Double.parseDouble(textField.getText());
				textField.setText("+");
				operacao="+";
			}
		});
		tecmenos.setBounds(184, 157, 48, 31);
		frame.getContentPane().add(tecmenos);
		
		JButton tecigual = new JButton("=");
		tecigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resposta;
				menos=Double.parseDouble(textField.getText());
				
				if(operacao=="+")
				{
					resultado=soma+menos;
					resposta=String.format("%.2f", resultado);
					textField.setText(resposta);
					}
				else if(operacao=="-");
				{
					resultado=soma-menos;
					resposta=String.format("%.2f", resultado);
					textField.setText(resposta);
					}
				 if(operacao=="*")
				{
					resultado=soma*menos;
					resposta=String.format("%.2f", resultado);
					textField.setText(resposta);
					}
				else if(operacao=="/")
				{
					resultado=soma/menos;
					resposta=String.format("%.2f", resultado);
					textField.setText(resposta);
					}
				
			}
		});
		tecigual.setBounds(125, 199, 48, 31);
		frame.getContentPane().add(tecigual);
		
		JButton tec3 = new JButton("3");
		tec3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+tec3.getText();
				textField.setText(number);
			}
		});
		tec3.setBounds(183, 73, 48, 31);
		frame.getContentPane().add(tec3);
		
		JButton tecdivisao = new JButton("/");
		tecdivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma=Double.parseDouble(textField.getText());
				textField.setText("");
				operacao="/";
			}
		});
		tecdivisao.setBounds(68, 199, 48, 31);
		frame.getContentPane().add(tecdivisao);
		
		JButton tecvezes = new JButton("*");
		tecvezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma=Double.parseDouble(textField.getText());
				textField.setText("");
				operacao="*";
				
			}
		});
		tecvezes.setBounds(234, 157, 48, 31);
		frame.getContentPane().add(tecvezes);
	}
}
