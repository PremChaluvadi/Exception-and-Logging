package exceptionlogging;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
public class Compound_interest 
{
	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(Compound_interest.class);
	double principle;
	int years;
	double rate;
	public Compound_interest(double principle,double rate,int years)
	{
		this.principle=principle;
		this.rate=rate;
		this.years=years;
	}
	public double calculateCI()
	{
		double result;
		result=principle*Math.pow((1+(rate/100)),years);
		result=result-principle;
		LOGGER.info(result);
		LOGGER.error("There will be corrrection");
		LOGGER.warn("there is something wrong in code");
		LOGGER.fatal("there is any case of abort");
		return result;
	}
}