import java.util.Random;
public class GA{
	public Sol [] population;

	GA(int n,Sol data){
		population=new Sol[n];
		Random rand=new Random();
		int i =0;
		System.out.println("Begin GA");
		while(i < population.length){
			population[i]=swapCity(rand.nextInt(data.path.length),rand.nextInt(data.path.length),data);
			//System.out.println(population[i]);

			i++;

		}
	}
	public static Sol swapCity(int i,int j, Sol solution){
		//copies the solution and outputs a new Sol with the intended swap
		//create out of index error
		City [] tempArr=solution.path.clone();
		City temp=tempArr[i];
		tempArr[i]=tempArr[j];
		tempArr[j]=temp;
		return new Sol(tempArr);
	}


}
