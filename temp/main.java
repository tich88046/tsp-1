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
		/*
		System.out.println(s);
		Sol t=GA.swapCity(0,1,s);
		System.out.println( s );
		System.out.println(t);
		int test=citiesArr.length;
		System.out.println(test); 
		*/

		GA test2=new GA(10,s);
		Arrays.sort(test2.population);

		int count=0;
		while(count<test2.population.length){
			System.out.println(test2.population[count].fitness);
			count++;
		}
		Sol b=new Sol(citiesArr);
		//b=GA.swapCity(0,1,s);
		//b=GA.swapCity(0,1,b);
		System.out.println(b.equals(s));
		System.out.println(b.fitness==s.fitness);
		Map dict=new HashMap();
		dict.put(s,100);
		//dict.put(b,200);
		System.out.println(dict.get(b));
		System.out.println(b.compareTo(s));
		//test2.weights();
//population
		/*
		Sol [] pop= new Sol [10];
		for(int j=0;j<10;j++){
			pop[j]=s;
		}
		for(int j=0;j<10;j++){
			System.out.println(pop[j].fitness);
		}
		*/

	}


}
