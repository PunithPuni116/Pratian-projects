public class ChessBoardRenderer {
	
	public boolean isBlackSquare(int square) {

		
		
		
		int column=square/8;
		if((column&1)!=1) {
			
			if((square%2)==0)
				return false;
		}
		else {
			if(square%2!=0)
				return false;
		}
			
			
		System.out.println(square);
		return true;
	}
}
