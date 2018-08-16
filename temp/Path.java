public class Path{
	public City from;
	public City to;

	Path(City a, City b){
		this.from=a;
		this.to=b;
	}
	
	public String toString(){
		return(this.from + " to " + this.to);
	}
	public boolean equals(Path a){
		if(this.from.id == a.from.id && this.to.id==a.to.id){
			return true;
		}else if(this.from.id == a.to.id && this.to.id==a.from.id){
			return true;
		}
		else{
			System.out.println(this.from.id+" "+this.to.id+" "+a.from.id+" "+a.to.id+" ");
			return false;
		}
	}

	public int hashCode(){
		return 2;
	}
}
