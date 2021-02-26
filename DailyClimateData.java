import java.util.Date;

/**
 * ...
 * 
 * @author Elliot Parker
 *
 * @version 25/02/2021
 *
 */
public class DailyClimateData 
{
    private Date date;

    private double dailyRainfall;
    private double hourlyTemperature[] = new double[24];
    private double hourlyPressure[] = new double[24];

    public DailyClimateData(double dailyRainfall, double[] hourlyTemperature, double[] hourlyPressure) {
        this.dailyRainfall = dailyRainfall;
        this.hourlyTemperature = hourlyTemperature;
        this.hourlyPressure = hourlyPressure;
        date = new Date();
    }

	/**
	 * Method to get dailyRainfall value for this object.
     * 
	 * @return The daily rainfall in millimeters
	 */
	public double getDailyRainfall()
	{
		return dailyRainfall;
	}

    /**
	 * Method to get hourlyTemperature value for this object.
     * 
     * @param hour The hour of day to retrieve (1-24)
	 * @return The hourly temperatures in degrees celcius, in array form per hour of the day
	 */
	public double getHourlyTemperature(int hour)
	{
		return hourlyTemperature[hour - 1];
	}

    /**
	 * Method to get hourlyPressure value for this object.
     * 
     * @param hour The hour of day to retrieve (1-24)
	 * @return The hourly pressure in hPa, in array form per hour of the day
	 */
	public double getHourlyPressure(int hour)
	{
		return hourlyPressure[hour - 1];
	}

    /**
	 * Method to get highest hourlyTemperature value for this object.
     * 
	 * @return The highest hourly temperature in degrees celcius, for this object
	 */
	public double getMaxTemperature()
	{
		double maxTemp = hourlyTemperature[0];
        for(double temp : hourlyTemperature) {
            if(temp > maxTemp) {
                maxTemp = temp;
            }
        }
        return maxTemp;
	}

    /**
	 * Method to get lowest hourlyTemperature value for this object.
     * 
	 * @return The lowest hourly temperature in degrees celcius, for this object
	 */
	public double getMinTemperature()
	{
		double minTemp = hourlyTemperature[0];
        for(double temp : hourlyTemperature) {
            if(temp < minTemp) {
                minTemp = temp;
            }
        }
        return minTemp;
	}
}
