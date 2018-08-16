//package tsp;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		
		ArrayList<City> cities=new ArrayList<City>();
		File data=new File("/Users/hunterlum/Desktop/tsp/data/cities.csv");
		try {
		BufferedReader br = new BufferedReader(new FileReader(data));
		String st;
		int i=0;
		while ((st = br.readLine()) != null){
			if(i!=0){
				String [] temp=st.split(" ");
				cities.add(new City((int)Double.parseDouble(temp[0]),Double.parseDouble(temp[1]),Double.parseDouble(temp[2])));
				//System.out.println(a);
				//mmcities[i-1]=a;
				//System.out.println(temp[0]);
				//System.out.println(i-1);
			}
			i++;
		}
		br.close();
		}
		catch(IOException e) {
			System.err.println("An IOException was caught :"+e.getMessage());
		}

		City [] citiesArr=cities.toArray(new City[cities.size()]);
		//if translated to C, you can delete cities
		Path one= new Path(citiesArr[1],citiesArr[2]);
		Map<Path,Double> dict= new HashMap<Path,Double>();
		dict.put(one,1.1);
		Path two= new Path(citiesArr[1],citiesArr[2]);
		
		System.out.println(one.from.id+" "+one.to.id+" "+two.from.id+" "+two.to.id+" ");
		System.out.println(one.equals(two));
		System.out.println(two.equals(one));
		System.out.println(dict.get(one));
		System.out.println(dict.get(two));	
		System.out.println(dict);	
		
		System.out.println(one.hashCode()+" "+two.hashCode());

	}

}
