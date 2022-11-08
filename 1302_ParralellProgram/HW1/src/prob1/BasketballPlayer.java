package prob1;

public class BasketballPlayer {
	private double freeThrowsPercent;
	private int freeThrowsAttempted;
	private int freeThrowsMade;
	private String name;
	private double threePointersPercent;
	private int threePointersAttempted;
	private int threePointersMade;
	private double twoPointersPercent;
	private int twoPointersAttempted;
	private int twoPointersMade;
 
		public BasketballPlayer(String name) {
			this.name = name;
		}
		
		public double getFreeThrowPercent() {
			return freeThrowsPercent; 	 
		}
		public int getFreeThrowsAttempted() {
			return freeThrowsAttempted;
		}
		
		public int getFreeThrowsMade() {
			return freeThrowsMade;
		}
		
		public String getName() {
			return name;
		}
		
		public double getThreePointerPercent() {
			return ((double)threePointersMade /  (double)threePointersAttempted) *100;	
		}		
		public int getThreePointersAttempted() {
			return threePointersAttempted;
		}
		
		public int getThreePointersMade() {
			return threePointersMade;
		}
		
		public double getTwoPointerPercent() {
			return (double)twoPointersMade /  (double)twoPointersAttempted*100;	
			//
		}
		
		public int getTwoPointersAttempted() {
			return twoPointersAttempted;
		}
		
		public int getTwoPointersMade() {
			return twoPointersMade;
		}

		public void shootFreeThrow(boolean isMade) {
			if (isMade) {
				freeThrowsMade ++;
			}
			freeThrowsAttempted ++;
			freeThrowsPercent = ( (double)freeThrowsMade /  (double)freeThrowsAttempted) *100;
		}

		public void shootThreePointer(boolean isMade) {
			if (isMade) {
				threePointersMade ++;	
			}
			threePointersAttempted ++;
		}
		
		public void shootTwoPointer(boolean isMade) {
			if (isMade) {
				twoPointersMade ++;	
			}
			twoPointersAttempted ++;
		}
		
		public int getTotalPoints(){
			return (twoPointersMade*2) + (threePointersMade*3) + freeThrowsMade;
		}
		
		public String toString() {
			//there was a /r on the first line a code
			//String.format("%0.2f", freeThrowPercent) try putting this at the end of output +=
			String output = "Player: " + name + ", points:12\n" ; 
				output += 	"Free Throws: made:" + freeThrowsMade + ", attempted:" + freeThrowsAttempted + ", percent:" + String.format("%.2f", getFreeThrowPercent())  ;
				output +=	"\n2 Pointers: made:" + twoPointersMade + ", attempted:" + twoPointersAttempted + ", percent:" + String.format("%.2f", getTwoPointerPercent())  ;
				output +=	"\n3 Pointers: made:" + threePointersMade + ", attempted:" + threePointersAttempted + ", percent:" + String.format("%.2f", getThreePointerPercent()) ;
			return output;
		}

}
