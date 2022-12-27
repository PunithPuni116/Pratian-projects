public class DecimalSplitter {
	static boolean isOdd(int num) {
//Complete the logic
		if((num&1)==1)
			return true;
		else
			return false;
	}
	static int getWhole(double num) {
//Complete the logic
		if(num<0)
			return -1*(int)num;
		return (int)num;
	}
	
	static double getFraction(double num) {
//Complete the logic
		if(num<0)
			return num+(int)num*-1;
		return num-(int)num;
	}
}









