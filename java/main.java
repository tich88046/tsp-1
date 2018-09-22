//package tsp;
import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		int i=0;
		ArrayList<City> cities=new ArrayList<City>();
		File data=new File("../data/cities.csv");
		try {
		BufferedReader br = new BufferedReader(new FileReader(data));
		String st;
		
		while ((st = br.readLine()) != null){
			if(i!=0){
				String [] temp=st.split(" ");
				cities.add(new City((int)Double.parseDouble(temp[0]),Double.parseDouble(temp[1]),Double.parseDouble(temp[2])));
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


		GA test2=new GA(500000,s);
		Arrays.sort(test2.population);
		Sol b=new Sol(citiesArr);


		//j is generation count
		for(int j=0;j<100;j++){
			System.out.println("Generation: "+j);
			test2.repopulate();

			System.out.println("Your best solution: ");
			System.out.println(test2.population[0]);
		}



	}


}
