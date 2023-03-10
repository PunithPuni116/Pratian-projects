public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................	
		return cellId%8;

			// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		return cellId/8;
			// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		for(int i=0;i<placedQueens[col].length;i++) {
			if(placedQueens[i][col]==true)
				return false;
		}
		for(int i=0;i<placedQueens[row].length;i++) {
			if(placedQueens[row][i]==true)
				return false;
		}
		
		
		if(placedQueens[row][col]==true)
			return false;
		else {
			placedQueens[row][col]=true;
			numQueens++;
		}
		return isValid;
		
	}
}














