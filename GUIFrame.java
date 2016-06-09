package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class GUIFrame extends JFrame {
	
	//Improper or proper form in which answer is displayed
	public int mode = 1;
	
	private JPanel contentPane;
	private JTextField wholeOne;
	private JTextField numOne;
	private JTextField denOne;
	private JTextField wholeTwo;
	private JTextField numTwo;
	private JTextField denTwo;
	private JTextField wholeAnswer;
	private JTextField numAnswer;
	private JTextField denAnswer;	
	
	private JLabel lblResult = new JLabel("=");
	private JLabel FractionLine1 = new JLabel("_________");
	private JLabel FractionLine2 = new JLabel("_________");
	private JLabel FractionLine3 = new JLabel("__________");

	
	public static boolean isNeg1 = false;
	public static boolean isNeg2 = false;
	
	private JButton divideButton = new JButton("\u00F7");
	private JButton plusButton = new JButton("+");
	private JButton subtractButton = new JButton("-");
	private JButton multiplyButton = new JButton("X");
	private JButton makeProper = new JButton("Make Proper");
	private JButton improperButton = new JButton("Make Improper");

	private JRadioButton Negative1 = new JRadioButton("Negative");
	private JRadioButton Negative2 = new JRadioButton("Negative");

	public static JTextField Console;

	public static void main(String[] args) {
		Fraction Fract1 = new Fraction();
		Fraction Fract2 = new Fraction();
		
		Operations Fract3 = new Operations(Fract1,Fract2);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIFrame frame = new GUIFrame();
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
	public GUIFrame() {
		setTitle("Fraction Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Fraction Fract1 = new Fraction();
		Fraction Fract2 = new Fraction();	
		Operations Fract3 = new Operations(Fract1,Fract2);	
		
//////////////////////////Text Fields///////////////////////////////////////////

		
		wholeOne = new JTextField();
		wholeOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		wholeOne.setBounds(8, 51, 60, 40);
		contentPane.add(wholeOne);
		wholeOne.setColumns(10);
		wholeOne.setHorizontalAlignment(SwingConstants.CENTER);
		
		numOne = new JTextField();
		numOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numOne.setBounds(78, 11, 60, 35);
		contentPane.add(numOne);
		numOne.setColumns(10);
		numOne.setHorizontalAlignment(SwingConstants.CENTER);

		
		denOne = new JTextField();
		denOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		denOne.setColumns(10);
		denOne.setBounds(78, 83, 60, 35);
		contentPane.add(denOne);
		denOne.setHorizontalAlignment(SwingConstants.CENTER);

		
		wholeTwo = new JTextField();
		wholeTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		wholeTwo.setColumns(10);
		wholeTwo.setBounds(235, 51, 60, 40);
		contentPane.add(wholeTwo);
		wholeTwo.setHorizontalAlignment(SwingConstants.CENTER);

		
		numTwo = new JTextField();
		numTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numTwo.setColumns(10);
		numTwo.setBounds(305, 8, 60, 40);
		contentPane.add(numTwo);
		numTwo.setHorizontalAlignment(SwingConstants.CENTER);

		
		denTwo = new JTextField();
		denTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		denTwo.setColumns(10);
		denTwo.setBounds(305, 80, 60, 40);
		contentPane.add(denTwo);
		denTwo.setHorizontalAlignment(SwingConstants.CENTER);

		
		wholeAnswer = new JTextField();
		wholeAnswer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		wholeAnswer.setColumns(10);
		wholeAnswer.setBounds(415, 51, 60, 40);
		contentPane.add(wholeAnswer);
		wholeAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		
		numAnswer = new JTextField();
		numAnswer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		numAnswer.setColumns(10);
		numAnswer.setBounds(499, 8, 60, 40);
		contentPane.add(numAnswer);
		numAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		
		denAnswer = new JTextField();
		denAnswer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		denAnswer.setColumns(10);
		denAnswer.setBounds(499, 80, 60, 40);
		contentPane.add(denAnswer);
		denAnswer.setHorizontalAlignment(SwingConstants.CENTER);

//////////////////////////Labels///////////////////////////////////////////
			
		lblResult.setFont(new Font("Dialog", Font.BOLD, 40));
		lblResult.setBounds(382, 55, 23, 27);
		contentPane.add(lblResult);
		
		FractionLine1.setFont(new Font("Tahoma", Font.BOLD, 11));
		FractionLine1.setBounds(78, 51, 70, 14);
		contentPane.add(FractionLine1);
		
		FractionLine2.setFont(new Font("Tahoma", Font.BOLD, 11));
		FractionLine2.setBounds(305, 51, 67, 14);
		contentPane.add(FractionLine2);
		
		FractionLine3.setBounds(499, 51, 70, 14);
		contentPane.add(FractionLine3);
		
		Console = new JTextField();
		Console.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Console.setBounds(8, 164, 364, 60);
		contentPane.add(Console);
		Console.setColumns(10);
	
//////////////////////////Buttons///////////////////////////////////////////
		
		plusButton.setBounds(165, 17, 46, 23);
		contentPane.add(plusButton);
		
		subtractButton.setBounds(165, 47, 46, 23);
		contentPane.add(subtractButton);
		
		multiplyButton.setBounds(165, 78, 46, 23);
		contentPane.add(multiplyButton);
		
		divideButton.setBounds(165, 110, 46, 23);
		contentPane.add(divideButton);
		
		makeProper.setBounds(402, 142, 143, 23);
		contentPane.add(makeProper);
		
		improperButton.setBounds(402, 164, 143, 23);
		contentPane.add(improperButton);
		
		Negative1.setBounds(29, 125, 109, 23);
		contentPane.add(Negative1);	
		
		Negative2.setBounds(252, 127, 109, 23);
		contentPane.add(Negative2);
		
//////////////////////////Add,Subtract, Multiply, Divide Buttons///////////////////////////////////////////

		
//Add		
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(Fraction.checkErrors(wholeOne.getText(), numOne.getText(), denOne.getText(), "+")==false&&Fraction.checkErrors(wholeTwo.getText(), numTwo.getText(), denTwo.getText(),"+")==false){
					Fract1.stringToFraction(wholeOne.getText(), numOne.getText(), denOne.getText());
					Fract2.stringToFraction(wholeTwo.getText(), numTwo.getText(), denTwo.getText());
					Fract3.add();
					
					if (mode == 1){
					wholeAnswer.setText("");
					denAnswer.setText(Integer.toString(Fract3.getDenom()));
					numAnswer.setText(Integer.toString(Fract3.getImproperNum()));				
					}					
					else {
						denAnswer.setText(Integer.toString(Fract3.getDenom()));
						numAnswer.setText(Integer.toString((Fract3.getNumerator() %   Fract3.getDenom()) ));
						wholeAnswer.setText(Integer.toString(Fract3.getWholeNum()));
					}						
				}
				else if(Fraction.checkErrors(wholeOne.getText(), numOne.getText(), denOne.getText(),"+")==true||Fraction.checkErrors(wholeTwo.getText(), numTwo.getText(), denTwo.getText(),"+")==true){
					wholeOne.setText("");
					numOne.setText("");
					denOne.setText("");
					wholeTwo.setText("");
					numTwo.setText("");
					denTwo.setText("");
				}
			}
		});

//Subtract		
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fraction.checkErrors(wholeOne.getText(), numOne.getText(), denOne.getText(),"-")==false&&Fraction.checkErrors(wholeTwo.getText(), numTwo.getText(), denTwo.getText(),"-")==false){

				Fract1.stringToFraction(wholeOne.getText(), numOne.getText(), denOne.getText());
				Fract2.stringToFraction(wholeTwo.getText(), numTwo.getText(), denTwo.getText());
				Fract3.subtract();
				
				if (mode == 1){
				wholeAnswer.setText("");
				denAnswer.setText(Integer.toString(Fract3.getDenom()));
				numAnswer.setText(Integer.toString(Fract3.getImproperNum()));				
				}				
				else {
					denAnswer.setText(Integer.toString(Fract3.getDenom()));
					numAnswer.setText(Integer.toString((Fract3.getNumerator() %   Fract3.getDenom()) ));
					wholeAnswer.setText(Integer.toString(Fract3.getWholeNum()));					
				}
				}
				else if(Fraction.checkErrors(wholeOne.getText(), numOne.getText(), denOne.getText(),"-")==true||Fraction.checkErrors(wholeTwo.getText(), numTwo.getText(), denTwo.getText(),"-")==true){
					wholeOne.setText("");
					numOne.setText("");
					denOne.setText("");
					wholeTwo.setText("");
					numTwo.setText("");
					denTwo.setText("");
				}
			}				
		});
		
