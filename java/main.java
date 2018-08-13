//package tsp;
import java.io.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array=new int [101];
		double fit=1.1;
		Sol a=new Sol();
		a.path=array;
		a.fitness=fit;
		System.out.println(a.path );
		System.out.println(a.fitness);
		
		
		File data=new File("/Users/hunterlum/Desktop/tsp/data/cities.csv");
		try {
		BufferedReader br = new BufferedReader(new FileReader(data));
		String st;
		while ((st = br.readLine()) != null){
			System.out.println(st);
		}
		br.close();
		}
		catch(IOException e) {
			System.err.println("An IOException was caught :"+e.getMessage());
		}

	}

}
