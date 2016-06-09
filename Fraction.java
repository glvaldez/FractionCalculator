package GUI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fraction {
	private int wholeNum;
	private int numerator;
	private int denom;

	public Fraction(int wholenum, int n, int d) {
		this.wholeNum = wholenum;
		this.numerator = n;
		this.denom = d;
	}

	public Fraction() {
		this.wholeNum = 0;
		this.numerator = 0;
		this.denom = 0;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	public int getWholeNum() {
		return wholeNum;
	}

	public void setWholeNum(int wholeNum) {
		this.wholeNum = wholeNum;
	}

	public void stringToFraction(String w, String n, String d) {
		try {

			if ((w.length() == 0 || w == "0")) {
				this.wholeNum = 0;
				this.numerator = Integer.parseInt(n);
				this.denom = Integer.parseInt(d);
			} else {
				this.wholeNum = Integer.parseInt(w);
				this.numerator = Integer.parseInt(n);
				this.denom = Integer.parseInt(d);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static boolean checkErrors(String w, String n, String d, String operation) {

		if (n.length() == 0 || d.length() == 0) {
			GUIFrame.Console.setText(Messages.NUM_DEN);
			return true;
		} else if ((isInt(w) == false) || (isInt(n) == false) || (isInt(d) == false)) {
			GUIFrame.Console.setText(Messages.ENTER_INTEGER);
			return true;
		} else {
			GUIFrame.Console.setText("");
			return false;
		}

	}

	public static boolean isInt(String s) {
		try {
			if (s.length() == 0) {
				s = "0";
			}
			int i = Integer.parseInt(s);
			return true;
		}

		catch (NumberFormatException er) {
			return false;
		}
	}

}
