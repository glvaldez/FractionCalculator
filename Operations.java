package GUI;

public class Operations extends Fraction {

	public Fraction F1;
	public Fraction F2;
	public int improperNum;
	public String operation;

	public Operations(int w, int n, int d) {
		super(w, n, d);
	}

	public Operations(Fraction f1, Fraction f2) {
		this.F1 = f1;
		this.F2 = f2;
		this.operation = null;

	}

	public int calculateNumWithWhole(int w, int n, int d) {
		int numerator = w * d + n;
		return numerator;
	}

	public int calculateLCD(Fraction f1, Fraction f2) {

		int f1Denom = Math.abs(f1.getDenom());
		int f2Denom = Math.abs(f2.getDenom());
		int counter1 = 1;
		int counter2 = 1;

		while (f1Denom != f2Denom) {
			if (f1Denom > f2Denom) {
				counter2++;
				f2Denom *= counter2;

			} else {
				counter1++;
				f1Denom += counter1;
			}
		}

		return f1Denom;
	}
	
//Adding
	
	public void add(){
		int impF1Num;
		int impF2Num;
		int LCD = calculateLCD(F1, F2);
		impF1Num = calculateNumWithWhole(Math.abs(F1.getWholeNum()), Math.abs(F1.getNumerator()),
				Math.abs(F1.getDenom()));
		impF1Num = LCD / Math.abs(F1.getDenom()) * impF1Num;
		impF2Num = calculateNumWithWhole(Math.abs(F2.getWholeNum()), Math.abs(F2.getNumerator()),
				Math.abs(F2.getDenom()));
		impF2Num = LCD / Math.abs(F2.getDenom()) * impF2Num;
		//If fraction is negative, then multiply the numerator by -1
		if (GUIFrame.isNeg1 == true) {
			impF1Num *= -1;

		}

		if (GUIFrame.isNeg2 == true)
			impF2Num *= -1;
		setImproperNum(impF1Num + impF2Num);
		super.setWholeNum(this.improperNum / LCD);
		super.setDenom(LCD);
		if (super.getWholeNum() != 0)
			super.setNumerator(Math.abs(this.improperNum % LCD));

		else
			super.setNumerator(this.improperNum % LCD);
	}
	
//Subtracting		
	
	public void subtract(){
		int negImpF1Num;
		int negImpF2Num;
		int negLCD = calculateLCD(F1, F2);
		negImpF1Num = calculateNumWithWhole(Math.abs(F1.getWholeNum()), Math.abs(F1.getNumerator()),
				Math.abs(F1.getDenom()));
		negImpF1Num = negLCD / Math.abs(F1.getDenom()) * negImpF1Num;
		negImpF2Num = calculateNumWithWhole(Math.abs(F2.getWholeNum()), Math.abs(F2.getNumerator()),
				Math.abs(F2.getDenom()));
		negImpF2Num = negLCD / Math.abs(F2.getDenom()) * negImpF2Num;
		if (GUIFrame.isNeg1 == true) {
			negImpF1Num *= -1;
		}

		if (GUIFrame.isNeg2 == true)
			negImpF2Num *= -1;

		setImproperNum(negImpF1Num - negImpF2Num);
		super.setWholeNum(this.improperNum / negLCD);
		super.setDenom(negLCD);
		if (super.getWholeNum() != 0)
			super.setNumerator(Math.abs(this.improperNum % negLCD));
		else
			super.setNumerator(this.improperNum % negLCD);
	}
	
//Multiplying	
	
	public void multiply(){
		int multF1Num = calculateNumWithWhole(Math.abs(F1.getWholeNum()), Math.abs(F1.getNumerator()),
				Math.abs(F1.getDenom()));

		int multF2Num = calculateNumWithWhole(Math.abs(F2.getWholeNum()), Math.abs(F2.getNumerator()),
				Math.abs(F2.getDenom()));
		if (GUIFrame.isNeg1 == true) {
			multF1Num *= -1;
		}

		if (GUIFrame.isNeg2 == true)
			multF2Num *= -1;

		setImproperNum(multF1Num * multF2Num);

		super.setDenom(Math.abs(F1.getDenom()) * Math.abs(F2.getDenom()));
		super.setWholeNum(this.improperNum / this.getDenom());
		if (super.getWholeNum() != 0)
			super.setNumerator(Math.abs(this.improperNum % this.getDenom())); // for
																				// proper
																				// mode
		else
			super.setNumerator(this.improperNum % this.getDenom());
	}
	
//Dividing	
	
	public void divide(){
		int F1LargeNum = calculateNumWithWhole(Math.abs(F1.getWholeNum()), Math.abs(F1.getNumerator()),
				Math.abs(F1.getDenom()));

		int F2LargeNum = calculateNumWithWhole(Math.abs(F2.getWholeNum()), Math.abs(F2.getNumerator()),
				Math.abs(F2.getDenom()));
		if (GUIFrame.isNeg1 == true && GUIFrame.isNeg2 == true) {
			F1LargeNum *= 1;
		} else if (GUIFrame.isNeg1 == true || GUIFrame.isNeg2 == true) {
			F1LargeNum *= -1;
		}
//If the second fraction evaluates to zero, then prompt the user to change values
		
		if (F2LargeNum == 0) {
			GUIFrame.Console.setText(Messages.NO_ZERO);

			return;
		} else {
			GUIFrame.Console.setText("");

		}

		setImproperNum(F1LargeNum * Math.abs(F2.getDenom()));
		super.setDenom(Math.abs(F1.getDenom()) * Math.abs(F2LargeNum));
		super.setWholeNum(this.improperNum / this.getDenom());
		if (super.getWholeNum() != 0)
			super.setNumerator(Math.abs(this.improperNum % this.getDenom())); // for
																				// proper
																				// mode
		else
			super.setNumerator(this.improperNum % this.getDenom());
	}

	public Fraction getF1() {
		return F1;
	}

	public void setF1(Fraction f1) {
		F1 = f1;
	}

	public Fraction getF2() {
		return F2;
	}

	public void setF2(Fraction f2) {
		F2 = f2;
	}

	public int getImproperNum() {
		return improperNum;
	}

	public void setImproperNum(int improperNum) {
		this.improperNum = improperNum;
	}

}