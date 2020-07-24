package simpleInterest1;

import java.util .*;
import java.util.logging.Logger; 

public class SICI {
	public static void main(String[] args) {
		double principleamount,rate,time;
	    Scanner sc = new Scanner (System. in);
	    Logger logger = Logger.getLogger(SICI.class.getName());
	    simpleInterest sim = new simpleInterest();
	    CompoundInterest cin = new CompoundInterest();
	    logger.info("Calculation of Simple Interest and Compound Interest!!!");
	    logger.info("Enter the principle amount:"); 
	    principleamount=sc.nextDouble();
	    logger.info("Enter the Time period:");
	    time=sc.nextDouble();
	    logger.info("Enter the Rate of Interest");
	    rate=sc.nextDouble();
	    logger.info("Simple Interest="+sim.simpleinterest(principleamount,time,rate));
	    logger.info("Compound Interest="+cin.compoundinterest(principleamount,rate,time));
	}

}
