import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

class CustomNumberPuzzleControl extends NumberPuzzleControl {
	public int getWidth() {
		return 200;
	}
	public int getHeight() {
		return 250;
	}
	public int getXPosition() {
		return 200;
	}
	public int getYPosition() {
		return 200;
	} 
	public String getTitle(){
		return "Number Puzzle";
	}
	public int getShuffleButtonFontSize() {
		return 12;
	}
	public int getNumbersFontSize() {
		return 12;
	}
	public Color getEmptyButtonColor() {
		return Color.WHITE;
	}
	public String getWinnerMessage() {
		return "Congrats, you have won!";
	}

	// The following three methods have to be written by the participants...

	public int handleButtonClicked(NumberPuzzleGame game){
		int emptyCellId = game.getEmptyCellId();
		Button buttonClicked = game.getButtonClicked();
		Button[] buttons = game.getButtons();
		
		//Your logic here
		int temp=-1;
		for(int i=0;i<buttons.length;i++) {
			if(buttons[i]==buttonClicked) {
				temp=i;
				break;
			}
		}
		
		if((temp+1==emptyCellId || temp-4==emptyCellId) || (emptyCellId+1==temp && emptyCellId+1<buttons.length) || (temp+4==emptyCellId && temp+4<buttons.length)) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId=temp;
		}
		return emptyCellId;

	}
	public int[] getRandomNumbersForGrid() {
		int arr[] = new int[15];
		
		//Your logic here
//		for(int i=0;i<arr.length;i++)
//			arr[i]=i+1;
		Random randNum = new Random();
	      Set<Integer>set = new LinkedHashSet<Integer>();
	      int i=0;
	      while (set.size() < 15 && i<15) {
	    	  int d=randNum.nextInt(15)+1; 
	         if(!set.contains(d)) {
	        	 set.add(d);
	        	 arr[i]=d;
	        	 i++;
	         }
	         
	      }
	
		return arr;
	}
	public boolean checkForWinner(Button[] buttons)
	{
		boolean winner = true;
		
		// Your Logic here
		int[] arr=getIntegerArrayOfButtonIds(buttons);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				winner=false;
			}
		}

		return winner;
	}
}