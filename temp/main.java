//package tsp;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		int i=0;
		ArrayList<City> cities=new ArrayList<City>();
		File data=new File("/Users/hunterlum/Desktop/tsp/data/cities.csv");
		try {
		BufferedReader br = new BufferedReader(new FileReader(data));
		String st;
		
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
		Sol s= new Sol(citiesArr);
		System.out.println(s);


	}

}
