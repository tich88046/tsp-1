//package tsp;

class Sol implements Comparable<Sol>{
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


	public int compareTo(Sol a){
		return (int)Math.round((this.fitness-a.fitness)*10000000);
	}
	public String toString(){
		String s="";
		for(int i=0;i<this.path.length;i++){
			s=s+this.path[i].id+",";
		}
		//eventually get rid of the last comma for ocd reasons
		return( "Path: "+s+" Fitness: "+this.fitness);
	}
	public boolean equals(Object a){
		Sol temp=(Sol) a;
		//check term by term of array
		boolean same=true;
		if(this.path.length!=temp.path.length){
			same=false;
			return same;
		}
		int i=0;
		while(i<this.path.length){
			if(!this.path[i].equals(temp.path[i])){
				same=false;
			}
			i++;
		}
		return same;

	}
	public int hashCode(){
		return (int)Math.round(this.fitness);
	}

}


