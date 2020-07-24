package simpleInterest1;

public class CompoundInterest {

	public double compoundinterest(double principleamount, double rate, double time) {
		double ci = principleamount * Math.pow(1.0+rate/100.0,time) - principleamount;
		return ci;
	}
}