//Multiply	
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fraction.checkErrors(wholeOne.getText(), numOne.getText(), denOne.getText(),"x")==false&&Fraction.checkErrors(wholeTwo.getText(), numTwo.getText(), denTwo.getText(),"x")==false){
				Fract1.stringToFraction(wholeOne.getText(), numOne.getText(), denOne.getText());
				Fract2.stringToFraction(wholeTwo.getText(), numTwo.getText(), denTwo.getText());
				Fract3.multiply();
				
				if (mode == 1){
				wholeAnswer.setText("");
				denAnswer.setText(Integer.toString(Fract3.getDenom()));
				numAnswer.setText(Integer.toString(Fract3.getImproperNum()));				
				}				
				else {
					denAnswer.setText(Integer.toString(Fract3.getDenom()));
					numAnswer.setText(Integer.toString((Fract3.getNumerator() %   Fract3.getDenom()) ));
					wholeAnswer.setText(Integer.toString(Fract3.getWholeNum()));					
				}}
				else if(Fraction.checkErrors(wholeOne.getText(), numOne.getText(), denOne.getText(),"x")==true||Fraction.checkErrors(wholeTwo.getText(), numTwo.getText(), denTwo.getText(),"x")==true){
					wholeOne.setText("");
					numOne.setText("");
					denOne.setText("");
					wholeTwo.setText("");
					numTwo.setText("");
					denTwo.setText("");
				}
			}
		});
		
