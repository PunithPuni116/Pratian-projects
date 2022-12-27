package Basics;

public class ChemicalfreeFarming {
	
	public static void main(String[] args) {
		int totalLand=80;
		int segment=80/5;
		//Tomato
		long tomatoSales=(long) (0.3*segment*1000*10*7+ 0.7*segment*12*1000*7);
		//potato
		long potatoSales=10*1000*20*segment;
		//cabbage
		long cabbageSales=segment*14*1000*24;
		//sunflower
		long sunflowerSales=700*segment*200;
		//sugarcane
		long sugarcaneSales=45*segment*4000;
		
		long totalSales=tomatoSales+potatoSales+cabbageSales+sunflowerSales+sugarcaneSales;
		
		System.out.println("total Sales = "+totalSales);
		long sugarcane1=(45/4)*16*4000;
		//his sales realisation from chemical-free farming at the end of 11 months?
		long salesAfterChemicalFree=tomatoSales+cabbageSales+potatoSales+sunflowerSales+sugarcane1;
		System.out.println("Sales from chemical-free farming at the end of 11 months= "+salesAfterChemicalFree);
		
	}
}
