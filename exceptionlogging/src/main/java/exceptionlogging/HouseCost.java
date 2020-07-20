package exceptionlogging;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
public class HouseCost 
{
	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(HouseCost.class);
	double area;
	double cost_per_sqmt;
	public HouseCost(double area,int standard,String automate)
	{
		this.area=area;
		switch(standard)
		{
			case 1:
				cost_per_sqmt=1200;
				break;
			case 2:
				cost_per_sqmt=1500;
				break;
			case 3:
				if(automate.equals("Yes"))
					cost_per_sqmt=2500;
				else
					cost_per_sqmt=1800;
				break;
		}
	}
	public double calculateCost()
	{
		double total;
		total=area*cost_per_sqmt;
		LOGGER.info(total);
		LOGGER.error("There will be corrrection");
		LOGGER.warn("there is something wrong in code");
		LOGGER.fatal("there is any case of abort");
		return total;
	}
}