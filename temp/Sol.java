//package tsp;

public class Sol {
	public City [] path;
	public double fitness;

	public static double distance(City a, City b){
		return (Math.sqrt(Math.pow(b.x-a.x,2)+Math.pow(b.y-a.y,2)));
	}
}


