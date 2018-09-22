//package tsp;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
//opening file and using buffer to write data into memory
//data  is the city array: citiesArr and the array list: cities
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
//converting cities to array called citiesArr
		City [] citiesArr=cities.toArray(new City[cities.size()]);
		//if translated to C, you can delete cities

//print test
		for(int j=0;j<100;j++){
			System.out.println(citiesArr[j]);
		}

		System.out.println(Sol.distance(citiesArr[1],citiesArr[2]));

	}

}