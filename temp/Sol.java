//package tsp;

public class Sol {
	public City [] path;
	public double fitness;
//README!! All 100 must be chaanged to arry size
	Sol(City [] input){
		this.path=input;
		int n =this.path.length;
		double fit=0;

		for(int i=0;i<(n);i++){
			fit=fit+distance(input[i],input[(i+1)%(n)]);
		}
		this.fitness=fit; 
	}
	public static double distance(City a, City b){
		return (Math.sqrt(Math.pow(b.x-a.x,2)+Math.pow(b.y-a.y,2)));
	}

	public String toString(){
		String s="";
		for(int i=0;i<this.path.length;i++){
			s=s+this.path[i].id+",";
		}
		//eventually get rid of the last comma for ocd reasons
		return( "Path: "+s+" Fitness: "+this.fitness);
	}

}


