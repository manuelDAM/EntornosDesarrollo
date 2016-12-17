import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Calculadora extends JFrame {
//declaro la ventana, cuadro de texto, botones, numeros y string operacion para comparar.
	private JPanel contentPane;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn6;
	private JButton btn5;
	private JButton btn2;
	private JButton btn1;
	private JButton btn3;
	private JButton btn0;
	private JButton btnsuma;
	private JButton btnresta;
	private JButton btnmulti;
	private JButton btnpunto;
	private JButton btnigual;
	private JButton btnsalir;
	private JButton btndiv;
	private JButton btnborrar;
	double num1;
	double num2;
	double resul;
	String operacion;
	
//iniciamo la ventana
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * valores de la ventana
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 481); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 105, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField(); // donde visualizamos los numeros y resultados
		textField.setFont(new Font("Hobo Std", Font.PLAIN, 40));
		textField.setForeground(new Color(0, 0, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT); // campo donde coloco los números dentro del textField
		textField.setBounds(12, 13, 296, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		//empiezo con los botones
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn7.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn7.setForeground(Color.BLUE);
		btn7.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn7.setBounds(12, 88, 66, 54);
		contentPane.add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn4.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn4.setForeground(Color.BLUE);
		btn4.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn4.setBounds(12, 155, 66, 54);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn5.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn5.setForeground(Color.BLUE);
		btn5.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn5.setBounds(90, 155, 66, 54);
		contentPane.add(btn5);
		
		btnsuma = new JButton("+");
		btnsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "+";
			}
		});
		btnsuma.setForeground(Color.BLUE);
		btnsuma.setFont(new Font("Hobo Std", Font.PLAIN, 40));
		btnsuma.setBounds(242, 88, 66, 54);
		contentPane.add(btnsuma);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn6.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn6.setForeground(Color.BLUE);
		btn6.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn6.setBounds(169, 155, 66, 54);
		contentPane.add(btn6);
		
		btnmulti = new JButton("*");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "*";
			}
		});
		btnmulti.setForeground(Color.BLUE);
		btnmulti.setFont(new Font("Hobo Std", Font.PLAIN, 40));
		btnmulti.setBounds(242, 222, 66, 54);
		contentPane.add(btnmulti);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn0.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn0.setForeground(Color.BLUE);
		btn0.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn0.setBounds(12, 289, 66, 54);
		contentPane.add(btn0);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn2.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn2.setForeground(Color.BLUE);
		btn2.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn2.setBounds(90, 222, 66, 54);
		contentPane.add(btn2);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn9.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn9.setForeground(Color.BLUE);
		btn9.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn9.setBounds(168, 88, 66, 54);
		contentPane.add(btn9);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn3.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn3.setForeground(Color.BLUE);
		btn3.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn3.setBounds(169, 222, 66, 54);
		contentPane.add(btn3);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn8.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setForeground(Color.BLUE);
		btn8.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn8.setBounds(90, 88, 66, 54);
		contentPane.add(btn8);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IntroduceNum = textField.getText() + btn1.getText();
				textField.setText(IntroduceNum);
			}
		});
		btn1.setForeground(Color.BLUE);
		btn1.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btn1.setBounds(12, 222, 66, 54);
		contentPane.add(btn1);
		
		btnresta = new JButton("-");
		btnresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "-";
			}
		});
		btnresta.setForeground(Color.BLUE);
		btnresta.setFont(new Font("Hobo Std", Font.PLAIN, 40));
		btnresta.setBounds(242, 155, 66, 54);
		contentPane.add(btnresta);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "/";
			}
		});
		btndiv.setForeground(Color.BLUE);
		btndiv.setFont(new Font("Hobo Std", Font.PLAIN, 40));
		btndiv.setBounds(242, 289, 66, 54);
		contentPane.add(btndiv);
		
		btnborrar = new JButton("C");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnborrar.setForeground(Color.BLUE);
		btnborrar.setFont(new Font("Hobo Std", Font.PLAIN, 40));
		btnborrar.setBounds(169, 289, 66, 54);
		contentPane.add(btnborrar);
		
		
		btnpunto = new JButton("BIN");
		btnpunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "bin";
				String binario = "";
		        if (num1 > 0) {
		            while (num1 > 0) {
		                if (num1 % 2 == 0) {
		                    binario = "0" + binario;
		                } else {
		                    binario = "1" + binario;
		                }
		                num1 = (int) num1 / 2;
		            }
		        } 
		        textField.setText(binario);
		  
		
			}
			
		});
		btnpunto.setForeground(Color.BLUE);
		btnpunto.setFont(new Font("Hobo Std", Font.PLAIN, 18));
		btnpunto.setBounds(90, 289, 66, 54);
		contentPane.add(btnpunto);
			
		btnsalir = new JButton("SALIR");
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnsalir.setForeground(Color.BLUE);
		btnsalir.setFont(new Font("Hobo Std", Font.PLAIN, 22));
		btnsalir.setBounds(12, 367, 183, 54);
		contentPane.add(btnsalir);
		
		btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String respuesta;
				num2 = Double.parseDouble(textField.getText());
				if (operacion =="+"){
					resul= num1 + num2;
					respuesta = String.format("%.1f", resul);
					textField.setText(respuesta);
				}
				else if (operacion =="-"){
					resul= num1 - num2;
					respuesta = String.format("%.1f", resul);
					textField.setText(respuesta);
				}
				else if (operacion =="*"){
					resul= num1 * num2;
					respuesta = String.format("%.1f", resul);
					textField.setText(respuesta);
				}
				else if (operacion =="/"){
					resul= num1 / num2;
					respuesta = String.format("%.1f", resul);
					textField.setText(respuesta);
				}
			
				
			}
		});
		btnigual.setForeground(Color.BLUE);
		btnigual.setFont(new Font("Hobo Std", Font.PLAIN, 40));
		btnigual.setBounds(207, 367, 101, 54);
		contentPane.add(btnigual);
		
		JLabel Hecho_Por = new JLabel("MGimenez");
		Hecho_Por.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Hecho_Por.setBounds(253, 422, 55, 16);
		contentPane.add(Hecho_Por);


	}
}
