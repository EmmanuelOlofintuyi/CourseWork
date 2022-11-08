package prob1;

import java.util.Comparator;

public class MartianIdComparator implements Comparator<Martian>{
	
	
	public int compare(Martian a, Martian b) {
		return a.getId() - b.getId();
	}
	

}
