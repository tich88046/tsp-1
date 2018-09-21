public class City{
	public int id;
	public double x;
	public double y; 

	City(int id,double x, double y){
		this.id=id;
		this.x=x;
		this.y=y;
	}

	public String toString(){
		String s="City id: "+this.id+" X Coord: "+this.x+" Y Coord: "+this.y;
		return s;
	}

	public boolean equals(City a){
		if(this.id==a.id&&this.x==a.x&&this.y==a.y){
			return true;
		}
		else{
			return false; 
		}
	}
}