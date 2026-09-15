public class time{
	public static void main(String[] arg){
		int hour=14;
		int min=28;
		int second = hour * 3600 + min * 60;
		double seconds=second;
		int timeToMidnight= 24 * 3600 - second;
		double percentOfday= seconds/(24 * 3600)*100;
		System.out.println("Time since midnight: " + second + "s"); 
		System.out.println("Time till midnight: " + timeToMidnight + "s"); 
		System.out.println("Precent of the day passed: " + percentOfday + "%");
		hour=14;
		min=43;
		second= hour * 3600 + min * 60;
		int timeElapsed= second - hour * 3600;
		System.out.println("Time elapsed since class start " + timeElapsed + "s");
	}
}
