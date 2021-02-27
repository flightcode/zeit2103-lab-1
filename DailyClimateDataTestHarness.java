/**
 * Test harness for the DailyClimateData class
 * 
 * @author Elliot Parker
 *
 * @version 27/2/2021
 *
 */
public class DailyClimateDataTestHarness 
{
	/**
	 * Method to test the getDailyRainfall(.) method of
	 * DailyClimateData.
     * 
     * @param data DailyClimateData object to run test function on.
	 */
	public void testGetDailyRainfall(DailyClimateData data)
	{
		System.out.println("Starting test of DailyClimateData.getDailyRainfall(.) method");
		System.out.println(" Testing input DailyClimateData Object 'data': ouput is: " + data.getDailyRainfall());
		System.out.println("Finished testing DailyClimateData.getDailyRainfall(.) method");
	}
	
	/**
	 * Method to test the getHourlyTemperature(.) method of
	 * DailyClimateData.
     * 
     * @param data DailyClimateData object to run test function on.
	 */
	public void testGetHourlyTemperature(DailyClimateData data)
	{
		System.out.println("Starting test of DailyClimateData.getHourlyTemperature(.) method");
		System.out.println(" Testing input DailyClimateData Object 'data' hour " + 6 + ": ouput is: " + data.getHourlyTemperature(6));
		System.out.println(" Testing input DailyClimateData Object 'data' hour " + 12 + ": ouput is: " + data.getHourlyTemperature(12));
		System.out.println(" Testing input DailyClimateData Object 'data' hour " + 18 + ": ouput is: " + data.getHourlyTemperature(18));
		System.out.println(" Testing input DailyClimateData Object 'data' hour " + 24 + ": ouput is: " + data.getHourlyTemperature(24));
		System.out.println("Finished testing DailyClimateData.getHourlyTemperature(.) method");
	}

    /**
	 * Method to test the getHourlyPressure(.) method of
	 * DailyClimateData.
     * 
     * @param data DailyClimateData object to run test function on.
	 */
	public void testGetHourlyPressure(DailyClimateData data)
	{
		System.out.println("Starting test of DailyClimateData.getHourlyPressure(.) method");
		System.out.println(" Testing input DailyClimateData Object 'data' hour " + 6 + ": ouput is: " + data.getHourlyPressure(6));
		System.out.println(" Testing input DailyClimateData Object 'data' hour " + 12 + ": ouput is: " + data.getHourlyPressure(12));
		System.out.println(" Testing input DailyClimateData Object 'data' hour " + 18 + ": ouput is: " + data.getHourlyPressure(18));
		System.out.println(" Testing input DailyClimateData Object 'data' hour " + 24 + ": ouput is: " + data.getHourlyPressure(24));
		System.out.println("Finished testing DailyClimateData.getHourlyPressure(.) method");
	}

    /**
	 * Method to test the getMaxTemperature(.) method of
	 * DailyClimateData.
     * 
     * @param data DailyClimateData object to run test function on.
	 */
	public void testGetMaxTemperature(DailyClimateData data)
	{
		System.out.println("Starting test of DailyClimateData.getMaxTemperature(.) method");
		System.out.println(" Testing input DailyClimateData Object 'data': ouput is: " + data.getMaxTemperature());
		System.out.println("Finished testing DailyClimateData.getMaxTemperature(.) method");
	}

    /**
	 * Method to test the getMinTemperature(.) method of
	 * DailyClimateData.
     * 
     * @param data DailyClimateData object to run test function on.
	 */
	public void testGetMinTemperature(DailyClimateData data)
	{
		System.out.println("Starting test of DailyClimateData.getMinTemperature(.) method");
		System.out.println(" Testing input DailyClimateData Object 'data': ouput is: " + data.getMinTemperature());
		System.out.println("Finished testing DailyClimateData.getMinTemperature(.) method");
	}
	
	/**
	 * Run the test harness - to exercise the three methods of DailyClimateData.
	 * @param args No arguments required.
	 */
	public static void main(String[] args)
	{
		DailyClimateDataTestHarness harness = new DailyClimateDataTestHarness();
        double hourlyTemperature[] = {8d,8d,8d,8d,9d,10d,11d,12d,13d,14d,15d,16d,17d,18d,19d,19d,16d,14d,13d,14d,11d,10d,8d,8d};
        double hourlyPressure[] = {1020d,1021d,1022d,1022d,1022d,1022d,1023d,1021d,1020d,1018d,1022d,1023d,1022d,1022d,1021d,1022d,1022d,1020d,1018d,1021d,1022d,1019d,1022d,1021d};
        DailyClimateData data = new DailyClimateData(23, hourlyTemperature, hourlyPressure);
		harness.testGetDailyRainfall(data);
		harness.testGetHourlyTemperature(data);
		harness.testGetHourlyPressure(data);
		harness.testGetMaxTemperature(data);
		harness.testGetMinTemperature(data);
	}

}