//Divide		
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Fraction.checkErrors(wholeOne.getText(), numOne.getText(), denOne.getText(),"/")==false&&Fraction.checkErrors(wholeTwo.getText(), numTwo.getText(), denTwo.getText(),"/")==false){
					Fract1.stringToFraction(wholeOne.getText(), numOne.getText(), denOne.getText());
					Fract2.stringToFraction(wholeTwo.getText(), numTwo.getText(), denTwo.getText());
					Fract3.divide();

					if (mode == 1){
					wholeAnswer.setText("");
					denAnswer.setText(Integer.toString(Fract3.getDenom()));
					numAnswer.setText(Integer.toString(Fract3.getImproperNum()));				
				}				
				else {
					denAnswer.setText(Integer.toString(Fract3.getDenom()));
					numAnswer.setText(Integer.toString((Fract3.getNumerator() %   Fract3.getDenom()) ));
					wholeAnswer.setText(Integer.toString(Fract3.getWholeNum()));					
				}
				}	
				else if(Fraction.checkErrors(wholeOne.getText(), numOne.getText(), denOne.getText(),"/")==true||Fraction.checkErrors(wholeTwo.getText(), numTwo.getText(), denTwo.getText(),"/")==true){
					wholeOne.setText("");
					numOne.setText("");
					denOne.setText("");
					wholeTwo.setText("");
					numTwo.setText("");
					denTwo.setText("");
				}
			}
		});
//////////////////////////Make Proper and Improper Buttons///////////////////////////////////////////
//setting the text boxes to fraction 3's whole number, numerator, and denominator
		
		makeProper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wholeAnswer.setText(Integer.toString(Fract3.getWholeNum()));				
				numAnswer.setText(Integer.toString(Fract3.getNumerator()));
				denAnswer.setText(Integer.toString(Fract3.getDenom()));
				mode = 0;
			}
		});

		improperButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				wholeAnswer.setText("");
				numAnswer.setText(Integer.toString(Fract3.getImproperNum()));
				denAnswer.setText(Integer.toString(Fract3.getDenom()));
				mode = 1;
			}
		});
//////////////////////////Negative Radio Buttons///////////////////////////////////////////
		
		Negative1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(isNeg1==false){
				isNeg1 = true;
			}
			else if(isNeg1==true){
				isNeg1 = false;
			}
			}
		});
	
		Negative2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isNeg2==false){
					isNeg2 = true;
				}
				else if(isNeg2==true){
					isNeg2 = false;
				}
			}
		});						
	}
}
