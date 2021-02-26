/**
 * Test harness for the ClimateUtilities class
 * 
 * @author Kathryn Merrick
 *
 * @version 24/2/2015
 *
 */
public class ClimateUtilitiesTestHarness 
{
	/**
	 * Method to test the convertToCelsius(.) method of
	 * ClimateUtilities.
	 */
	public void testConvertToCelsius()
	{
		System.out.println("Starting test of ClimateUtilities.ConvertToCelsius(.) method");
		for(int temp=10; temp<100; temp++)
			System.out.println(" Testing input " + temp + ": ouput is: " + ClimateUtilities.ConvertToCelsius(temp));
		System.out.println("Finished testing ClimateUtilities.ConvertToCelsius(.) method");
	}
	
	/**
	 * Method to test the convertToFahrenheit(.) method of
	 * ClimateUtilities.
	 */
	public void testConvertToFahrenheit()
	{
		System.out.println("Starting test of ClimateUtilities.ConvertToFahrenheit(.) method");
		System.out.println(" Testing input " + 10 + ": ouput is: " + ClimateUtilities.ConvertToFahrenheit(10));
		System.out.println(" Testing input " + 0 + ": ouput is: " + ClimateUtilities.ConvertToFahrenheit(0));
		System.out.println(" Testing input " + -10 + ": ouput is: " + ClimateUtilities.ConvertToFahrenheit(-10));
		System.out.println(" Testing input " + 10.12 + ": ouput is: " + ClimateUtilities.ConvertToFahrenheit(10.12));
		System.out.println("Finished testing ClimateUtilities.ConvertToFahrenheit(.) method");
	}
	
	/**
	 * Method to test the calculateAverageTemperature(.) method of
	 * ClimateUtilities.
	 */
	public void testCalculateAverageTemperature()
	{
		System.out.println("Starting test of ClimateUtilities.CalculateAverageTemperature(.) method");
		double testCase1[] = new double[3]; testCase1[0] = 10d; testCase1[1] = 20d; testCase1[2] = 30d;
		System.out.println(" Testing input " + "[10,20,30]" + ": ouput is: " + ClimateUtilities.CalculateAverageTemperature(testCase1));
		double testCase2[] = new double[1]; testCase2[0] = 10d;
		System.out.println(" Testing input " + "[10]" + ": ouput is: " + ClimateUtilities.CalculateAverageTemperature(testCase2));
		double testCase3[] = new double[0];
		System.out.println(" Testing input " + "[]" + ": ouput is: " + ClimateUtilities.CalculateAverageTemperature(testCase3));
		double testCase4[] = new double[1]; testCase4[0] = 0d;
		System.out.println(" Testing input " + "[0]" + ": ouput is: " + ClimateUtilities.CalculateAverageTemperature(testCase4));
		System.out.println("Finished testing ClimateUtilities.CalculateAverageTemperature(.) method");
	}
	
	/**
	 * Run the test harness - to exercise the three methods of ClimateUtilities.
	 * @param args No arguments required.
	 */
	public static void main(String[] args)
	{
		ClimateUtilitiesTestHarness harness = new ClimateUtilitiesTestHarness();
		harness.testConvertToCelsius();
		harness.testConvertToFahrenheit();
		harness.testCalculateAverageTemperature();
	}

}
